package day44;

public class CyberHouse_Creator {
    public static void main(String[] args) {


       CyberHouse c1 = new CyberHouse(21710, "Modern");
    //   System.out.println("c1 = " + c1);
      CyberHouse c2 = new CyberHouse(22222, "Borocco");
  //    System.out.println("c2 = " + c2);

       c1.showAllInfo();
       c2.showAllInfo();
        CyberHouse.showNeighborhood();


    }
}