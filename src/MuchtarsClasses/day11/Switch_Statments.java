package MuchtarsClasses.day11;

public class Switch_Statments {
    public static void main(String[] args) {

     int z =10;
        switch (z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");

            case 12:
                System.out.println("Wednesday");
            default:
                System.out.println("Friday");
        }
    String opt1  =  "true";
        switch (opt1){
            case "true":
                System.out.println("true");
            case "false":
                System.out.println("false");

            default:
                System.out.println("false");
        }
//        System.out.println("done");

        int i =10;
        int j= 20;
        int k = j += i/5;
        System.out.println(k);
        System.out.println(j);
    }
}
