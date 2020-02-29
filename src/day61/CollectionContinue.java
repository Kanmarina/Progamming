package day61;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {

        Collection<Integer>nums = new ArrayList<>();
        //collection interface as super type, pointing to and ArrayList object

        nums.addAll(Arrays.asList(1,6,4,5,7,8));
        System.out.println("nums = " + nums);

        //WE CAN'T USE GET METHOD WHEN WE HAVE COLLECTION AS REFERENCE TYPE
        //ONLY REFERENCE TYPE DECIDE WHAT WE CAN ACCESS

        List<Integer>nums2= new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);

    }
}
