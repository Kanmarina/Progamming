package MuchtarsClasses.day43_Review_StaticInitEncaps;

public class Test {

    static int a;
    int b;

    long total =100;
     public Test(){
         total -=50;
   }
public Test(int total){
        this();
        this.total =2000;

}
    public static void main(String[] args) {






        Test obj1 = new Test();
        obj1.b =10;
        obj1.a =20;
        Test obj2= new Test();
        obj2.b =30;
         obj1.a =40;

        System.out.println(obj1.b);//10
        System.out.println(obj2.b);//30
        System.out.println( obj1.a);//20 //40
        System.out.println(a); //20  //40
        System.out.println(obj2.a);//20  //40
    }
}
