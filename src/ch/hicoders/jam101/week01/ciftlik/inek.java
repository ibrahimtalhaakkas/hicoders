package ch.hicoders.jam101.week01.ciftlik;

public class inek {
    public static int inek_sayisi = 0;
    private String isim;

    public inek() {
        inek_sayisi++;
        this.isim = "inek" + inek_sayisi;
    }

    public inek(String inek_isim) {
        this.isim = inek_isim;
        inek_sayisi++;
    }

    @Override
    public String toString() {
        return isim;
    }
}
