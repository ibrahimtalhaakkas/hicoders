package ch.hicoders.jam101.week02.kisi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ogrenci {
    Scanner sc = new Scanner(System.in);

    public Ogrenci(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        if (checkScore(mathScore)) {
            this.mathScore = checkedScore;
        }
    }

    private int mathScore;

    public int getDeutschScore() {
        return deutschScore;
    }

    public void setDeutschScore(int deutschScore) {
        if (checkScore(mathScore)){
        this.deutschScore = checkedScore;
    }}

    private int deutschScore;

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    private double ortalama;
    int checkedScore;
    public boolean checkScore (int score){
        while (score<0 || score>6){
            System.out.println("girilen not 0-6 araliginda olmalidir!");
            System.out.println("tekrar giriniz:");
            sc.nextLine();
        }
        checkedScore = score;
        return true;
    }

}