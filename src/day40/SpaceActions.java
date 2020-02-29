package day40;

public class SpaceActions {
    public static void main(String[] args) {

        SpaceShip space = new SpaceShip();
        space.name = "NASA";

        space.setInitialPosition(1,5);
        space.setDirection("up");
        space.move1Block();
        System.out.println(space);

        space.setDirection("ABC");
        space.move1Block();
        System.out.println(space);

        space.setDirection("down");
        space.move1Block();
        System.out.println(space);



    }
}
