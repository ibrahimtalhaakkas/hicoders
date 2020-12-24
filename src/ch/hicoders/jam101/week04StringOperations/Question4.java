package ch.hicoders.jam101.week04StringOperations;


public class Question4 {
    public static void main(String[] args){
        //Kucuk, buyuk, ozel karakterler ve sayilardan olusan
        // 8 ile 16 (hane) uzunluklari arasinda
        // guvenli 50 adet sifre olusturunuz.
        String kucukharfler ="abcdefghijklmnopqrstuvwxyz";
        String buyukharfler ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sayilar ="0123456789";
        String ozelkarakter = "!$%&*?.,/|";
        String icerik = kucukharfler + buyukharfler + sayilar + ozelkarakter;
        String sifre;

        for(int i=1; i<=50; i++) {
            int aralik = (int) (Math.random()*(16-8)+8);
            sifre="";

                for(int j=0; j<aralik; j++) {
                 int rastgelekarakter = (int) (Math.random() * (icerik.length() - aralik ) + aralik);
                    sifre += icerik.charAt(rastgelekarakter);
            }
            System.out.println("password number " + i + ": " + sifre);
}}}