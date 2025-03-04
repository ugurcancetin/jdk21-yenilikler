# 🚀 Java 21: Sequenced Collections (JEP 431 - Sıralı Koleksiyonlar)

Java 21 ile gelen Sequenced Collections (Sıralı Koleksiyonlar), koleksiyonlar (List, Set, Map) üzerinde daha tutarlı, okunabilir ve kolay manipülasyon sağlar.

Hadi önce neden bu özelliğe ihtiyacımız olduğunu anlayalım, ardından Java 21 öncesi ve sonrası kodları karşılaştıralım.

## 🛠️ Motivasyon: Neden Sequenced Collections?
Java'daki List, Set ve Map gibi koleksiyonlar sıralı (ordered) olsa da her biriyle önceki ve son elemanları almak farklı yöntemler gerektiriyordu.

- ❌ Karmaşık ve Tutarsız API

List içinde ilk (first) ve son (last) elemanı almak kolaydı ama Deque veya NavigableSet içinde aynı işlemi yapmak daha zordu.

- ❌ Okunabilirliği Zayıf Kod

Koleksiyonun başındaki ve sonundaki elemanları almak için farklı yöntemler kullanmak gerekiyordu.

- ❌ Gereksiz get() ve iterator() Kullanımı

İlk ve son elemanı almak için manuel olarak get(0), list.size()-1 veya iterator().next() gibi işlemler yapılıyordu.


![sequencedcollection.png](..%2F..%2F..%2F..%2Fresources%2Fsequencedcollection.png)