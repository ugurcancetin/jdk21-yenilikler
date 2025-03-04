package org.example.recordpatterns.after;

record Address(String city, String country) {

}

record Contact(String name, int age, Address address) {

}

public class Demo2 {

  public static void main(String[] args) {
    Object obj = new Contact("Alice", 25, new Address("Istanbul", "Turkey"));

    //✔ İç içe Record’ları Otomatik Açabiliyoruz.
    //✔ Belirli Alanları Görmezden Gelebiliyoruz (_ ile country’yi atladık).
    if (obj instanceof Contact(String name, int age, Address(String city, _))) {
      System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
    }
  }
}
