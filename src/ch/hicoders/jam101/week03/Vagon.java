package ch.hicoders.jam101.week03;
/*import ch.hicoders.jam101.week03.Puanlama;*/
import java.util.Scanner;

public class Vagon {
    public static void main(String[] args) {

        //Kullaniciya olayin aciklamasini yapalim.
        System.out.println("\nDun bir köy istasyonunda hazin bir yaralama olayi gerceklesti. " +
                "Supheli ise gelen 10 vagonlu bir trene saklanarak olay yerinden kacti.\n" +
                "10 Tane vagonlu trende vagonun birinde supheli saklanmaktadır. " +
                "Suphelinin hangi vagonda saklandıgını bulmak icin yardiminiza ihtiyacimiz var.\n"+
                "4 tahmin hakkiniz oldugunu unutmayin!\n");

        // rastgele bir vagon belirleyelim.
        int number = (int)(Math.random() * 9)+1;
        Scanner input = new Scanner(System.in);
        System.out.println("1-10 arasinda bir vagon tahmini belirlendi.");
        int guess;
        int n=0;

        while (n<4) {
        // kullanicidan tahmin girmesini isteyelim.
            System.out.print("\nTahmininizi giriniz: ");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("\nEvet,tahminiz dogru!!!-->> " + number);

                // kacinci denemede bildigini yazdiralim.
                System.out.println((n+1)+" defada bildiniz!");

                // puanini yazdiralim.
                System.out.println("Puaniniz: "+(100-(n*25)));
                break;
            }else if (guess > number)
                System.out.println("Hatali tahmin :( -->> On vagonlarda bir yerde olmali!");
            else
                System.out.println("Hatali tahmin :( -->> Arka vagonlarda bir yerde olmali!");
            n++;
        } // dongu sonu.

        // 4 tahminde de bilemezse puan alamadigini yazdiralim.( inheritance kullanarak diger classtan bilgi alalim.)
        if(n==4) {
            Puanlama puanlama = new Puanlama("","");
            puanlama.showInfos();
        }
    }

}
