package day24;

public class ForEachLoop {
    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println("myFavNumber = " + myFavNumber);
        System.out.println("yourFavNumber = " + yourFavNumber);

        long[] nums = {10, 40, 20};

        //how do i double my first item in the array
        //  nums[0] = nums [0] * 2;
        //  System.out.println(nums[0]);

        for (int x = 0; x < 3; x++) {
            long eachItem = nums[x];
            eachItem = 100;
            //      nums[x] = nums [x] * 2;

        }


        for( long eachItem :nums){
            eachItem=100;

            //NEVER USE FOR EACH LOOP TO MODIFY ARRAY ITEMS
            //CAUSE WE WORKING WITH COPY WHICH CANT MODIFY IT
        }
        //how do i know array items are modified or not re=print
        System.out.println("After we modify the value");
        for (int x = 0; x < 3; x++) {

            System.out.println(nums[x]);
        }
    }
}