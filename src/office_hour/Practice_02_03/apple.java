package office_hour.Practice_02_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class apple {
    public static void main(String[] args) {
        Testers Hasan = new Testers( "HAsan","MAnual tester",85000);
     /*
        System.out.println(Hasan.jobTitle);
        System.out.println(Hasan.employeeName);
        System.out.println(Hasan.salary);
*/
     Hasan.getEmployeeInfo();
     Testers Alisa = new Testers("Alisa","SDET",90000);
     Testers Rauf =new Testers("Rauf","SDET",120000);

        List<Testers>testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(Hasan, Alisa, Rauf));

        for(Testers eachtester:testersTeam){
            eachtester.getEmployeeInfo();
            System.out.println("________________________________");

        }
        Developers Vladislav = new Developers("Vladislav",130000);
      //  System.out.println(Vladislav.employeeName);
         Vladislav.getEmployeeInfo();

         Developers Emel =new Developers("Emel",1300050);
         Developers Muge =new Developers("Muge", 130060);

         List<Developers>developersTeam = new ArrayList<>();
         developersTeam.addAll(Arrays.asList( Vladislav,Emel,Muge));

         for(Developers eachDevelopers :developersTeam){
             eachDevelopers.fixingBugs();

         }
         List<ScrumTeam>scrum =new ArrayList<>();
         scrum.addAll(testersTeam);
         scrum.addAll(developersTeam);

         for(ScrumTeam eachMember : scrum){
             eachMember.getEmployeeInfo();
         }

    }
}
