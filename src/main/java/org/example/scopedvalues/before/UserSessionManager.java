package org.example.scopedvalues.before;

// ThreadLocal ile kullanıcı oturum yönetimi

public class UserSessionManager {

  private static final ThreadLocal<UserSession> sessionThreadLocal = new ThreadLocal<>();

  public static void startSession(String username, String role) {
    sessionThreadLocal.set(new UserSession(username, role));
  }

  public static UserSession getSession() {
    return sessionThreadLocal.get();
  }

  public static void clearSession() {
    sessionThreadLocal.remove();
  }
}
