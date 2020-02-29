package day06;

public class CompoundOperator2 {

    public static void main(String[] args) {

        int bankBalace = 1140;
        System.out.println("I have spent half of it : ");
        bankBalace = bankBalace/2;
        System.out.println("Now my balance is " + bankBalace);

        bankBalace = bankBalace%500;
        System.out.println( "I want to divide the balance by 500 and " +
                "keep the remainder in my pocket");
        System.out.println( "The remainder is : " + bankBalace);

        int cent = 200;
        cent -= 74; //126 cent after spending 74 cent for candle

        int quarter = cent/25; //126/25 >>> 5, 1 is remaining
        int penny = cent%25; //126/25 >>> 5, 1 is remaining

        System.out.println(quarter);
        System.out.println(penny);

        int dime = cent/10;// >>>126/10 ...12 and remainder is 6
        //how much penny I have after getting dime 126%10 >>>6

        int penny2 = cent%10; ///>>.6 creating new penny2 for
        // not mixing with previous
        System.out.println(dime);
        System.out.println(penny2);






    }
}
