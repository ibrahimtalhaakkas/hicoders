package ch.hicoders.jam101.week08;

import java.util.ArrayList;

public class Apartment {

    private ArrayList<Dues> values = new ArrayList<>();

    public ArrayList<Dues> getValues() { //Yil sonu 12 ayin bulundugu ArrayList'i getiriyoruz
        return values;
    }

    public void setValues(Dues dues) {//Ay ay degerleri ArrayList'e kaydettik
        values.add(dues);
    }
}
