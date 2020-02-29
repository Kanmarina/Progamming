package day19;

public class ForLoopStairCase {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
             //first variation

        System.out.println("* ");
        System.out.println("* * ");
        System.out.println("* * * ");
        System.out.println("* * * * ");

        //second variation

        String star = "* ";
        System.out.println(star);

        star = star+ "* ";
        System.out.println(star);

        star = star+ "* ";
        System.out.println(star);

        star = star+ "* ";
        System.out.println(star);

       // third variation

        String star1 = " ";
        for (int i = 0; i < 4; i++) {
            star1 = star1+ "* ";
            System.out.println(star1);
        }

    }
}
