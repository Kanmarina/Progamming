package day022;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {

        //creating an array in second way

    /*    int[] ages = new int[]{3,5,11,33,57,18};

        int itemCount = ages.length;
        System.out.println(itemCount);


        for (int x = 0; x <itemCount ; x++) {
            System.out.println(ages[x]);
        }

        for (int x = itemCount-1; x >=0 ; x--) {
            System.out.print (ages[x]+" ");
        }
*/
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];

        for(int i = 1 ; i<=5 ; i ++){
            nums[i] = input.nextInt() ;
            if (i  %2 !=0) {
                int sum = 0;
                sum = sum +  i ;
                System.out.println(sum);
            }}

        }
    }




