package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {

        List<String>allData = Files.readAllLines(Paths.get("src/day63/employeeData.txt"));

         for(String eachLine : allData){
            System.out.println("eachLine = " + eachLine);
         }

         String line = "1,Lilian";
         int id = Integer.parseInt( line.split(",")[0]);
         String name =line.split(",")[1];



        Map<Integer,String> idNumberPair = new HashMap<>();
         idNumberPair.put(id,name);
        System.out.println("idNumberPair = " + idNumberPair);

    }
}
