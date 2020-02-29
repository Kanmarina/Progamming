package day23;

public class ForEachLoop_Practice {
    public static void main(String[] args) {

       long [] salaries = { 100000, 110000, 150000, 650000, 90000};

         for( long eachSalary : salaries) {
            System.out.println(eachSalary);
         }
         for (long salary : salaries){
        if (  salary > 100000){
            System.out.println(salary );
        }

        long sum =salaries[0];
        for(long  asalary : salaries){

        }
        long max = salaries[0];
        for ( long salary1 : salaries){
            if(salary> max){
                max=salary;
            }
        }
             System.out.println("max " + max);
}
    }
}
