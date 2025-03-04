# 🚀 Java 21: Key Encapsulation Mechanism (KEM) - JEP 452
Post-Quantum Cryptography (PQC) alanındaki en önemli gelişmelerden biri Key Encapsulation Mechanism (KEM) oldu. Java 21, KEM desteğini entegre ederek daha güvenli ve post-kuantum dirençli anahtar değişim mekanizmaları sunuyor.

### 🛠️ Motivasyon: Neden KEM?
Günümüzde Diffie-Hellman (DH) ve Elliptic Curve Diffie-Hellman (ECDH) gibi geleneksel anahtar değişim protokolleri, kuantum bilgisayarlar tarafından kırılabilir.

### 🔹 Problem:

RSA, DH ve ECDH gibi klasik algoritmalar kuantum bilgisayarların Shor Algoritması ile kırılma riski taşıyor.
Daha güçlü, post-kuantum dirençli anahtar değişim mekanizmalarına ihtiyacımız var.
Hibrit sistemlerde KEM, klasik ve kuantum güvenli şifreleme ile birlikte kullanılabilir.

### 🔹 Çözüm: Key Encapsulation Mechanism (KEM)

KEM, asimetrik şifreleme ve simetrik şifreleme arasında bir köprü olarak çalışır.
Anahtar değişimi sırasında post-kuantum güvenliği garanti eder.
Kuamtum bilgisayarların tehdit oluşturamayacağı bir şifreleme altyapısı sağlar.