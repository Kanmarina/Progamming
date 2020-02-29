package day27;

public class ArrayTaskMax {
    public static void main(String[] args) {

        //write a program thst returns the maximum
        //from array
        //do not use sort method

        int [] nums = {100,10000,999,888,-12};
        int max = nums [0];
        for (int i = 0; i <nums.length ; i++) {
            if( max < nums[i]){
                max= nums[i];
            }
        }
        System.out.println("first max number: " + max);
        int secondMax = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(secondMax < nums[i] && nums[i] != max){
                secondMax =nums[i];

            }
        }
        System.out.println(" Second max number : " + secondMax);
    }
}
