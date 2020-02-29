package day43;
//Pet
//  attributes
//		type
//		name
//  constructor :
//  		no arg constructor
//  			set the breed to "unknown"
//  			set the name to "noname"
//  		2 args constructor
//  			set the name and breed to what the caller passed
// behaviours
// 		getters , setters , toString
// 		speak
// 			accept no parameter
// 			according to the type speak following
// 				cat --> meow
// 				dog --> woof
// 				cow --> mooo
// 				horse --> neinei
//Create another class called PetStore with main method
//	Create 8 Pet objects with initial value
//	Store them into a List<Pet>
//	1, print out all info
//	2, print out only name
//	3, print out only cats

public class Pet {
    private String type;
    private String name;
public Pet(){
    this.type ="unknown";
    this.name ="no-name";
}
    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Pet{" +
                "breed='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public void speak() {
        switch (type.toLowerCase()) {
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "cow":
                System.out.println("moo");
                break;
            case "horse":
                System.out.println("neigh");
                break;
            default:
                System.out.println("unknown pet");
        }
    }
    //if your method does not read or modify object attribute
    //you can just make it static
    public static void showGeneralPet(){
            System.out.println("Pets are friend of humans");
            //this will not work
        //static method can not
        }
    }



