package MuchtarsClasses.day43_Review_StaticInitEncaps;

public class Static_Vs_Ins_constructor {

    static {
        System.out.println("Static block");
        //executed as soon as the class is loaded, only once
    }
    {
        System.out.println("instance block");
        //executed when the object is created, runs before the constructor
    }
    public Static_Vs_Ins_constructor(){
        System.out.println("Constructor");
        //executed when the object is created, runs before instance block
    }

    public static void main(String[] args) {
        Static_Vs_Ins_constructor obj1 = new Static_Vs_Ins_constructor();
        Static_Vs_Ins_constructor obj2 = new Static_Vs_Ins_constructor();
        //number of execution of constructor and instance block depends of the number objects
    }
}
