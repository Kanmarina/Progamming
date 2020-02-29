package day19;

import java.util.Scanner;

public class WarmTaskLoop_SpeedAction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting speed and ending");
       int start =scan.nextInt();
       int end = scan.nextInt();
       if (start <end){
           System.out.println("increesing the speed");
    for( int i=start ; i <= end; i++  ){
        System.out.print (i+" ");
        }
    }else if (start>end){
        System.out.println("decreesing the speed");
        for (int x = start; x >= end; x--) {
            System.out.println(x + " ,");
        }
    }else {
           System.out.println(" no action needed");
       }

    }
}
