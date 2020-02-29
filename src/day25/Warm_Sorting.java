package day25;

import java.util.Arrays;

public class Warm_Sorting {
    public static void main(String[] args) {

        int [] nums = {13,31,8,5,21,2};

        //storing the size of array into variable
        int numsCount = nums.length;

        //I want to copy the content of nums array into the new array

        //creating an arra with same size as original array
        int [] numsCopy = new int[numsCount];
        numsCopy[0]=13;  // copying one by one from original array
        numsCopy[1]=31;
        numsCopy[2]=8;
        numsCopy[3]=5;
        numsCopy[4]=21;
        numsCopy[5]=2;

        for (int x = 0; x <numsCount ; x++) {
            numsCopy[x]= nums[x];
        }

        System.out.println("nums copy = "+ Arrays.toString(numsCopy ));

        Arrays.sort(numsCopy);
        System.out.println( "after sort = " + Arrays.toString(numsCopy ) );

//check whether the array still have same content
// in same order after sorting
        //what method will check content

        if (Arrays.equals(nums,numsCopy)){
            System.out.println(" This array is already sorted");
        }else{
            System.out.println(" This array is not already sorted");
        }
    }
}
