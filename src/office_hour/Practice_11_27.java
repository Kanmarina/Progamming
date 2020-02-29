package office_hour;

public class Practice_11_27 {
    public static void main(String[] args) {
        String message = "  A  BC  ";

        //TRIM

        //take out spaces at the beginning and ending of String message
       //It does not TAKE OUT THE SPACE IN BETWEEN CHARACTERS

        System.out.println("message = <"+ message + ">");

        String messageTrimmed = message.trim();
        System.out.println("message = <"+ messageTrimmed + ">");

     //isEmpty >> Check whether a String object is empty,
        // meaning there is nothing inside
        //isEmpty == yourString.length()= 0 >>true

        String emptySpaces ="      ";
        System.out.println("emptySpaces =<"+ emptySpaces+ ">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is :"+emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty??? : "+ emptySpacesAfterTrimmed.isEmpty());

     //isEmpty VS isBlank method from String class
        //isEmpty >> yourString.length()>0 true else its false
     //isBlank >> if you have only white spaces, get true, else get false
        System.out.println("emptySpaces is blank or not ?"+ emptySpaces.isBlank());



        // indexOf  give you location of the string you are
        // looking for inside another String
        //for example yourString.indexOf("abc");
        //copied from above so we can see what we
        // have  > String message = " I love Java";

        int locationofLove = message.indexOf("LOVE");
        int lastIndexOfLetterA = message.lastIndexOf("A");
        System.out.println("lastIndexOfLetterA ="+ lastIndexOfLetterA);

    }
}
