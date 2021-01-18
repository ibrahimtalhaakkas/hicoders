package ch.hicoders.jam101.week08;

public class Main {
    /*
    Classlar:
        -- Main
            + Maneger Class'ini yonetir
        -- Daire
            + ArrayList <Aidat> 12 item, her ay icin
        -- Aidat
            + Tutacagi bilgiler: Ay numarasi, aidatin odenip odenmedigi bilgilerini tutacak
            + Iki contructor olusturulacak: Aylik ( int ayNumarasi),  Aylik ( int ayNumarasi, double odenenMiktar)
        -- Manager
            + 10 tane daire olusturacak ve bilgilerini dolduracak
            + Her bir daire icin 12 tane aidat nesnesi olusturacak
            + Yil sonu her dairenin kalan bilancosunun gösterilmesi (12 aylik period)
            + Her daire icin Yillik bilancoyu yazdir
  */
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.createApartments();
    }
}
