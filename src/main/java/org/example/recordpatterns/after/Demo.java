package org.example.recordpatterns.after;

record Person(String name, int age) {

}

record Circle(double radius) {

}

record Rectangle(double width, double height) {

}

public class Demo {

  public static void main(String[] args) {
    Object obj = new Person("Alice", 25);

    //✔ Manuel Cast İşlemi Yok – instanceof içinde otomatik açma (destructure) yapılıyor.
    //✔ Daha Az Kod – Ekstra değişken tanımlamaya gerek kalmadı.
    //✔ Daha Okunaklı – Kod daha temiz ve anlaşılır.
    if (obj instanceof Person(String name, int age)) { // Record Pattern Kullanımı
      System.out.println("Name: " + name + ", Age: " + age);
    }

    printShapeInfo(new Circle(5));
    printShapeInfo(new Rectangle(4, 6));
  }

  static void printShapeInfo(Object shape) {
    switch (shape) {
      case Circle(double radius) -> System.out.println("Circle with radius: " + radius);

      case Rectangle(double width, double height) ->
          System.out.println("Rectangle with width: " + width + ", height: " + height);

      default -> System.out.println("Unknown shape");
    }
  }

  //📌 Record Patterns şu an method parametrelerinde DESTEKLENMİYOR!
//  static void printPerson(Person(String name, int age)){ // Record Patterns burada kullanıldı!
//    System.out.println("Name: " + name + ", Age: " + age);
//  }

}
