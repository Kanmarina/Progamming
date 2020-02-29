package office_hour.Practice_02_03;

public class Developers extends ScrumTeam {
    /*
        inherited features:
        variables: employeeName;
          jobTitle;
          salary
          methods:getEmployeeInfo();
         */

    public Developers(String emloyeeName,  double salary) {
        jobTitle="Software developer";
        this.employeeName=emloyeeName;
        this.salary=salary;
    }

    @Override
    public void Demo() {
        System.out.println("Developer "+ this.employeeName+" is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developer "+ this.employeeName +"attended daily stand up");

    }
    public void fixingBugs(){
        System.out.println ("Developer "+ this.employeeName +"is crying");
    }
}
