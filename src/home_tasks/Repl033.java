package home_tasks;

import java.util.Scanner;

public class Repl033 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");
        int numMil = scan.nextInt();
        int drink = 10000;

            System.out.println("It would take about " + (drink /= numMil) +
                    " drinks for a lethal overdose.");
        }
    }


