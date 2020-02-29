package home_tasks;

public class Max_Array {
    public static void main(String[] args) {

        int [] nums = {1,34,45,6,7,43};
        //             1  2  3 4 5  6
        // compare each with others
        int max =nums[0];
         for(int i=0; i<nums.length; i++){
             //now we check true
             if (nums [i]>max){
                 max=nums[i];
             }
         }
        System.out.println(max);
    }
}
