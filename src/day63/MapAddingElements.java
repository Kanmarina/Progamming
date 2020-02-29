package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {
        //creating Hash MAp object
        Map<String,Integer>nameAgePair = new HashMap<>();
        //adding elements: put
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muha",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Alisa",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("MAri",16);
        nameAgePair.put("Zehra",8);
        System.out.println("nameAgePair = " + nameAgePair);

        //getting the size of a map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        //how do we get an value according to the key
        System.out.println("Zehra's age  = " + nameAgePair.get("Zehra"));

        //how do I check a key alreagy exist or not
        // containsKey method
        System.out.println("nameAgePair.containsKey(\"MAri\") = " + nameAgePair.containsKey("MAri"));
        System.out.println("nameAgePair.containsKey(\"Hasan\") = " + nameAgePair.containsKey("Hasan"));

        //how do I noly add items if it does not exist already
       nameAgePair.putIfAbsent("Zehra", 10) ;

       //Updating the element in the Map using replace
        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));

      //if i dont have the key, it will just add new one and thats not what we want, we only want to update
        //updating the value only if the old value equals to a specified value
        nameAgePair.replace("Zehra", 8,10);
        System.out.println("nameAgePair.get(\"Zehra\" = " + nameAgePair.get("Zehra"));

        //removing Entry
        nameAgePair.remove("Fatih");
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.after removing Fatih = " + nameAgePair );
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));


    }
}
