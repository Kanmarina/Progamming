package office_hour.Practice_02_03;

public class BankOfAmerica_BOA {
    public static void main(String[] args) {
        BA Mara =new BA("Mara",200000);
     //   Mara.getEmployeeInfo();

        BA Kan =new BA("Kan",145000);

        Testers Sedan = new Testers("Sedan","QA",120000);
        Testers Sevim = new Testers("Sevim","SDET",150000);
        Testers Samir = new Testers("Samir","MAnual tester",100000);

        Testers[]testers ={Sedan,Sevim,Samir};
        BA []BATeam ={Mara,Kan};
        ScrumTeam [][]scrum ={testers,BATeam};

        for(ScrumTeam[] eachArray:scrum){
            for(ScrumTeam eachMember:eachArray){
                eachMember.getEmployeeInfo();
            }
        }
    }
}
