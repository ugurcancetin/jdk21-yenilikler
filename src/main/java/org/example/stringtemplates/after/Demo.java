package org.example.stringtemplates.after;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo {

  public static void main(String[] args) {
    String isim = "Ahmet";
    int yas = 30;

    //✔ Daha Okunabilir – + veya %s gibi karmaşık operatörlere gerek yok.
    //✔ Tip Güvenliği (Type Safety) – Değişken türleri otomatik olarak işlenir.
    //✔ Bakımı Kolay – Kod daha az hata içerir ve kolay okunur.
    String mesaj = STR. "Merhaba, benim adım \{ isim } ve \{ yas } yaşındayım." ;
    System.out.println(mesaj);

    //Veri Enjeksiyonuna Karşı Daha Güvenli
    //Şablonlu stringler, değişkenleri doğrudan escape ederek hataları önler.
    String sql = STR. "SELECT * FROM kullanicilar WHERE isim = '\{ isim }'" ;

    //Direk olarak hesaplama ve method cagrisi yapilabilir
    String mesaj2 = STR."Bugun tarih: \{new java.util.Date()}";
    System.out.println(mesaj2);

    //Daha da ileriye gidebilirsin
    String mesaj3 = STR."Bugun tarih: \{ DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()) }";
    System.out.println(mesaj3);
  }

}
