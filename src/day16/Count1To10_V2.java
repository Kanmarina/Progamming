package day16;

public class Count1To10_V2 {
    public static void main(String[] args) {

        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter++);


            int counter1 = 0;

            while (++counter1 <= 10) {
                System.out.println(counter1);

                int counter2 = 1;

                while (counter2++ < 10) {
                    System.out.println(counter2);


                }

            }
        }
    }
}