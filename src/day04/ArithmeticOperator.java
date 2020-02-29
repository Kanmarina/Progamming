package day04;

public class ArithmeticOperator {
    public static void main(String[] args) {

        //arithmetic operator between two int >>>> another int
        System.out.println(5 + 3);//8
        System.out.println(5 - 3);//2
        System.out.println(5 * 3);//15
        System.out.println(5 / 3); //1 ???
        System.out.println(5 + 3);

        //arithmetic operator between two numerical data type
        // the final result will be larger data type

        System.out.println(5 + 3.0d);
        System.out.println(5 - 3.0d);
        System.out.println(5 * 3.0d);
        System.out.println(5 / 3.0d);

        //same d and f
        System.out.println(5 + 3.0f);

        // store above numbers in variables and replace above statements
        //with variables
        //data types ressult = the calculation there



        int result1 = 5;
        double result2 = 3.0d;
        float result3 = 3.0f;

        double sum = result1 +result2;
        double min = result1 - result2;
        double mon = result1 * result2;
        double dev = result1 / result2;
        float dev1 = result1 / result3;


        System.out.println(result1 + result2);
        System.out.println(result1 - result2);
        System.out.println(result1 * result2);
        System.out.println(result1 / result2);





    }
}
