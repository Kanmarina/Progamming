package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
      int []nums = {1,3,5,4,7};

      Arrays.sort(nums);

        System.out.println("nums = " + Arrays.toString(nums));

        changeArrayFirstItemTo100(nums);
    }

    /**
     *
     * @param numbers
     */

public static void changeArrayFirstItemTo100 (int [] numbers){

numbers[0]=100;
    }
}