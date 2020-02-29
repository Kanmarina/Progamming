package day39;

public class Car {
    String model;
    int year;
    String color;

    public void goForward(){
        System.out.println(model+" going forward");
    }
    public void printCarAge(){
        System.out.println("car age: "+ (2020-year));
    }
}
