package day39;

public class CarCreation {
       public static void main(String[] args) {

        Car c1 = new Car();

        c1.model ="BMW";
        c1.year = 2020;
        c1.color = "gold";
        System.out.println("c1.model = " + c1.model);
        System.out.println("c1.year = " + c1.year);
        c1.goForward();
        Car c2 = new Car();

        c2.model ="Honda";
        c2.year = 2015;
        c2.color = "red";
        System.out.println("c2.model = " + c2.model);
        System.out.println("c2.year = " + c2.year);

        c2.color = c1.color;

        System.out.println(c1.model+" | "+c1.year+" | "+c1.color);
        System.out.println(c2.model+" | "+c2.year+" | "+c2.color);
    }
}
