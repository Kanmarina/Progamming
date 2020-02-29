package day34;

import day31.Calculator_2;

import java.util.Arrays;

public class MathAction {
    //calling the static methods of other classes

    public static void main(String[] args) {

        //call your buildDigitNumber
        //build3DigitNumber is under day34 package
        //and inside WarmTask_DigitNumber class
        int result1 = PracticeMethodWithNumbers.build3DigitNumber(6, 4, 0);
        System.out.println("result1 = " + result1);
//in order to use ARRAYS class that coming from java.util package(not your package)
        //first we need to import them import
        // in order to call static method of Arrays class,
        //we need to use className.methodName(..);
        //here Arrays.toString
        int[] nums = {2,5,87};
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));

        //how can I call static method called calculate
        // in calculator_V2 under day 31 package
        //it's not uder current package day34
        //so we need to import the class>>> import day31.Calculator_V2 class
        //Calculator_V2.yourStaticMethodName()
        Calculator_2.calculate('-',10,20);



    }


}
