package day03;

public class PrimitivePractice {
    public static void main(String[] args) {



        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount);
        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount  );
        int catCount = 20;
        System.out.println("The cat count is " + catCount);
        long mileToSun = 10000000L;
        System.out.println("The mile to sun is " + mileToSun);
        long mileToMoon = 50000000l;
        System.out.println("The lmile to moon is " + mileToMoon);

        //floating point
        //you must add '"f" at the end of number uppercase or lowercase

        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is " + priceOfBanana);
        float priceOfPotato = 2.49F;
        System.out.println("The price of potato is " + priceOfPotato);

        //larger floating point numbers
         double priceOfIpad = 355.99d;
        System.out.println("The price of Ipad is " + priceOfIpad);
         double priceOfIpadPro = 1024.99D;
        System.out.println("The price of Ipad Pro is " + priceOfIpadPro);
         //complier automaticcaly assume it's a double so it's not required to have "d"
        //however for goood programming habbit< add them always
        double priceOfMac = 2299.99 ;
        System.out.println("The price of Mac is " + priceOfMac);


        //If you have hole number by itself, compiler automatically assume it is an "int"
        //If you have fractional number by itself, compiler automatically assume it is an "double"

    }
}
