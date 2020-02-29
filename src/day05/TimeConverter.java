package day05;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new  Scanner (System.in);

        System.out.println("hom many second in a hour");
        double sec = scan.nextDouble();
       double hour = sec * 1600;
        System.out.println("In hour " + hour);
    }
}
