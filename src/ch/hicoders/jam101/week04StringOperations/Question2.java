package ch.hicoders.jam101.week04StringOperations;

public class Question2 {
    //0 dan 100 e kadar olan sayilari, bir satirda 10 sayi ve her sayinin arasinda virgul olacak sekilde yazdiriniz.
    public static void main(String[] args){
        //kullanacagimiz degerleri tanimlayalim.
        int i,a,b,c,d,e,f,g,h,j;
        //her 10 sayi icin bir for dongusu yazalim ve sonuna virgul koyalim.
        for (i = 0; i < 10; i++){
        System.out.print(" "+i+",");
        }
        System.out.println();

        for(a =i;a<20;a++){
        System.out.print(a+",");
        }
        System.out.println();

        for(b=a;b<30;b++){
        System.out.print(b+",");
        }
        System.out.println();

        for(c=b;c<40;c++){
        System.out.print(c+",");
        }
        System.out.println();

        for(d=c;d<50;d++){
            System.out.print(d+",");
        }
        System.out.println();

        for(e=d;e<60;e++){
            System.out.print(e+",");
        }
        System.out.println();

        for(f=e;f<70;f++){
            System.out.print(f+",");
        }
        System.out.println();

        for(g=f;g<80;g++){
            System.out.print(g+",");
        }
        System.out.println();

        for(h=g;h<90;h++){
            System.out.print(h+",");
        }
        System.out.println();
        //donguyu tamamlayip, son sayinin sonuna nokta koyarak soruyu tamamlayalim.
        for(j=h;j<99;j++){
            System.out.print(j+",");
        }
        System.out.println(j+++".");
    }//dongu sonu.
}
