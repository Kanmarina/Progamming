package day11;

public class Target {
    public static void main(String[] args) {



   /* String  bedroom  = "";
    String livingRoom = "Lr";
    String kitchen = "Ki";
    String hallway = "Ha";*/
        String room = "Lr";
        switch(room){
            case"Bd ":
                System.out.println("You have turned on bedroom light");
                break;
            case"Lr":
                System.out.println("You have turned on living room light");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "Ha":
                System.out.println("You have turned on hallway light");
                break;
            default:
                System.out.println("wrong");
                break;
        }
    }
}