package org.example.scopedvalues.before;

public class UserService {

  public void processRequest() {
    UserSession session = UserSessionManager.getSession();
    if (session != null) {
      System.out.println("Processing request for user: " + session.getUsername());
    } else {
      System.out.println("No active user session!");
    }
  }
}
