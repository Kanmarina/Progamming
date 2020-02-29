package day24;

public class AkbarTask7_shopping {
    public static void main(String[] args) {

        //Create a String array of 6 items to store groceryItems
        //{"apple","banana","grape","strawberry","blueberry","kiwi"}
        //Create a float array of 6 float values to store prices
        //{ 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        //assume that the order of grocery Items match the prices in same order.

        String [] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        String lastItem = groceryItems[groceryItems.length-1];

        for(String eachItem :groceryItems){
            System.out.print (eachItem+" ");
            if(!eachItem.equals(lastItem)){
                System.out.print (">>> ");
            }
        }



    }
}
