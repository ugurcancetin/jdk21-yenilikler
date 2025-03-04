package org.example.virtualthreads.before;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

  //Sorunlar:
  //Thread Havuzu Sınırlı: 100 görev gönderdik ama sadece 10 thread ile çalıştırabiliyoruz.
  //Yüksek Bellek Tüketimi: OS thread’leri ağırdır.
  //Thread Bloklandığında Boşa Beklenir: Thread.sleep() veya I/O işlemleri sırasında thread kullanılamaz.
  public static void main(String[] args) {
    // Sabit boyutlu thread havuzu (10 thread çalışabilir)
    ExecutorService executor = Executors.newFixedThreadPool(10);

    for (int i = 0; i < 1000; i++) {
      int taskId = i;
      executor.submit(() -> {
        System.out.println("Task " + taskId + " is running on " + Thread.currentThread());
        try {
          Thread.sleep(1000); // Simüle edilen uzun işlem
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }

    executor.shutdown();
  }
}
