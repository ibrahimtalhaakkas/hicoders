package ch.hicoders.jam101.week08;

import java.util.ArrayList;

public class Manager {

    final int TOTAL_AMOUNT_OF_YEAR = 250 * 12;
    Apartment apartment;

    public void createApartments() {

        for (int i = 1; i <= 10; i++) { //10 tane apartman objesi urettik
            apartment = new Apartment();
            for (int j = 1; j <= 12; j++) {  //Her bir apartman icin 12 (aylik) aidat objesi urettik
                int money = getRandomMoney(); //Random odeme olusturuldu
                Dues dues;
                if (money == 0) { //Odeme yapilmadiysa
                    dues = new Dues(j);
                } else { //Odeme yapildiysa
                    dues = new Dues(j, money);
                }
                setValues(dues);
            }
            System.out.println(getBalance(i));
        }

    }

    public int getRandomMoney() {
        return (int) (Math.random() * 500);//0-500 arasi random sayi(aidat) urettik
    }

    //Her bir apartmanin aidatlarini kendilerine ait olan ArrayList'e kaydettik
    public void setValues(Dues dues) {
        apartment.setValues(dues);
    }

    //Bilancolari apartman apartman getirdik
    public String getBalance(int apartmentNumber) {
        return "Apartment " + apartmentNumber + " : " + calculate();
    }

    //Yillik bilancolari hesapladik
    public double calculate() {
        ArrayList<Dues> values = apartment.getValues(); //Her bir apartmanin yillik degerlerinin tutuldugu ArrayList
        double totalPaid = 0;
        for (Dues d :
                values) {
            totalPaid += d.paidMoney; //Aylik odenen aidatlarin yillik toplamini hesapladik
        }
        return totalPaid - TOTAL_AMOUNT_OF_YEAR; //Yillik bilancoyu hesapladik
    }

}
