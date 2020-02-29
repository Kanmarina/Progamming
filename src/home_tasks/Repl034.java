package home_tasks;

import java.util.Scanner;

public class Repl034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  itemPrice = scan.nextInt();
        int   quarters, dimes, nickels;
        int remainingAfterQuarters, remainingAfterDimes =scan.nextInt();
        quarters = itemPrice/25;
        remainingAfterQuarters=itemPrice%25;
        dimes = remainingAfterDimes/10;
        remainingAfterDimes = remainingAfterQuarters%10;
        nickels = remainingAfterDimes/5;

        System.out.println("Your change is " +quarters+" quarters "+
                dimes+" dimes, and "+nickels+" nickels.");


        if (itemPrice <25 || itemPrice>100){
            System.out.println("Invalid price!");
        }else if (itemPrice %5 ==0)
            System.out.println("Invalid price!");
    }
}
