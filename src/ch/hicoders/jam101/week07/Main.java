package ch.hicoders.jam101.week07;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //Format of the date defined in the input String
        DateFormat df = new SimpleDateFormat("hh:mm aa");
        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputformat = new SimpleDateFormat("HH:mm");
        Date date = null;
        String output = null;
        try {
            //Converting the input String to Date
            date = df.parse(input);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
            //Displaying the date
            System.out.println(output);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }

}
