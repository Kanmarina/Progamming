package home_tasks;

import java.util.Arrays;

public class MentoringPractice_Array_ArrayList {
    public static void main(String[] args) {

        int [] arr = {12,13,14,15};

        int [] arr2 = new int [5];
        arr2 [0] =10;
        arr2 [1]=20;
        arr2 [2]=20;
        arr2 [3]=20;
        arr2 [4]=20;
        arr2 [5]=20;

        int arrayLength =arr.length;
        System.out.println("arrayLength = " + arrayLength);
        System.out.println(Arrays.toString(arr ));
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr2[2]);

        int []arr4 =new int [6];
        for(int i =0; i<=arr4.length-1;i++){
            arr4[i]=10;
            arr4[i]=10+(i*10);
        }
        System.out.println(Arrays.toString(arr4));
    }
}
