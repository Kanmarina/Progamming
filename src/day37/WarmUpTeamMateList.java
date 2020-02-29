package day37;

import java.util.ArrayList;

public class WarmUpTeamMateList {
    //Warm up:
    //Create Arraylist of String and store
    //teamMates
    //print one by one
    //print reverse
    //print first last
    //print 2 at a time
    //concat everyone in one string separated by -
    public static void main(String[] args) {

        ArrayList<String> myTeam = new ArrayList<>();
        myTeam.add("Karima");
        myTeam.add("Kamran");
        myTeam.add("Esra");
        myTeam.add("Hasan");
        myTeam.add("Kenan");
        myTeam.add("Khayyam");
        myTeam.add("Muammer");
        myTeam.add("Nuran");
        myTeam.add("Mussie");
        myTeam.add("Ramil");
        myTeam.add("Yeliz");
        myTeam.add("Abdulkadir");
        myTeam.add("Dilmurod");
        myTeam.add("Marina");
        System.out.println(myTeam + " ");

        //print first last
        System.out.println("first name " + myTeam.get(0));
        int lastName = myTeam.size() - 1;
        System.out.println("last name " + myTeam.get(lastName));

        //print one by one
        System.out.println("\nAll names : ");
        for (int i = 0; i < myTeam.size(); i++) {

            System.out.println("\tName " + (i + 1) + " = " + myTeam.get(i));
        }
        //print reverse
        System.out.println("\nAll names in reverse : ");
        for (int j = lastName; j >= 0; j--) {
            System.out.println(myTeam.get(j));
        }
        //print 2 at a time
        //1-2,2-3,3-4,4-5
        System.out.println("\nPrint two names at a time : ");
        for (int i = 0; i <= myTeam.size() - 2; i++) {
            System.out.println("\t" + myTeam.get(i) + " ---- " + myTeam.get(i + 1));
        }
        //print 2 names at a time
        // 1-2,3-4,5-6,7-8
        System.out.println("\nPrint two names at a time in another order : ");
        for (int i = 0; i <= myTeam.size() - 2; i += 2) {
            System.out.println("\t" + myTeam.get(i) + " ---- " + myTeam.get(i + 1));
        }
        //print 4 names at a time without repeating
        for (int i = 0; i < myTeam.size() - 4; i += 4) {
            System.out.println(myTeam.get(i) + " " + myTeam.get(i + 1) +
                    " " + myTeam.get(i + 2) + " " + myTeam.get(i + 3));

        }
        //even numbers
        for (int i = 0; i < myTeam.size(); i++) {
            if (i % 2 == 0) {
                System.out.print(myTeam.get(i) + " ");

            }

        }
        //concat everyone in one string separated by -

        String result = "";
        for (int j = 0; j < myTeam.size(); j++) {
            result = result + myTeam.get(j) + " - ";

        }
            System.out.println("\nresult = " + result);

        //TODO : How can we turn a List into a String and Store it ? and manipulated
        String lstToString = myTeam.toString();
        System.out.println("lstToString after replacing  = \n\t"
                + lstToString.replace(", ", "-")
                .replace("[", "")
                .replace("]", ""));
    }
}
