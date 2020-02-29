package day31;

// Create a class called MethodPractice4
// no need for object when being called                : static
// it should be accessible anywhere in your project    : public
// it does not return any value                        : void
// does not need any external data when being called   : (nothing inside)
// Create a method called countDownFrom20tillOne
// Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
// Create a method to spell your name :  Seda -->> S-e-d-a
public class MethodPractice2 {
    public static void main(String[] args) {
        countDownfrom20();
        printOddNumbers1to100();

    }

    public static void countDownfrom20() {
        for (int i = 20; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printOddNumbers1to100() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }



}

