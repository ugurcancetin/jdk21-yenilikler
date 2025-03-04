package org.example.scopedvalues.after;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

  public static void main(String[] args) {
    try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
      Runnable task = () -> UserSessionManager.executeWithSession("Alice", "ADMIN",
          () -> new UserService().processRequest());

      executor.submit(task);

      executor.shutdown();
    }
  }
}
