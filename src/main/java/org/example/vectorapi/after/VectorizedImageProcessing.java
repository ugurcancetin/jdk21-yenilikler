package org.example.vectorapi.after;

import java.util.Random;
import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorizedImageProcessing {

  static final int SIZE = 10_000_000; // 10 milyon piksel
  static final int INCREMENT = 20; // Parlaklık artırımı
  static int[] image = new int[SIZE];

  static {
    Random random = new Random();
    for (int i = 0; i < SIZE; i++) {
      image[i] = random.nextInt(256);
    }
  }

  public static void scalarBrightness() {
    long startTime = System.nanoTime();
    for (int i = 0; i < SIZE; i++) {
      image[i] = Math.min(image[i] + INCREMENT, 255);
    }
    long endTime = System.nanoTime();
    System.out.println("Scalar Processing Time: " + (endTime - startTime) / 1_000_000 + " ms");
  }

  public static void vectorizedBrightness() {
    VectorSpecies<Integer> species = IntVector.SPECIES_PREFERRED;
    long startTime = System.nanoTime();
    int i = 0;
    for (; i <= SIZE - species.length(); i += species.length()) {
      IntVector vector = IntVector.fromArray(species, image, i);
      IntVector result = vector.add(INCREMENT).min(255);
      result.intoArray(image, i);
    }
    for (; i < SIZE; i++) {
      image[i] = Math.min(image[i] + INCREMENT, 255);
    }
    long endTime = System.nanoTime();
    System.out.println("Vector Processing Time: " + (endTime - startTime) / 1_000_000 + " ms");
  }

  public static void main(String[] args) {
//    scalarBrightness();
    vectorizedBrightness();
  }
}
