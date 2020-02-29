package day09;




 public class Task2<age> {
     public static void main(String[] args) {


         String cityzenType;

         int age = 80;
         if (age > 65) {
             cityzenType = "Senior";
         } else {
             cityzenType = "Not-Senior";

         }
         System.out.println(" The citizen age" + age + " ,and he is a "+cityzenType);
     }
 }