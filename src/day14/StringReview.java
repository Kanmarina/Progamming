package day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "I like Pumpkin";

        //System.out.println(  str.equals("pumpkin")   );

        // contains :
        // it checks whether a string exists in another string'
        // and return true or false result
        System.out.println("Does it contains Pumpkin : ");
        System.out.println(str.contains("Pumpkin"));
        // true
        boolean gotPumpkin = str.contains("Pumpkin");
        //shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith  endsWith
        // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false result

       boolean startWithI = str.startsWith("I");
        System.out.println("started with I = "+ startWithI);
        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println(" end with Pumpkin = " + endWithPumpkin);

        //Password Validator
        // minimum 8 char max 16 char
        // it must contains_ OR $
        //It must not contains space
        // it must start Ab

        //if any of above condition does not match say INVALID PASSWORD
        //else say GOOD PASSWORD

        String password ="Ab_sdkdsk$123";
       boolean min8max16 = password.length() >= 8 && password.length() <= 16;

       boolean mustContains_or$=  password.contains("_") || password.contains("$");

       boolean mustNotContSpace= !password.contains(" ");

       boolean mustStartAb= password.startsWith("Ab");
        if (min8max16 && mustContains_or$ && mustNotContSpace && mustStartAb) {


            System.out.println("Valid password");
        }else{
            System.out.println("InValid password");
        }

    }}