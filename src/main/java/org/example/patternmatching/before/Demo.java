package org.example.patternmatching.before;

public class Demo {

  static void printInfo(Object obj) {
    if (obj instanceof Human) {
      Human human = (Human) obj; // Manual casting
      System.out.println("Human: " + human.name + ", Age: " + human.age + " years");
    } else if (obj instanceof Dog) {
      Dog dog = (Dog) obj; // Manual casting
      int humanAge = dog.age * 7;
      System.out.println("Dog: " + dog.age + " dog years, " + humanAge + " human years");
    } else if (obj == null) {
      System.out.println("Object is null");
    } else {
      System.out.println("Unknown type");
    }
  }

  public static void main(String[] args) {
    printInfo(new Human("Alice", 25));
    printInfo(new Dog(5));
    printInfo("Random String");
    printInfo(null);
  }
}
