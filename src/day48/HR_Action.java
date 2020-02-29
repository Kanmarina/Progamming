package day48;

public class HR_Action {
    public static void main(String[] args) {
        
        HourlyEmployee e1=new HourlyEmployee("Subi", 101,55,200);
        e1.calculateAnnualSalary();

        System.out.println("e1 = " + e1);
        HourlyEmployee e2=new HourlyEmployee("Marina", 101,55,200);
        e2.calculateAnnualSalary();

        System.out.println("e2 = " + e2); 
        
        FullTimeEmployee e3 =new FullTimeEmployee("Mara", 100,10000);
        e3.calculateAnnualSalary();
        System.out.println("e3 = " + e3);

        FullTimeEmployee e4 =new FullTimeEmployee("Kan", 100,15000);
        e4.calculateAnnualSalary();
        System.out.println("e4 = " + e4);
    }
}
