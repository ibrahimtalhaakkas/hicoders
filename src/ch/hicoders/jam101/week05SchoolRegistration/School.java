package ch.hicoders.jam101.week05SchoolRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args){

        Scanner inputone = new Scanner(System.in);

        ArrayList firstclass = new ArrayList();

        System.out.println("Welcome to school!\nNow we are taking first class information formerly.\nFirst Class student's age must be 6!");

        String firstclassname;
        String firstclasssurname;
        int firstclassage;

        for (int i=1;i<=2;i++) {
            System.out.println("\nPlease enter name,surname and age:\nDon't forget space between them! ");

            firstclassname = inputone.next();
            firstclasssurname = inputone.next();
            firstclassage = inputone.nextInt();

            String fn = firstclassname.toUpperCase();
            String fs = firstclasssurname.toUpperCase();

            String fnc = fn.substring(0, 2);
            String fsc = fs.substring(fs.length() - 3);

            firstclass.add(fnc + fsc + firstclassage);
        }

        System.out.println("---First Class Students---");
        System.out.print(firstclass);

        //SECOND CLASS

        ArrayList secondclass = new ArrayList();
        String secondclassname;
        String secondclasssurname;
        int secondclassage;

        for (int i=1;i<=2;i++) {
            System.out.println("\nPlease enter name,surname and age:\nDon't forget space between them! ");

            secondclassname = inputone.next();
            secondclasssurname = inputone.next();
            secondclassage = inputone.nextInt();

            String sn = secondclassname.toUpperCase();
            String ss = secondclasssurname.toUpperCase();

            String snc = sn.substring(0, 2);
            String ssc = ss.substring(ss.length() - 3);

            secondclass.add(snc + ssc + secondclassage);
        }

        System.out.println("---Second Class Students---");
        System.out.print(secondclass);

        // THIRD CLASS

        ArrayList thirdclass = new ArrayList();
        String thirdclassname;
        String thirdclasssurname;
        int thirdclassage;

        for (int i=1;i<=2;i++) {
            System.out.println("\nPlease enter name,surname and age:\nDon't forget space between them! ");

            thirdclassname = inputone.next();
            thirdclasssurname = inputone.next();
            thirdclassage = inputone.nextInt();

            String tn = thirdclassname.toUpperCase();
            String ts = thirdclasssurname.toUpperCase();

            String tnc = tn.substring(0, 2);
            String tsc = ts.substring(ts.length() - 3);

            thirdclass.add(tnc + tsc + thirdclassage);
        }

        System.out.println("---Third Class Students---");
        System.out.print(thirdclass);

        // FOURTHCLASS

        ArrayList fourthclass = new ArrayList();
        String fourthclassname;
        String fourthclasssurname;
        int fourthclassage;

        for (int i=1;i<=2;i++) {
            System.out.println("\nPlease enter name,surname and age:\nDon't forget space between them! ");

            fourthclassname = inputone.next();
            fourthclasssurname = inputone.next();
            fourthclassage = inputone.nextInt();

            String fn = fourthclassname.toUpperCase();
            String fs = fourthclasssurname.toUpperCase();

            String fnc = fn.substring(0, 2);
            String fsc = fs.substring(fs.length() - 3);

            fourthclass.add(fnc + fsc + fourthclassage);
        }

        System.out.println("---Fourth Class Students---");
        System.out.print(fourthclass);

        //FIFTHCLASS

        ArrayList fifthclass = new ArrayList();
        String fifthclassname;
        String fifthclasssurname;
        int fifthclassage;

        for (int i=1;i<=2;i++) {
            System.out.println("\nPlease enter name,surname and age:\nDon't forget space between them! ");

            fifthclassname = inputone.next();
            fifthclasssurname = inputone.next();
            fifthclassage = inputone.nextInt();

            String ffn = fifthclassname.toUpperCase();
            String ffs = fifthclasssurname.toUpperCase();

            String ffnc = ffn.substring(0, 2);
            String ffsc = ffs.substring(ffs.length() - 3);

            fifthclass.add(ffnc + ffsc + fifthclassage);
        }

        System.out.println("---Fifth Class Students---");
        System.out.print(fifthclass);

    }}
