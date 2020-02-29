package day08;

public class IfStatement {
    public static void main(String[] args) {

    int speedLimit = 60;
    int yourCurrentSpeed= 100;

    //if the current speed more than speed limit
        //get pulled over by the police
        //given ticket by the police
        //taken away some points on your license
        //go to court
        boolean IamSpeeding =  yourCurrentSpeed > speedLimit ;
        //inside Parenthesis we can only put
        //boolean value: true or false
        //boolean variable
        //Any expression that return boolean value

       // if (IamSpeeding ) {
       //if(true){
        if (yourCurrentSpeed > speedLimit){
            System.out.println("get pulled over by the police");
            System.out.println("given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");
        }else{
            System.out.println("going shopping!!");
            System.out.println("buy ice cream!!");
            System.out.println("enjoy yor day!!");
        }


        System.out.println("The end");

        //if not over the limit
        //go shopping!!!

        //outside if statement, say the end



    }

}
