package org.example.vectorapi.after;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorOperators;
import jdk.incubator.vector.VectorSpecies;

public class Demo {

  public static void main(String[] args) {
    float[] array = new float[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i; // Örnek veri
    }

    VectorSpecies<Float> species = FloatVector.SPECIES_PREFERRED;
    int length = array.length;
    float sum = 0;

    int i = 0;
    for (; i <= length - species.length(); i += species.length()) {
      FloatVector vector = FloatVector.fromArray(species, array, i);
      sum += vector.reduceLanes(VectorOperators.ADD);
    }

    // Kalan elemanları tek tek topla (SIMD işlemine uymayan parçalar)
    for (; i < length; i++) {
      sum += array[i];
    }

    System.out.println("Total Sum: " + sum);
  }

}
