package org.example.scopedvalues.before;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
  //❌ Sorunlar:
  //ThreadLocal.remove() çağrılmayı unutursak bellek sızıntısı olur!
  //Thread’ler havuzda tekrar kullanıldığında eski kullanıcı bilgisi kalabilir!
  //Virtual Thread’lerle verimli çalışmaz.
  //Kodun okunabilirliği ve yönetimi zor
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    Runnable task = () -> {
      UserSessionManager.startSession("Alice", "ADMIN"); // Kullanıcı oturumu başlat
      new UserService().processRequest();
      UserSessionManager.clearSession(); // Oturumu temizle (Unutulursa bellek sızıntısı olur!)
    };

    Runnable task2 = () -> {
      UserSessionManager.startSession("Ugurcan", "ADMIN"); // Kullanıcı oturumu başlat
      new UserService().processRequest();
      UserSessionManager.clearSession(); // Oturumu temizle (Unutulursa bellek sızıntısı olur!)
    };

    executor.submit(task);
    executor.submit(task2);

    executor.shutdown();
  }
}
