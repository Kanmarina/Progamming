package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {
    public static void main(String[] args) {

       Employee e1 =new HourlyEmployee("Subi", 101,55,200);
      //  e1.calculateAnnualSalary();
        Employee e2=new HourlyEmployee("Marina", 101,55,200);
        Employee e3 =new FullTimeEmployee("Mara", 100,10000);


        List<Employee> allEmployee = Arrays.asList(e1,e2,e3);

        for(Employee each: allEmployee){
            System.out.println("each = " + each);
            System.out.println("name is : " + each.name);
            each.calculateAnnualSalary();
        }
    }
}
