package ch.hicoders.jam101.week08;


public class Dues {
    int monthNumber;
    double paidMoney;

    public Dues(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Dues(int monthNumber, double paidMoney) {
        this.monthNumber = monthNumber;
        this.paidMoney = paidMoney;
    }
}
