package office_hour.practice_02_11;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

public class Family {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        parent1.age =35;
        System.out.println(parent1.name);
        System.out.println(parent1.age);
        Parent parent2 = new Parent();
        Parent parent3 = new Parent();
        parent3.age = 54;
        System.out.println(parent3.age);

        //we have two ways to create object
        Parent parent4 =new Parent("name",55,123456);
        System.out.println(parent4.age );

        Parent parent5 =new Parent("anna",-1,-1);
        System.out.println(parent5.age );
    }
}
