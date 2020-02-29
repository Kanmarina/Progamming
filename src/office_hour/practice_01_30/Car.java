package office_hour.practice_01_30;

public abstract class Car {

    public abstract void start();
}
 class Toyota extends Car {
     @Override
     public void start() {
         System.out.println("push button");
         System.out.println("start engine");
     }

     class Jeep extends Car {
         public void start() {
             System.out.println("Call mechanic");
             System.out.println("oil change");
             System.out.println("start engine");
         }
     }

     class Test {
         public  void main(String[] args) {
             Jeep obj1 = new Jeep();
             obj1.start();
         }

     }
 }