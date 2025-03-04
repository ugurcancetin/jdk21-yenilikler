package org.example.structuredconcurrency.after;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;

//Structured Concurrency’nin Sağladığı Avantajlar
//✅ Daha Kolay Yönetim: Structured Concurrency, iş parçacıklarını mantıksal bloklar içinde çalıştırarak yönetimi kolaylaştırır.
//✅ Otomatik Temizlik: try-with-resources bloğu sayesinde, scope kapanınca bağlı thread’ler otomatik olarak temizlenir.
//✅ Daha Güçlü Hata Yönetimi: Eğer bir görev hata verirse, tüm bağlı görevler otomatik olarak iptal edilir.
//✅ Daha Okunabilir Kod: Kod, iç içe geçmiş callback’ler yerine, düzgün bir şekilde organize edilmiştir.
public class Demo {

  public static void main(String[] args) {
    shutDownOnFailureExample();
    shutDownOnSuccessExample();
  }

  private static void shutDownOnFailureExample() {
    try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

      // İki alt görev oluştur
      StructuredTaskScope.Subtask<String> task1 = scope.fork(() -> {
        Thread.sleep(3000);
        return "Task 2 completed";

      });

      StructuredTaskScope.Subtask<String> task2 = scope.fork(() -> {
        Thread.sleep(2000);
        throw new RuntimeException();
      });

      // Tüm görevlerin tamamlanmasını bekle
      scope.join();

      // Sonuçları al
      System.out.println(task1.get());
      System.out.println(task2.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void shutDownOnSuccessExample() {
    try (var scope = new StructuredTaskScope.ShutdownOnSuccess<String>()) {

      // İki alt görev başlat
      StructuredTaskScope.Subtask<String> task1 = scope.fork(() -> {
        Thread.sleep(2000); // 2 saniye sürecek görev
        return "API 1 response";
      });

      StructuredTaskScope.Subtask<String> task2 = scope.fork(() -> {
        Thread.sleep(3000); // 1 saniye sürecek görev
        return "API 2 response";
      });

      // En hızlı tamamlanan görevin sonucunu al
      String result = scope.join().result();
      System.out.println("Fastest response: " + result);
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
}
