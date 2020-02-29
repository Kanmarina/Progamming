package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {

    public static void main(String[] args) {
//arrays: a variable that allows us to store multiple values
        //regular variables only store only single value
        //: int a= 10

        //but array variables more than one:
        //int[]arr={1,2,3};
        //index:    0 1 2

        //retrieve data:
        // arrName [indexNumber] >>> element of that index number
        // arr[2] >>>3

        //Array   Array MUST be converted to String in order to be printed
        //  Array's size is fixed, must be initialized before we use it

        int num = 10;
        int [] arr ={10,20,30,40,50,60};
        //last index num: arr[arr.length -1];
        int num1 = arr [arr.length-1];

        System.out.println(num1);

        //expected: 10 20 30 40 50 60
        for(int x =0; x <= arr.length;x++){
            System.out.println(arr[x]+"");
        }
        System.out.println("\n_____________");

        //Arrays.toString(variable Name)
       String str =  Arrays.toString(arr);
        System.out.println( str );

        //Task01:
        Scanner scan =new Scanner(System.in);
         int[] numbers = new int [5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter your number: ");
            int input = scan.nextInt(); //returns int data type
            numbers[i] = input;
        }
        System.out.println( Arrays.toString(numbers));

        //sort the array in ascending order
         Arrays.sort(numbers);

         int largestNumber = numbers [numbers.length-1];
         int minimumNumber = numbers [0];
        System.out.println( largestNumber);
        System.out.println(minimumNumber);



    }
}
