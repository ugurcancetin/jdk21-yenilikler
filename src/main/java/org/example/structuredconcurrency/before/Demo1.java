package org.example.structuredconcurrency.before;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Sorunlar
//❌ Thread’leri Manuel Yönetmek Zorunda Kalıyoruz: Thread’lerin tamamlanmasını beklemek (get()) ve sonlandırmak (shutdown()) manuel olarak yapılmalı.
//❌ Hata Yönetimi Karmaşık: Eğer bir thread başarısız olursa, diğer thread’ler çalışmaya devam edebilir.
//❌ Otomatik Temizlik Yok: Thread’leri düzgün bir şekilde kapatmazsak, resource leak (kaynak sızıntısı) olabilir.
public class Demo1 {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    Future<String> task1 = executor.submit(() -> {
      Thread.sleep(1000);
      return "Task 1 completed";
    });

    Future<String> task2 = executor.submit(() -> {
      Thread.sleep(2000);
      return "Task 2 completed";
    });

    try {
      System.out.println(task1.get()); // Task 1'in tamamlanmasını bekler
      System.out.println(task2.get()); // Task 2'nin tamamlanmasını bekler
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    } finally {
      executor.shutdown(); // Manuel olarak thread'leri kapatmamız gerekiyor
    }
  }

}
