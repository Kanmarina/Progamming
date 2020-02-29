package home_tasks;

import java.util.ArrayList;

public class Repl216_Get_Array_From_ArrayList {
    public static void main(String[] args) {

        ArrayList<String[]> arr = new ArrayList<String[]>();
        arr.add(new String[]{"1","title 1","content"});
        arr.add(new String[]{"2","title 2","content"});
        arr.add(new String[]{"3","title 3","content3"});


        System.out.println(blogDb(arr,"3"));
        //should output:
        //title 3
        //content3
    }
    public static String blogDb(ArrayList<String[]> r,String id)  {

        String result ="";

        for (int i = 0; i < r.size(); i++) {
            for (int j = 0; j < r.get(i).length; j++) {
                if (r.get(i)[j].equals(id)) {
                    result = r.get(i)[1] + "\n" + r.get(i)[2];
                }
            }
        }
        return result;
    }
}
