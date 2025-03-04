# 🚀 Structured Concurrency (JEP 453 - Yapısal Eşzamanlılık Kullanımı)

Java 21 ile gelen Structured Concurrency API’si, eşzamanlı (concurrent) işlemleri daha güvenli, okunabilir ve yönetilebilir hale getirmek için geliştirilmiş bir modeldir. Geleneksel Java threading modellerinde, iş parçacıklarını başlatmak ve yönetmek karmaşıktır. Thread’lerin düzgün bir şekilde tamamlanmasını veya iptal edilmesini sağlamak zor olabilir. Structured Concurrency, bu sorunları çözerek, bir işlemin tüm alt işlemlerini mantıksal bir blok içinde yönetmeye olanak tanır.

### 🛠️ Motivasyon: Neden Structured Concurrency?
✅ Birden fazla iş parçacığını ana thread ile mantıksal olarak bağlayarak kolayca yönetebiliriz.

✅ Daha Temiz Kod: Geleneksel threading modelleri callback hell (iç içe geçmiş çağrılar) yaratırken, Structured Concurrency daha basit ve okunabilir bir yapı sunar.

✅ Otomatik İptal (Cancellation): Eğer bir ana iş parçacığı başarısız olursa, ona bağlı tüm alt iş parçacıkları otomatik olarak iptal edilir.

✅  Kaynak Yönetimi: İş parçacıkları açık bırakılmaz, tüm thread'ler doğru şekilde sonlandırılır.

### Sonuç
Java 21 öncesinde, thread’leri manuel yönetmek zorundaydık, bu da karmaşık ve hata yapmaya açık bir sistem oluşturuyordu.
Java 21 ile Structured Concurrency, daha okunaklı ve güvenli bir yapı sunarak thread yönetimini otomatize ediyor.
StructuredTaskScope API’si, otomatik hata yönetimi, kaynak temizliği ve paralel işlemleri daha güvenilir bir hale getiriyor.

🚀 Özellikle yüksek eşzamanlılık (concurrency) gerektiren uygulamalar için Structured Concurrency, Java'daki en büyük yeniliklerden biri!