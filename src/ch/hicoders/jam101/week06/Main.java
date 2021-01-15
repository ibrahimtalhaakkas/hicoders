package ch.hicoders.jam101.week06;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        SpareParts spareParts = new SpareParts(input);
        List<String> partList= spareParts.getSpareParts();
        System.out.println(partList.get(0));
    }
}
