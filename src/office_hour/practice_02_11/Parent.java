package office_hour.practice_02_11;

public class Parent   {
     String name;
     int age;
     int SSN;

     //constructor
    public Parent(){
name ="MAX";
    }

    public  Parent(String name, int age, int SSN){
        this.name =name;
        this.age =age;
        this.SSN =SSN;
    }
    public void cookFood(String foodName){
        System.out.println("Cooking " + foodName);
    }
    //methods --> actions
    // void return
    //1- User Story   --> 3 test cases
    //
     public static void hi(){
         System.out.println("hi");
         System.out.println(12345);
         System.out.println(false);
     }

     //with return type we promise to return one data type only
     public static String hello(){
      return "hello";
}
    public static void main(String[] args) {
         //call void method =call by name
        hi();

        //call return method = 2 ways to call it
        System.out.println(hello());
        String greating =hello();
        System.out.println(greating);

        String word = "java";
        System.out.println(word.length());

        int lengthOfWord = word.length();
    }
}
