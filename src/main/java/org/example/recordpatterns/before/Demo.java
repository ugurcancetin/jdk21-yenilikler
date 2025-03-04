package org.example.recordpatterns.before;

record Person(String name, int age) {

}

record Circle(double radius) {

}

record Rectangle(double width, double height) {

}

public class Demo {

  public static void main(String[] args) {
    Object obj = new Person("Alice", 25);

    //instanceof kontrolü yaptıktan sonra cast etmek zorundayız.
    //Gereksiz değişkenler tanımlıyoruz (Person person = (Person) obj).
    //Okunabilirlik düşük.
    if (obj instanceof Person) {
      Person person = (Person) obj; // Manuel cast işlemi
      String name = person.name();
      int age = person.age();
      System.out.println("Name: " + name + ", Age: " + age);
    }

    printShapeInfo(new Circle(5));
    printShapeInfo(new Rectangle(4, 6));
  }

  static void printShapeInfo(Object shape) {
    //case Circle c -> içinde hala c.radius() yazmak zorundayız.
    switch (shape) {
      case Circle c -> System.out.println("Circle with radius: " + c.radius());

      case Rectangle r ->
          System.out.println("Rectangle with width: " + r.width() + ", height: " + r.height());

      default -> System.out.println("Unknown shape");
    }
  }
}
