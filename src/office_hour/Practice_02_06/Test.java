package office_hour.Practice_02_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Kentucky obj1 = new Kentucky();
        obj1.KFC();
        obj1.tax();

        States obj2 = new Kentucky();
        obj2.tax();

        States obj3 =new California();
        obj3.tax();
        obj3.method1();

        List<States>list = new ArrayList<>();
        list.addAll(Arrays.asList(new Kentucky(),new California()));
        String name1 = list.get(0).stateName;

        System.out.println(name1);

        States [] arr = { new Kentucky(),new California()};
    }
}
