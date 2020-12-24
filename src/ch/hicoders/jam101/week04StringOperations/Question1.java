package ch.hicoders.jam101.week04StringOperations;

import java.util.Scanner;


public class Question1 {
    //Verilen bir isim ve soyismin sadece bas harflerini Uppercase a cevirin.
    //         ornek: asik veysel ==> Asik Veysel

    public static void main(String[] args){
        //kullanicidan isim soyisim bilgisini isteyelim.
        Scanner input = new Scanner (System.in);

        String name;
        String surname;

        System.out.println("Isim ve Soyisminizi giriniz:" + "\n(Not:Eger birden fazla isim kullaniyorsaniz lutfen sadece birini giriniz.)");

        name =input.next();
        surname =input.next();
        //sadece bas harflerini secip buyuk harfe cevirelim.
        String s1 = name.substring(0,1).toUpperCase();
        String s2 = surname.substring(0,1).toUpperCase();
        //bas harfleriyle kelimenin geri kalanini birlestirelim.
        String ch1 = s1 + name.substring(1);
        String ch2 = s2 + surname.substring(1);
        //cikti alalim.
        System.out.println("Tesekkurler: "+ ch1 +" " + ch2);

    }
}
