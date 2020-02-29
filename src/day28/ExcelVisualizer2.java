package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {


        int[][]  myExcel = {
                           {10,27,88,99 }, //index 0: first 1d array
                           {87,100 },     //index 1:  second 1d array
                           {90,45,65 }    //index 2: third 1d array
                           };

        //deepToString
        //1. it takes an multiD array and turned into a
        // String with all items
        //2. the multiD array object or the multiD array variable
        //3. String representation of multiD array object

        System.out.println(Arrays.deepToString(myExcel));
 for( int[]  eachRow :   myExcel){
     for (int eachCell : eachRow ){
         System.out.print  (eachCell + " ");
     }
     System.out.println();
 }



    }


}
