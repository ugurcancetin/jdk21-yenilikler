package org.example.scopedvalues.simple;

public class Demo {

  public static void main(String[] args) {
    ScopedValue.runWhere(Task.VALUE, "Hello World", () -> new Task().doTask());
  }

}
