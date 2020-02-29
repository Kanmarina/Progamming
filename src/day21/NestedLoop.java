package day21;

public class NestedLoop {
    public static void main(String[] args) {

        //count from 1-5
        //repeat this 3 times

  /*      for (int x = 1; x <=5 ; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x = 1; x <=5 ; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x = 1; x <=5 ; x++) {
            System.out.print(x + " ");
        }
        System.out.println();*/

        for (int i = 1; i <=3 ; i++) {
            System.out.println("iteration : " + i);

            for (int x = 1; x <=5 ; x++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        //count from 1-5> print only odd numbers
        //repeat this 4 times

    }
}
