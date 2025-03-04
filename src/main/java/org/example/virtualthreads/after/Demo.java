package org.example.virtualthreads.after;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

  //Avantajlar
  //✅ Milyonlarca Thread Çalıştırabiliriz:
  //OS thread'lerinde olduğu gibi belirli sayıda thread oluşturmak yerine, her görev için yeni bir Virtual Thread açılabilir.
  //
  //✅ Bloklama Sorunu Ortadan Kalkıyor:
  //Thread bloklanırsa, JVM başka bir iş parçacığını çalıştırır.
  //
  //✅ Daha Az Bellek Kullanımı:
  //OS thread başına 1MB bellek yerine, Virtual Threads çok daha hafiftir.
  //
  //✅ ExecutorService ile Uyumlu:
  //Mevcut thread yönetimi kodlarını kolayca Virtual Threads ile değiştirebiliriz.
  public static void main(String[] args) {
    // Virtual Thread Executor
    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

      for (int i = 0; i < 1_000; i++) {
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
    }
  }
}
