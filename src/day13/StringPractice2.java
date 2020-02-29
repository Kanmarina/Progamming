package day13;

public class StringPractice2 {
    public static void main(String[] args) {

        String name = "Muge";
        System.out.println( name );
//        name = "Cat";

 //       System.out.println( name );

        name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toUpperCase());

        name=name.toUpperCase();
        System.out.println(name);

        //check if String start with another string
        //IT IS CASE SENSITIVE

        System.out.println(name.startsWith("MU"));
        System.out.println(name.startsWith("mu"));
        System.out.println(name.startsWith("Ma"));
        System.out.println(name.startsWith("Me"));

    }
}
