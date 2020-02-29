package MuchtarsClasses.day45;

 class TestBase {
  static   String chromeDriver;//default
     public static void TakeScreenShot(){
         System.out.println("took screenshot");
     }
     private static void closeBrowser(){
         System.out.println("browser closed");
     }
}

class Inheritance  extends  TestBase{
 //sub class is gonna inherit all teh visible or protected features from the parent class
 public static void main(String[] args) {
     System.out.println(chromeDriver);
 }
}

  /*  Features that have public or protected  can be inherited anywhere,
   even outside the package.



   Features that have default can be only be inherited
   to the class  that are in the same package



  Features that have private   can never be inhereted

*/