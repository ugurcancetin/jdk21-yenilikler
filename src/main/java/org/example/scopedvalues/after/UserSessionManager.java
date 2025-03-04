package org.example.scopedvalues.after;

// ThreadLocal ile kullanıcı oturum yönetimi

public class UserSessionManager {

  private static final ScopedValue<UserSession> USER_SESSION = ScopedValue.newInstance();

  public static void executeWithSession(String username, String role, Runnable task) {
    ScopedValue.where(USER_SESSION, new UserSession(username, role)).run(task);
  }

  public static UserSession getSession() {
    return USER_SESSION.get();
  }
}
