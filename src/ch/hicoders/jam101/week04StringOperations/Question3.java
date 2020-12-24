package ch.hicoders.jam101.week04StringOperations;

public class Question3 {
    //0 dan 100 e kadar olan prime (asal sayilari) yatay olarak yazdirin (Asal sayilar: sadece kendisine ve 1 e bolunebilen sayilar)
    //         bulunmasi gereken sonuc: 1, 2, 3, 5, 7, 11 ....
    public static void main(String[] args){

        int sayac = 0;
        //for dongusu ile 100e kadar sayilari dondurelim.
        for(int sayi=1;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }

            if(kontrol==0)
            {
                System.out.print(sayi+", ");
                sayac++;
            }
        }
    }
}