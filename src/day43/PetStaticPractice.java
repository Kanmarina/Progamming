package day43;

public class PetStaticPractice {
    public static void main(String[] args) {

        Pet.showGeneralPet();

        Pet p1 = new Pet( "cat","yum,yum") ;
        System.out.println("p1.getName() = " + p1.getName());
        p1.speak();
    }
}
