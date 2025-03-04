# 🚀 Java 21: String Templates (JEP 430 - Şablonlu Stringler)
Java 21 ile birlikte gelen String Templates (Şablonlu Stringler), string oluşturmayı daha okunabilir, güvenli ve verimli hale getiriyor. Hadi adım adım inceleyelim!

## 🛠️ Motivasyon: Neden String Templates?

Önceki Java sürümlerinde string birleştirme ve formatlama ile ilgili bazı sorunlar vardı:

- ❌ + Operatörü ile Birleştirme Karmaşıktı

Birden fazla değişken birleştirmek için + kullanmak zor ve okunması güç hale geliyordu.
- ❌ String.format() Kullanımı Uzun ve Karmaşıktı

String.format() daha iyi görünse de, uzun ve hataya açık bir yöntemdi.
- ❌ SQL ve HTML Enjeksiyon Riskleri

Kullanıcıdan alınan girdileri doğrudan string birleştirmede kullanmak güvenlik açıklarına sebep olabiliyordu.