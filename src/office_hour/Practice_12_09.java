package office_hour;

import java.util.Arrays;

public class Practice_12_09 {
    public static void main(String[] args) {

        int num = 9;
        num = 15;
        System.out.println(num);

        int [] nums = new int[3];
        nums[0]=5;
        nums[1]=16;
        nums[2]=25;
        //print info about array
        System.out.println(Arrays.toString(nums));
        //how many numbers in Array
        System.out.println(nums.length);
        //when we want to get value from Array, we provide index
        System.out.println(nums[1]);
        //last value from Array
        System.out.println(nums[nums.length-1]);
        //middle value
        System.out.println(nums[nums.length/2]);
        int [] newNums = new int[]{1, 3, 4, 5, 7};
        System.out.println(newNums[newNums.length/2]);
        //how to find biggest number
        int max = newNums [0];
        int secondMax=max;
        int min = newNums[0];
        for (int index = 0; index <newNums.length ; index++) {
            if (newNums[index]>max){
                max = newNums[index];
            }
            //second greater number
            if (newNums[index] > secondMax && newNums[index]!=max ){
                secondMax=newNums[index];
            }
            //how to find minimum value
            if (newNums[index]<min){
                min =newNums[index];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
        System.out.println(min);
    }
}
