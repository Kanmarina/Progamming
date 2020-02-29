package home_tasks;

 import java.util.Scanner;

public class Repl045 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.print("Enter vehicle's year:");
        int vechicleYear = scan.nextInt();
        if (vechicleYear > 1995 && vechicleYear < 1998) {
            System.out.print("Your vehicle needs to be recalled!");

        } else if (vechicleYear > 2001 && vechicleYear < 2002) {
            System.out.print("Your vehicle needs to be recalled!");
        } else if (vechicleYear > 2004 && vechicleYear < 2006) {
            System.out.print("Your vehicle needs to be recalled!");
        } else if (vechicleYear > 2015 && vechicleYear < 2017) {
            System.out.print("Your vehicle needs to be recalled!");
        } else {
            System.out.print("Your vehicle is fine, enjoy!");
        }
    }
}
