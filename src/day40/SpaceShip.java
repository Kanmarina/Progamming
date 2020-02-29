package day40;

public class SpaceShip {
    String name;
    int x ;
    int y ;
    String currentDirection;

    public void setInitialPosition(int newX,int newY){
    x=newX;
    y=newY;
    }
public  void setDirection(String newDirection){
        if(     newDirection.equalsIgnoreCase("up")||
                newDirection.equalsIgnoreCase("down")||
                newDirection.equalsIgnoreCase("right")||
                newDirection.equalsIgnoreCase("left")  ) {
            currentDirection = newDirection;
        }else{
            System.out.println(("Invalid direction"));
        }

}


public void move1Block() {
    switch (currentDirection){
        case "right":
            x++;
            break;
        case "left":
            x--;
            break;
        case "up":
            y++;
            break;
        case "down":
            y--;
            break;
        default:
            break;
    }
}


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}
