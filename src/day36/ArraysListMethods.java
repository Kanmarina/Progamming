package day36;

import java.util.ArrayList;

public class ArraysListMethods {
    public static void main(String[] args) {

        //create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();
        //C.R.U.D.   Create, Read, Update, Delete
        //add item, insert an item, read item, update the item, remove the
        //item, check the location

        lst.add(12L);
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        System.out.println("lst = " + lst);

        //Counting items inside arraylist
        System.out.println("counting items using lst.size() = " + lst.size());

        //Getting items inside ArrayList object
        System.out.println("First item lst.get(0) = " + lst.get(0));
        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            sum += lst.get(i);
        }
        System.out.println("sum = " + sum);


        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS
     //   long sum = 0;
     //   for (int x = 0; x < lst.size(); x++) {
     //       sum = sum + lst.get(x); // x in here is index , so it's data type int

    //    System.out.println("sum = " + sum);


        // TASK : GET THE MAX OF ABOVE ARRAYLIST ITEMS
        long max = lst.get(0);
        for (int x = 0; x < lst.size(); x++) {

            sum = sum + lst.get(x);
            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("sum = " + sum);

        System.out.println("max = " + max);

    }
    }

