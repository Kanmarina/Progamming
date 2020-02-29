package office_hour.Practice_02_03;

public class BA extends ScrumTeam {
    public BA(String employeeName,double salary) {
        this.jobTitle="Business Analyst";
        this.employeeName =employeeName;
        this.salary =salary;
    }

    @Override
    public void Demo() {
        System.out.println("BA "+this.employeeName+"is doing demo");
    }

    @Override
    public void DailyStandUp() {
        System.out.println("BA "+ this.employeeName+" is doing daily stand up");


    }
    public void gatherRegu(){
        System.out.println("BA "+this.employeeName+"");
    }
}
