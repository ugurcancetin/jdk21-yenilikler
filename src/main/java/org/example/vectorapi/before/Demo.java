package org.example.vectorapi.before;

public class Demo {

  public static void main(String[] args) {
    //❌ Sorunlar:
    //Her işlem, CPU’da tek tek çalışır (Scalar Processing).
    //Modern CPU’nun paralel işlem yapabilme yeteneğini kullanmaz.
    //Büyük veri kümelerinde yavaş çalışır.

    float[] array = new float[1000];
    for (int i = 0; i < array.length; i++) {
      array[i] = i; // Örnek veri
    }

    float sum = 0;
    for (float value : array) {
      sum += value; // Tek tek toplama işlemi (scalar işlem)
    }

    System.out.println("Total Sum: " + sum);
  }

}
