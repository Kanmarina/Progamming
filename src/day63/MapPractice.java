package day63;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
//Create a Map of grocery items
//String , Double
//// add 7 items :
//// try to add duplicate keys and see
//// try to use putIfAbsent
//// print them out in one shot
//// Observe if there is any predictable order
//// get the 3rd item value and print
//// double the price of the first and last item
//// try to remove tomato
//// OPTIONALLY : USING THE PREVIOUS CLASS STRING
//// TRY TO GET A charFrequencyMap
//// your map should store character and it's frequency
////  AAABBCDDDD  -->> {'A'=3 , 'B'=2 , 'C'=1 ,'D'=4 ,

        Map<String, Double > groceryItems = new HashMap<>();

        groceryItems.put("Apple",2.55);
        groceryItems.put("Tomato",4.58);
        groceryItems.put("Ketchup",5.1);
        groceryItems.put("Milk",2.31);
        groceryItems.put("Yogurt",2.12);
        groceryItems.put("Potato",1.55);

        System.out.println("groceryItems = " + groceryItems);

        groceryItems.put("Apple",3.22);
        System.out.println("groceryItems = " + groceryItems);

        groceryItems.putIfAbsent("Apple",6.0);
        groceryItems.putIfAbsent("Pen",6.0);
    //    System.out.println("groceryItems = " + groceryItems);

        System.out.println("groceryItems.size() = " + groceryItems.size());
        System.out.println("groceryItems.get(\"Ketchup\") = " + groceryItems.get("Ketchup"));

        groceryItems.replace("Apple",2.55*2);
        System.out.println("groceryItems.get(\"Apple\") = " + groceryItems.get("Apple"));
        groceryItems.replace("Apple", groceryItems.get("Apple")*2);
        System.out.println("groceryItems = " + groceryItems.get("Apple"));
        double newPrice = groceryItems.get("Apple")*2 ;
        System.out.println("newPrice = " + newPrice);

        if (groceryItems.containsKey("Tomato")){
            groceryItems.remove("Tomato");
            System.out.println("No more tomato");
            System.out.println(groceryItems);
        }

    }
}
