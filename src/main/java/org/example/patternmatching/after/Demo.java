package org.example.patternmatching.after;

// Define Human and Dog as Records (Java 21+)
record Human(String name, int age) {

}

record Dog(int age) {

}

public class Demo {

  static void printInfo(Object obj) {
    switch (obj) {
      case Human(_, var age) ->  // Using unnamed pattern to skip 'name'
          System.out.println("Human: Age " + age + " years");

      case Dog(var age) -> {
        int humanAge = age * 7;
        System.out.println("Dog: " + age + " dog years, " + humanAge + " human years");
      }

      case  null -> System.out.println("Object is null");

      default -> System.out.println("Unknown type");
    }
  }

  public static void main(String[] args) {
    printInfo(new Human("Alice", 25));
    printInfo(new Dog(5));
    printInfo("Random String");
    printInfo(null);
  }
}
