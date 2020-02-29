package MuchtarsClasses.day46_SuperKeyword;


class A {
    String name = "Madina";
    public void methodA(){

    }
    public  A (int a){

    }
}
public class SuperKeyword extends A {
public SuperKeyword(int a){
    super(10); //super class constructor MUSt be called in the subclass
}
    public void method(){
        super.name ="Maher";
        this.name ="Inaslak";
        super.methodA();


    }
}
