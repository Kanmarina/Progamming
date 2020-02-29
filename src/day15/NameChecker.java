package day15;

public class NameChecker {
    public static void main(String[] args) {
        String name ="MArina";

        if (name.length()  < 4){
            System.out.println("Short name");
        }else if (name.length() >= 4 && name.length() <= 10){
            System.out.println("Medium name");
        }else if (name.length() >= 11) {
            System.out.println("Longer name");

        }
            if (name.contains("a") ||name.contains("e") ){
                System.out.println("name contains a or e");
            }else{
                System.out.println(" I don't have both a or e in my name");
        }
        System.out.println( name.charAt(5));
        System.out.println( name.charAt(4));
        System.out.println( name.charAt(3));
        System.out.println( name.charAt(2));
        System.out.println( name.charAt(1));
        System.out.println( name.charAt(0));

    }
}
