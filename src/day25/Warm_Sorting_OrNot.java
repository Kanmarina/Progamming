package day25;

import java.util.Arrays;

public class Warm_Sorting_OrNot {
    public static void main(String[] args) {

        int [] nums = {13,31,8,5,21,2};
        System.out.println(Arrays.toString(nums));


        for (int x = 0; x <nums.length -1 ; x++) {

        System.out.println( nums[x] + " "+ nums[x+1] );
        //pick first itme and compare with second
            //keep reapiting until there is no more item

            //print is item1 is less than item2
            System.out.println( "is "+nums[x]+ " less than "+ nums[x+1]+
                    " ? "+ (nums[x]< nums[x+1]));
            if( !(nums[x]< nums[x+1])){
                System.out.println("Array is not sorted");
                break;
            }
        }

    }
}
