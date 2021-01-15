package ch.hicoders.jam101.week06;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*Ornek Parca ismi: pedal123
   Istenen Format: ASLIAG_LADEP20210113*/

public class SpareParts {
    private final String CONSTANT_VALUE = "ASLIAG_";
    private Date currentDate = null;
    private List<String> partList = null;
    private String input;

    public SpareParts(String input) {
        this.input = input;
        partList = new ArrayList<String>();
        makeCapital(input);
    }

    private void makeCapital(String input) {
        input = input.toUpperCase();
        removeDigit(input);
    }

    private void removeDigit(String input) {
        input = input.replaceAll("[0-9]", "");
        makeReverse(input);
    }

    private void makeReverse(String input) {
        String tempInput = "";
        int length = input.length();
        for (int i = (length - 1); i >= 0; i--) {
            tempInput += Character.toString(input.charAt(i));
        }
        input=tempInput;
        addConstant(input);
    }

    private void addConstant(String input) {
        input=CONSTANT_VALUE+input;
        addDate(input);
    }

    private void addDate(String input) {
        currentDate = new Date();
        SimpleDateFormat smt = new SimpleDateFormat("YYYYMMdd");
        input+= smt.format(currentDate);
        this.input=input;
    }
    public List<String> getSpareParts(){
        partList.add(input);
        return partList;
    }
}
