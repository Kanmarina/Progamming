package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {
    public static void main(String[] args) {
        List<String>groceries = Arrays.asList("Eggs", "Milk", "Butter","Apple","Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String>newLst = new ArrayList<>(groceries);
        newLst.add("Diet coke");
        newLst.add("Sugar");
        System.out.println("newLst = " + newLst);
        
        List<String>newItemsToAdd= Arrays.asList("Pasta", " asparagus","spinach");

        // Adding one list to another list
        // we want to add all items inside newItemsToAdd to newLst
        newLst.addAll(newItemsToAdd);
        System.out.println("new Lst with all items = " + newLst);


        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(2000);
        nums2.add(1000);

        // add all nums2 items into nums1
        nums1.addAll(nums2);
        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);

//add 4 items to nums2 using 100,200,300,400

    }
}
