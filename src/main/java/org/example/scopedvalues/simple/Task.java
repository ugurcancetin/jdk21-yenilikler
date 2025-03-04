package org.example.scopedvalues.simple;

public class Task {
  final static ScopedValue<String> VALUE = ScopedValue.newInstance();

  void doTask(){
    System.out.println("Task: " + VALUE.get());
  }

}
