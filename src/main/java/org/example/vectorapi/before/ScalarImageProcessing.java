package org.example.vectorapi.before;

import java.util.Random;

public class ScalarImageProcessing {

  public static void main(String[] args) {
    int width = 1920, height = 1080;
    int[] image = new int[width * height]; // Siyah-beyaz görüntü (grayscale)
    Random random = new Random();

    // Rastgele piksel değerleri oluştur
    for (int i = 0; i < image.length; i++) {
      image[i] = random.nextInt(256); // 0 - 255 arasında rastgele parlaklık değerleri
    }

    long startTime = System.nanoTime();

    // Her pikselin parlaklığını 20 artır (scalar işlem)
    for (int i = 0; i < image.length; i++) {
      image[i] = Math.min(image[i] + 20, 255); // 255'ten büyük olmamalı
    }

    long endTime = System.nanoTime();
    System.out.println(
        "Scalar Image Processing Time: " + (endTime - startTime) / 1_000_000 + " ms");
  }
}
