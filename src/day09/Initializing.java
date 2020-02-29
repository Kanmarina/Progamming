package day09;

public class Initializing {
    public static void main(String[] args) {
        //int num;
        //a variable inside a method must get initial value
        //before it's being used for the first time
        //and there
      //  System.out.println(num);

        //language Picker
        //assume you are on the call and you have been
        // given option to be greeted by the languge of your choice
        // according to the number you provided

/*       1 >> "Hello"
        2 >> "Salam"
        The programm should set the value of a string
        variable called greeting
        Print out "Hello,
        Print out "Hello, SDET
 */
        System.out.println("Welcome to Cybertek Call Center ");

        System.out.println("Please select your language option from 1-7");

        int languageOption = 1;
        String greeting = "";


        if (languageOption == 1) {
            greeting = "Salam";
        } else if (languageOption == 2) {
            greeting = "Hello";
        } else if (languageOption == 3) {
            greeting = "privet";
        } else if (languageOption == 4) {
            greeting = "Szia";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "hola";
        } else if (languageOption == 7) {
            greeting = "Bonjour";
        } else {
            greeting = "Unknown";
        }
        // Hello, SDET
        greeting = greeting + " , SDET";

        System.out.println("This is how the greeting message you get : " + greeting);


    }
}
