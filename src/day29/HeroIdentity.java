package day29;

public class HeroIdentity {
    public static void main(String[] args) {
        //assume this can be different hero
        String hero1 = "Superman-Clark J Kent";
        //hide this Hero identity
        //String herox= "Superman-************";

        //given a String with hero code and name separated by -
        //turn this string into hero code and * with the
        // same length as hero name

     //Plain English logic:
        //split it by - to get the code and full name
        //get the length of full name
        //generate stars with same length as full name character count
        //concatenate hero code with dash (-) and stars (*) and save it

        // OR one the star is generated, replace full name with Stars

        String [] heroSplited = hero1.split("-");
        String heroCode = heroSplited[0];
        String fullName = heroSplited[1];

        int nameCharCount = fullName.length();
        String stars ="";
        for (int i = 0; i <nameCharCount ; i++) {
            stars= stars+"*"; //stars += "*"
        }
        System.out.println(fullName);
        System.out.println(stars);

        String heroX = heroCode + "-"+stars;
        System.out.println("hero1 ="+ hero1 );
        System.out.println("heroX ="+ heroX );
        System.out.println("----------------------------------");

        String stars1 ="";
        for (int i = 1; i <fullName.length() ; i++) {
            stars += "*";
        }
        String heroX1= hero1.replace(fullName, stars);
        System.out.println("hero1 ="+ hero1 );
        System.out.println("heroX ="+ heroX1 );
    }
}
