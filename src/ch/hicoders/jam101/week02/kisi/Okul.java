package ch.hicoders.jam101.week02.kisi;

import ch.hicoders.jam101.week02.kisi.Ogrenci;
import java.util.*;

public class Okul {
    static ArrayList<Ogrenci> Liste = new ArrayList<>();
    static ArrayList<Ogrenci> BasariliOgrenciler = new ArrayList<>();
    static ArrayList<Ogrenci> KalanOgrenciler = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int size = r.nextInt(50);

        for (int i = 1; i <= 4; i++) { //i<=size yapmak gerekir ama kodu kontrol etmesi cok uzun suruyor
            System.out.print("Lutfen" + i + "'nci ogrencinin adini giriniz.");
            String name = sc.nextLine();
            Ogrenci ogrenci = new Ogrenci(name);
            Liste.add(ogrenci);
            System.out.print("Lutfen" + name + "adli ogrencinin mat. notunu giriniz:");
            ogrenci.setMathScore(sc.nextInt());
            sc.nextLine();
            System.out.print("Lutfen" + name + "adli ogrencinin almanca notunu giriniz:");
            ogrenci.setDeutschScore(sc.nextInt());
            sc.nextLine();
        }
        printList(Liste);
        System.out.println("====================");
        calculateResult();
        printList(BasariliOgrenciler);
        System.out.println("=======================");
        printList(KalanOgrenciler);
        System.out.println("=====================");
        findTheBest();
        findTheWorst();


    }

    public static void printList(ArrayList list) {
        if (list.equals(Liste)) {
            System.out.println("###Ogrenci Listesi###");
            for (Ogrenci ogrenci : Liste) {
                System.out.println(ogrenci.getName() + " " + ogrenci.getMathScore() + " " + ogrenci.getDeutschScore());
            }
        } else if (list.equals(BasariliOgrenciler)) {
            System.out.println("###Basarili Ogrenciler###");
            for (Ogrenci ogrenci : BasariliOgrenciler) {
                System.out.println(ogrenci.getName() + " " + ogrenci.getMathScore() + " " + ogrenci.getDeutschScore() + " " + ogrenci.getOrtalama());
            }
        } else {
            System.out.println("###Basarisiz Ogrenciler###");
            for (Ogrenci ogrenci : KalanOgrenciler) {
                System.out.println(ogrenci.getName() + " " + ogrenci.getMathScore() + " " + ogrenci.getDeutschScore() + " " + ogrenci.getOrtalama());
            }
        }
    }

    public static void getAverage() {  // iki notun ortalamasini aliyoruz, iki tam sayi not oldugu icin virgulden sonra 1 hane cikacaktir.
        for (Ogrenci ogrenci : Liste) {
            double ortalama = (ogrenci.getDeutschScore() + ogrenci.getMathScore()) / 2;
            ogrenci.setOrtalama(ortalama);
        }
    }

    public static void calculateResult() {
        getAverage();
        for (Ogrenci ogrenci : Liste) {
            if (ogrenci.getOrtalama() >= 3) {
                BasariliOgrenciler.add(ogrenci);
            } else {
                KalanOgrenciler.add(ogrenci);
            }
        }
    }

    //ortalamaya gore en yuksek ve en dusuk ortalamayi hesapladim, ders bazinda da ogrenci.getMathScore()
    //veya ogrenci.getDeutschScore() ile bulabilirdik.
    public static void findTheWorst() {
        double min = 7;
        String name = "";
        for (Ogrenci ogrenci : Liste) {
            if (ogrenci.getOrtalama() < min) {
                min = ogrenci.getOrtalama();
                name = ogrenci.getName();
            }
        }
        System.out.println(min + " ortalama ile en dusuk ortalamaya sahip ogrenci " + name + " dir.");
    }

    public static void findTheBest() {
        double max = 0;
        String name = "";
        for (Ogrenci ogrenci : Liste) {
            if (ogrenci.getOrtalama() > max) {
                max = ogrenci.getOrtalama();
                name = ogrenci.getName();
            }
        }
        System.out.println(max + " ortalama ile en yuksek ortalamaya sahip ogrenci " + name + " dir.");

    }
}
