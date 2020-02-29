package office_hour;

import java.util.Scanner;

public class Practice_11_20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age ? ");
        int age = scan.nextInt();
// we can add scan.nextLine();
        System.out.println("What is your full name ? ");
        String fullName = scan.next();

        System.out.println("Your name is " + fullName +
                " , your age is " + age);

    }
}
