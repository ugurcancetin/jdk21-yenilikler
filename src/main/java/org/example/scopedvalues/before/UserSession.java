package org.example.scopedvalues.before;

public class UserSession {

  private final String username;
  private final String role;

  public UserSession(String username, String role) {
    this.username = username;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public String getRole() {
    return role;
  }
}
