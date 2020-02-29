package MuchtarsClasses.day45;
class Data{
    public String name;
    private String age;
    String ID;
    public void Hello(){ //public
        System.out.println("Hello");
    }
    private void Hola(){//private
        System.out.println("Hola");
    }
    void Aloha(){ //default
        System.out.println("Aloha");
    }
}
public class MultiClassPractice {
    public static void main(String[] args) {
        Data obj =new Data();
        System.out.println(obj.name); //public
        //System.out.println(obj.age);//private is not visible outside class
        System.out.println(obj.ID);//default is visible to class

        /*
        if two classes were located in two different packages, then the default
        is not gonna visible

         */
        obj.Hello();
      //
        //  obj.Hola();
        obj.Aloha();
    }
}
