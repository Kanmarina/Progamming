package day32;

import java.util.Arrays;

public class ArrayPracticeMyself {
    public static void main(String[] args) {
        printArrayItems(new int[]{1,3,5,9,10});
        int[]scores = {5,65,87};
        printArrayItems(scores);

        printMax( scores);
        printMin(scores);
        printSum(scores);
    }
    public static void printArrayItems(int[]nums){
        System.out.println(Arrays.toString(nums));
    }

    public static void printMax(int[] nums){
        int  max =nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
    public static void printMin(int[]nums){
        int min = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println(min);
    }
    public static void printSum(int []nums){
        int sum=0;
        for (int each: nums) {
            sum=sum+each;

        }
        System.out.println(sum);
    }
}
