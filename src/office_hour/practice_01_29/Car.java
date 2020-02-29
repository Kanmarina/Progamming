package office_hour.practice_01_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

      String brand;

      Engine e ;

//    String [] passengers;
      List<String>passengers=new ArrayList<>();

    public static void main(String[] args) {
         Car c1 =new Car();
         
         c1.brand =new String("Toyota"); //"Toyota"
         c1.e      =new Engine("V6",270);
   //    c1.passengers =new String[]{"Mara","Akdlk","Sdsf","Ssfsdf"};
         c1.passengers= Arrays.asList("Mara","Akdlk","Sdsf","Ssfsdf");

        System.out.println("c1 = " + c1);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +// ",passengers"+ Arrays.toString(passengers)+
                '}';
    }
}
