package office_hour.Practice_02_03;

public class Testers extends ScrumTeam {


    /*
        inherited features:
        variables: employeeName;
          jobTitle;
          salary
          methods:getEmployeeInfo();
         */

    public Testers(String emloyeeName, String jobTitle, double salary) {
        this.employeeName =emloyeeName;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public void Demo() {
        System.out.println("Tester "+this.employeeName +"doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester "+this.employeeName +"is attending");
    }
    public void foundBug(){
        System.out.println("Tester "+this.employeeName +"reported a bug");
    }
}
