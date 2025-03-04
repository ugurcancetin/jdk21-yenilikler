# 🚀 Java 21 ile Gelen Yenilikler

Hayatımıza en son LTS sürümü olarak giren Java 21 bizlere önemli yeni özellikler tanıttı. 
Bu kaynaktan en iyi şekilde fayladanabilmek için: 

* Önce her readMe.md dosyanısını oku
* Daha sonrasında before paketinin altında bulunan örneği incele
* After paketinde olan örnek ile karşılaştırırak yeniliği öğren. 

Her konu hakkında örnek olmayabilir. Başlıca nedeni ise o özelliğin henüz stabil olmaması veya Java'nın kendi API'sinde ulaşamamızdır. Java24 ile o konularda ele alınacaktır :)

## Ana Yenilikler:

1. Unnamed Classes and Instance Main Methods (İsimsiz Sınıflar ve Ana Metotlar)
   Küçük ve tek dosyalık uygulamalar için gereksiz boilerplate kodunu azaltır.
   public static void main(String[] args) yerine doğrudan bir main bloğu yazılabilir.
2. Unnamed Patterns and Variables (İsimsiz Değişkenler ve Pattern'ler)
   _ (alt tire) kullanarak ilgilenmediğimiz değişkenleri atlayabiliriz.
   Pattern Matching içindeki gereksiz değişken atamalarını kaldırarak kodu daha temiz hale getirir.
3. Foreign Function & Memory API (FFM API)
   JNI (Java Native Interface) kullanmadan C/C++ kütüphaneleriyle etkileşim kurmayı sağlar.
   Native bellek yönetimi için daha modern ve güvenli bir API sunar.
4. Scoped Values (Sınırlı Değerler)
   Thread-local değişkenlerin daha güvenli ve yönetilebilir bir alternatifi.
   Özellikle virtual thread'lerle kullanımı çok avantajlı.
5. Sequenced Collections (Sıralı Koleksiyonlar)
   List, Set ve Map gibi koleksiyonlarda belirli sıra garantisi sağlayan yeni metotlar ekler.
   first(), last() gibi fonksiyonlarla sıralı erişimi kolaylaştırır.
6. Record Patterns (Kayıt Kalıpları)
   Pattern Matching ile Records birleşerek daha güçlü ve okunaklı kod yazmayı sağlar.
   Örneğin, bir switch içinde doğrudan record nesnelerini parçalayarak kullanabiliriz.
7. String Templates (Şablonlu String'ler)
   "%s %s".formatted(var1, var2) yerine ${var1} ${var2} gibi daha okunabilir string interpolasyonu getirir.
   Güvenli ve esnek bir metin işleme mekanizması sunar.
8. Virtual Threads: Java'nın Threading modeline büyük bir yenilik getiriyor. Java 21 öncesinde, her iş parçacığı (Thread) işletim sistemi (OS) seviyesinde
   yönetiliyordu, bu da yüksek bellek tüketimi ve performans darboğazlarına yol açıyordu.
9. Structured Concurrency: eşzamanlı (concurrent) işlemleri daha güvenli, okunabilir ve yönetilebilir hale getirmek için geliştirilmiş bir modeldir. Geleneksel Java threading modellerinde, iş parçacıklarını başlatmak ve yönetmek karmaşıktır. Thread’lerin düzgün bir şekilde tamamlanmasını veya iptal edilmesini sağlamak zor olabilir. Structured Concurrency, bu sorunları çözerek, bir işlemin tüm alt işlemlerini mantıksal bir blok içinde yönetmeye olanak tanır.


