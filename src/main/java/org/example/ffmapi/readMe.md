# 🚀 Foreign Function & Memory API (FFM API) ve Motivasyonu
### FFM API Nedir?
Java 21 ile Foreign Function & Memory API (FFM API), Java uygulamalarının yerel (native) bellek ve harici C/C++ fonksiyonları ile doğrudan etkileşime girmesini sağlar. JNI (Java Native Interface) yerine modern, güvenli ve daha yüksek performanslı bir alternatif sunar.

### Motivasyon: Neden FFM API?
✅ JNI’ye Göre Daha Güvenli ve Daha Hızlı

JNI kullanımı karmaşıktır, hataya açıktır ve performans açısından yavaştır.

FFM API, bellek yönetimi ve C/C++ çağrılarını daha verimli ve güvenli hale getirir.

✅ Yerel Belleğe Daha Kolay ve Güvenli Erişim

Java’nın Heap dışındaki belleğe erişmesini kolaylaştırır.

Off-heap bellek yönetimi ile büyük veri işleme (Big Data) ve yüksek performanslı uygulamalar için idealdir.

✅ C Kütüphaneleri ile Doğrudan Çalışabilme

JNI kullanmadan, C/C++ kütüphanelerini çağırabiliriz.

Örneğin, libc, OpenSSL, CUDA veya SQLite gibi kütüphaneler ile doğrudan entegrasyon yapılabilir.

✅ Daha Basit ve Güvenli Bellek Yönetimi

Bellek sızıntılarını (memory leaks) önlemek için otomatik temizleme (try-with-resources desteği) sağlar.
