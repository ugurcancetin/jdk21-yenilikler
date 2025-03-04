package org.example.sequencedcollection.after;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {
    SequencedCollection<String> list = List.of("A", "B", "C", "D");

    //✔ Okunaklı Kod – list.getFirst() ve list.getLast() daha anlaşılır.
    //✔ Tüm Koleksiyonlar için Ortak API – Deque, List, Set gibi koleksiyonlarda aynı metotlar kullanılabilir.
    System.out.println("First: " + list.getFirst()); // İlk eleman
    System.out.println("Last: " + list.getLast());   // Son eleman
    System.out.println(list.reversed());

    SequencedSet<String> set = new LinkedHashSet<>();
    set.add("X");
    set.add("Y");
    set.add("Z");

    //✔ Sıralı Set'lerde getFirst() ve getLast() Kullanılabilir.
    //✔ Daha Okunaklı ve Daha Az Kod.
    System.out.println("First: " + set.getFirst());
    System.out.println("Last: " + set.getLast());


    SequencedMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "Bir");
    map.put(2, "İki");
    map.put(3, "Üç");

    //✔ Map’lerde İlk ve Son Elemanı Okumak Daha Kolay.
    System.out.println("First Entry: " + map.firstEntry());
    System.out.println("Last Entry: " + map.lastEntry());

    //---------------------------------------
    // Eleman Ekleme
    SequencedCollection<String> list2 = new ArrayList<>(List.of("B", "C", "D"));

    list2.addFirst("A"); // İlk elemanı ekle
    list2.addLast("E");  // Son elemanı ekle

    System.out.println(list2);

    SequencedSet<String> set2 = new LinkedHashSet<>();
    set2.add("B");
    set2.add("C");
    set2.add("D");

    set2.addFirst("A"); // İlk eleman olarak ekle
    set2.addLast("E");  // Son eleman olarak ekle

    System.out.println(set2);

  }
}
