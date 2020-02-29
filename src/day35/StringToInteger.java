package day35;

import day06.UsingTheValueOfTheVariables;

public class StringToInteger {
    public static void main(String[] args) {

        //I have a employee ID : "FB -457"
        // give me the employee number and store it into a number

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        String empID = "FB -457";

        /*
        *Integer class is class coming from java.lang package
        * its primarily used for wrapping up primitive value and treat it
        * what we will focus here is though
        * many usefull static methods it provide already
        * parseInt is a static method of Integer class
        * it will turn a String that has only numbers and rerturnint result
        * if we have any non-numerical chas >> it will throw NumberFormatExeption
        *
         */
        
        //int id = Integer.parseInt( empID.split("-")[1];
        String [] empIDSplit =empID.split ("-");
        String idStr = empIDSplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id = " + id);


        String num1Str="100";
        String num2Str ="600";
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        System.out.println("sum of numbers = "+ (num1+num2));

    }
}
