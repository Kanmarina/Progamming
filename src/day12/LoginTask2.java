package day12;

public class LoginTask2 {
    public static void main(String[] args) {
        String name = "Mara";
        boolean nameCheck = name.equals("mara");
        System.out.println(nameCheck);

        boolean nameCheck2 = name.equalsIgnoreCase("mara");
        System.out.println(nameCheck2);
    }
}
