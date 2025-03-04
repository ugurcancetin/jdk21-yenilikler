package org.example.scopedvalues.after;

public class UserService {

  public void processRequest() {
    UserSession session = UserSessionManager.getSession();
    if (session != null) {
      System.out.println(Thread.currentThread() + " - Processing request for user: "
          + session.getUsername());
    } else {
      System.out.println(Thread.currentThread() + " - No active user session!");
    }
  }
}
