package org.example.sequencedcollection.before;

import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    List<String> list = List.of("A", "B", "C", "D");

    //list.get(0) ve list.get(list.size() - 1) gereksiz derecede uzun ve okunması zor.
    String first = list.get(0);  // İlk eleman
    String last = list.get(list.size() - 1);  // Son eleman

    System.out.println("First: " + first);
    System.out.println("Last: " + last);



    Deque<String> deque = new LinkedList<>();
    deque.add("A");
    deque.add("B");
    deque.add("C");
    deque.add("D");

    //getFirst() ve getLast() kullanımı, List ile tutarsız.
    String first1 = deque.getFirst();
    String last1 = deque.getLast();

    System.out.println("First: " + first1);
    System.out.println("Last: " + last1);


    //---------------------------------------
    // Eleman Ekleme

    List<String> list2 = new LinkedList<>(List.of("B", "C", "D"));

    list2.add(0, "A");  // İlk eleman olarak ekleme
    list2.add("E");     // Son eleman olarak ekleme

    System.out.println(list);

    Set<String> set2 = new LinkedHashSet<>();
    set2.add("B");
    set2.add("C");
    set2.add("D");

    // İlk eleman olarak A'yı ekleyemiyoruz (Set başa eklemeye izin vermez!)
    System.out.println(set2);


  }
}
