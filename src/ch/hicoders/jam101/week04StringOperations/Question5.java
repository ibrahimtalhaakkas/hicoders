package ch.hicoders.jam101.week04StringOperations;

public class Question5 {
    /*Asagidaki sekli programlama yapilarini kullanarak cizdiriniz.
   *
   **
   ***
   ****
   *****
   ******
     */
    public static void main (String[] args ){
        //kullanacagimiz degerleri tanimladik.
        int i,j;
        String yildiz = "*";
        //yildizlari yazdirmak icin bir for dongusu baslatalim.
        for (i=1;i<=6;i++){
           System.out.println(yildiz);
           //son adimda tekrar 6 yildiz yazdirmamasi icin if statementin icinde for olusturuyoruz.
           if (i<6){
            for (j =1;j<=i;j++) {
               System.out.print(yildiz);
            }
           }
           else
               break;
        }
    }//dongu sonu.
}