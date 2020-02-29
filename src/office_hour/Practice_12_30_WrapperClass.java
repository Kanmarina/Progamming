package office_hour;

import java.util.Arrays;

public class Practice_12_30_WrapperClass {
    public static void main(String[] args) {
        //primitives:
       // default value:
        //

        int a = 10;
        Integer A = a;

        float f = 0.5f;
        Float F = f;
        //each wrapper classes dedicated to their own primitives
        //Byte,Short,Integer,Long, Float, Double,Boolean
        // default value of Wrapper class : Null

        //all those wrapper classes are presented in java.lang

        //Auto-boxing:assigning primitives value to wrapper class
        // un-boxing:assign wrapper class vlaue to primitive value

        Double num1 = 0.5;
        Short num3 = 45;
        Integer num5 = 100;
        double num6 = num5;
        double num2 = num1;
        double num4 = num3;
        System.out.println(num4 + " " + num2 + " " + num6);

        Long number1 = 100L; //Auto
        Float f1 = 100.0f;

        double d1 = f1; //unboxing

        //Useful method of wrapper class:
        //Max_Value: returns the maximum value
        //Min_Value: returns the minimum value
        System.out.println(Byte.MAX_VALUE); //maximum value of byte primitive
        System.out.println(Byte.MIN_VALUE); //maximum value of byte primitive

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Parse methods: converting String values to primitives,
        // not sensitive

        String str1 = "123";
        int result = Integer.parseInt(str1);
        System.out.println(str1 + 1); //1231
        System.out.println(result + 1);//124

        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1 == false);

        String str3 = "FaLse"; //not sensitive
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "Yes";
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3);

        //ValueOf methods : converting String to Wrapper class,
        // returns wrapper class, not case sensitive
        String s1 = "100.5";
        Double c1 = Double.parseDouble(s1); //auto -boxing
        Double c2 = Double.valueOf(s1); // non boxing
        System.out.println(c1);
        System.out.println(c2);

        String s2 = "falSe";
        Boolean b1 =Boolean.valueOf(s2);
        System.out.println( b1);//false

        //Default value:
        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));//[0,0,0]
        //Default value wrapper class:
        Boolean[] arr1 = new Boolean [3];
        System.out.println(Arrays.toString(arr1));//[null, null,null]

        System.out.println(addNum(100,200));

    }
    public static int addNum(int a,int b){

        return a+b;
    }
    public static double addNum (double a,double b){
        return a+b;
    }
}
