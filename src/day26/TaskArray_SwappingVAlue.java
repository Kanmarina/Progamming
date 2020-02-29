package day26;

import java.util.Arrays;

public class TaskArray_SwappingVAlue {
    public static void main(String[] args) {


  // swap the first item value with last item value
 String name1 = "Emma";
 String name2 = "Jason";

 // name 2 should have Emma, name1 should have Jason

//        name1=name2;
//        name2=name1;

        String temp = name1;  //Emma
        name1=name2;
        name2 = temp;

        System.out.println(" name 1 "+name1);
        System.out.println(" name 2 "+name2);

        //swap the value of first item and last item
        int [] myNumbers = {10,40,30,7};
        int temp1 = myNumbers[0]; //temp now has 10
        myNumbers[0]= myNumbers[3]; // first item value become 7
        myNumbers[3] =temp1;
        System.out.println(" first item " + myNumbers[0]);
        System.out.println( "last item "+ myNumbers[3]);
        System.out.println( "my numbers = " + Arrays.toString(myNumbers));

        int temp2 = myNumbers[1];
        myNumbers[1]= myNumbers[2];
        myNumbers[2]= temp2;
        System.out.println( " second item " +myNumbers[1]);
        System.out.println( " 3 item "  +myNumbers[2]);
        System.out.println( "my numbers = " + Arrays.toString(myNumbers));
    }

}
