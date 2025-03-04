# 🚀 Java 21: Scope Value (JEP 446 - Kapsam Değerleri)
Java 21 ile birlikte gelen Scope Value (Kapsam Değerleri), ThreadLocal'e bir alternatif olarak sunuluyor ve virtual thread'lerle (sanal thread'ler) daha verimli çalışıyor.

Hadi önce neden ihtiyacımız var ona bakalım, sonra öncesi ve sonrası kodları karşılaştıralım!

### 🛠️ Motivasyon: Neden Scope Value?
Java'da thread bazlı veri paylaşımı için genellikle ThreadLocal kullanılır. Ancak:

❌ ThreadLocal Yönetimi Zordur

ThreadLocal değişkenleri manuel temizlemek gerekir, aksi takdirde memory leak (bellek sızıntısı) oluşabilir.

❌ Virtual Thread'lerle Verimsiz Çalışır

Java 19’da gelen Virtual Threads (Sanal Thread’ler) ile ThreadLocal kullanımı performansı düşürebilir.

❌ Yanlış Kullanılırsa Yan Etkilere Sebep Olur

ThreadLocal, bir thread içinde değişken paylaşmayı sağlar ama global state gibi davranırsa hatalara yol açabilir.

📌 Scope Value, ThreadLocal yerine daha verimli ve güvenli bir alternatif sunar!