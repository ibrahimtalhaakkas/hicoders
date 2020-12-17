package ch.hicoders.jam101.week03;

import java.util.Scanner;
//4 tahminde de bilemediginde kullanilmak uzere bir bilgi notu hazirlayip main metodda kullanalim.
public class Puanlama {
 private String yorum;
 private String puansiz;

    public Puanlama(String yorum, String puansiz) {
        this.yorum = "\nMalesef tahminleriniz tutmadi...";
        this.puansiz = "\nHic puan alamadiniz...";
    }
    public void showInfos(){
        System.out.println(this.yorum);
        System.out.println(this.puansiz);
    }
}
