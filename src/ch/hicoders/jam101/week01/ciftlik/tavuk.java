package ch.hicoders.jam101.week01.ciftlik;

public class tavuk {
    public static int tavuk_sayisi = 0;
    private   String isim;

    public tavuk(){
        tavuk_sayisi++;
        this.isim = "tavuk" + tavuk_sayisi;
    }
    public tavuk (String tavuk_isim){
        this.isim = tavuk_isim;
        tavuk_sayisi++;
    }

    @Override
    public String toString() {
        return isim;
    }
}
