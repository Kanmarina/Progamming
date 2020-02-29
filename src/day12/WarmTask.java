package day12;

import java.util.Scanner;

public class WarmTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what weather in your city");
        String weather= scan.next();
                if (weather.equals("Sunny")){
                    System.out.println("Sunny weather");
                }else  if (weather.equals("Rainy")){
                    System.out.println("Rainy weather");
                }else  if (weather.equals("Cloudy")){
                    System.out.println("Cloudy weather");
                }else {
                    System.out.println("Rain or shine just keep coding anyway");
                }

    }
}
