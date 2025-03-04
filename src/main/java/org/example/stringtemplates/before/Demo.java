package org.example.stringtemplates.before;

public class Demo {

  public static void main(String[] args) {
    String isim = "Ahmet";
    int yas = 30;

    //Okunması zor ve düzensiz bir yapı.
    //Eğer çok sayıda değişken varsa hata yapma riski artıyor.
    String mesaj = "Merhaba, benim adım " + isim + " ve " + yas + " yaşındayım.";
    System.out.println(mesaj);

    //%s, %d gibi format belirteçlerini ezberlemek zor.
    //Daha uzun ve fazladan kod yazmayı gerektiriyor.
    String mesaj2 = String.format("Merhaba, benim adım %s ve %d yaşındayım.", isim, yas);
    System.out.println(mesaj2);

    //❌ Eğer kullanıcı Ahmet' OR '1'='1 girerse, tüm veritabanı dönebilir!
    String sql = "SELECT * FROM kullanicilar WHERE isim = '" + isim + "'";

  }

}
