package org.example.vectorapi.after;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class Demo2 {

  public static void main(String[] args) {
    int[] array = new int[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    VectorSpecies<Integer> species = IntVector.SPECIES_PREFERRED;
    int length = array.length;

    int i = 0;
    for (; i <= length - species.length(); i += species.length()) {
      IntVector vector = IntVector.fromArray(species, array, i);
      vector.mul(2).intoArray(array, i); // SIMD ile çarpma işlemi
    }

    // Kalan elemanları tek tek çarp
    for (; i < length; i++) {
      array[i] *= 2;
    }

    System.out.println("First element: " + array[0] + ", Last element: " + array[array.length - 1]);
  }
}
