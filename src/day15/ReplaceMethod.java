package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        //replace method of the string
        //it will go through all part of string and replace
        //any match with the new string

        String message ="I love Pumpkin , Pumpkin is fun!";

        message.replace("Pumpkin" , "Java");
        System.out.println(message);
        message=message.replace("Pumpkin" , "Java");
        System.out.println(message);

        //what if i wanna replace space from everywhere

        String message2 = "Happy Thanks Giving to All";
        // turn "Happy Thanks Giving to All" to "Happy ThanksGiving to All"
        message2 = message2.replace("Thanks Giving","Thanksgiving");
        System.out.println(message2);

    }
}
