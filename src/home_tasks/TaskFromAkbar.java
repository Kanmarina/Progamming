package home_tasks;

import java.util.Scanner;

public class TaskFromAkbar {
    public static void main(String[] args) {

  //      Task 1 :
  //      given 3 whole numbers variable num1, num2 ,
        //      num3 with value already set .
  //If the sum of the numbers are more than 100 print you have won
   //     if not print sum of 3 numbers are not more than 100
  /*      Scanner scan=new Scanner(System.in);
        System.out.println("put your number:");
        int  num1 = scan.nextInt();
        int num2  = scan.nextInt();
        int num3  = scan.nextInt();
       int sum = num1 + num2 +num3;
         if (sum >= 100){
         System.out.println("You have won");

         }else{
         System.out.println("sum of 3 numbers are not more than 100");
         }*/
 //       Task 2 :
        //      given 3 whole numbers variable  num1, num2 , num3 with value already set .
     //   and another int variable called sumOfSpecialNumber with initial value 0
  //      Write a program to print
  //      Only the sum of numbers that more than 20
  //      for example  10, 25, 30 . --->> 25+30=55
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("put your number:");
        int  num4 =scan.nextInt();
        int num5  =scan.nextInt();
        int num6   =scan.nextInt();
        int sum1=scan.nextInt();  ;
        if (num4 > 20 || num5> 20 ||num6 > 20) {
            System.out.println(sum1 = num4 + num5 + num6);
        }else{
            System.out.println("wrong number");
        }*/
 //       Task 3 :
  //      given 3 whole numbers variable num1, num2 , num3 with value already set .
 //       Write a program to
 //       find out the largest number and print the result
   /*     Scanner scan=new Scanner(System.in);
        System.out.println("put your number:");
        int  num1 = scan.nextInt();
        int num2  = scan.nextInt();
        int num3  = scan.nextInt();
        if (num1 > num2 && num1 >num3){
            System.out.println(num1);
        }else if (num2>num1 && num2>num3){
            System.out.println(num2);
        }else if (num3 > num1 && num3>num2){
            System.out.println(num3);
        }*/

//        Task 4 :
 //       given 3 whole numbers variable num1, num2 , num3 with value already set .
  //      Write a program with below logic
 //       it should print true if all the individual numbers are more than 100
 //       if not print not all numbers are more than 100
      /*  Scanner scan=new Scanner(System.in);
        System.out.println("put your number:");
        int  num1 = scan.nextInt();
        int num2  = scan.nextInt();
        int num3  = scan.nextInt();

        if (num1>100 || num2>100 ||num3>100){
            System.out.println("all numbers true");
        }else{
            System.out.println(" not true");
        }*/
 //       Task 5 :
 //       given 3 whole numbers variable num1, num2 , num3 with value already set .
//        Write a program with below logic
 //       add 100 to all the numbers less than 20 ;
 //       print out the value of each variable to test your code.


 //               Task 6 :
 //       given 3 whole numbers variable num1, num2 , num3 with value already set .
 //       Write a program with below logic

 //       if multiplication result of num1 and num2 greater than sum of all the numbers
//        print excellent result
// else
  //      not the numebrs combination I am looking for
        Scanner scan=new Scanner(System.in);
        System.out.println("put your number:");
        int  num1 = scan.nextInt();
        int num2  = scan.nextInt();
        int num3  = scan.nextInt();

        if ((num1 * num2) >= (num1+num2+num3) ){
            System.out.println("excellent result");
        }else {
            System.out.println(" not I am looking for");
        }
    }
}
