package ch.hicoders.jam101.week01.ciftci;

import ch.hicoders.jam101.week01.ciftlik.*;

import java.util.concurrent.atomic.AtomicStampedReference;

public class ciftci {
    public static void main(String[] args){
        inek cow1 = new inek();
        inek cow2 = new inek();
        inek cow3 = new inek("Simental");

        System.out.println(cow1.toString());
        System.out.println(cow2.toString());
        System.out.println(cow3.toString());
        System.out.println();
        tavuk chicken1 = new tavuk();
        tavuk chicken2 = new tavuk();
        tavuk chicken3 = new tavuk("Denizli");

        System.out.println(chicken1.toString());
        System.out.println(chicken2.toString());
        System.out.println(chicken3.toString());
        System.out.println();

        System.out.println("Toplam Inek Sayisi: " + inek.inek_sayisi);
        System.out.println("Toplam Tavuk Sayisi: " + inek.inek_sayisi);
    }
}
