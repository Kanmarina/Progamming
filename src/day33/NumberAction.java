package day33;

public class NumberAction {
    public static void main(String[] args) {
        System.out.println(   getsumFrom1tox(10));
        System.out.println( build_GOT_Email( "marina","kan"));
    }

    /**
     * getSumFrom1toX
     * This method should calculate the sum of
     * the numbers from 1 to the number user passed
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     */
    public static int getsumFrom1tox(int x){
        int sum=0;
        for (int i = 1; i <=x ; i++) {
            sum+=x;

        }
        return sum;
    }
/**
 * build_GOT_Email
 * This method should build email using user's first and last name
 * for example Jon Snow --->> JSnow@NightWatch.com
 * @param firstName user's first name
 * @param lastName  user's last name
 * @return the email created using
 * firstName initial+lastname+@NightWatch.com
 */
public static String build_GOT_Email(String firstName, String lastName){
  //  String email="";
 //   email+=firstName.toUpperCase().charAt(0)+lastName+"@NightWatch.com";
 //   return email;
    return firstName.toUpperCase().charAt(0)+lastName+"@NightWatch.com";
}

}
