package day32;

public class StringAction {
    public static void main(String[] args) {

       /* reversePrintMyOwnName
                * create a method that has no parameter
        and print your name in reversed order*/
        reversePrintName();
        nameDash();
        printStringWithDashBetween("MARINA");
        printStringWithDashBetween("MAXIM");
        printStringWithDashBetween("SERGEY");

    }

    public static void reversePrintName() {
        String name = "Amrina";

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void nameDash() {
        //print chars with dash in between
        //don't put last
        String name = "Marina";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void printStringWithDashBetween(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

}