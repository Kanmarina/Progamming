package day60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.*;
import java.util.*;
public class FileReading {
    // reading a file is one line of code
    //it return List of String as each as element
    public static void main(String[] args) throws IOException {

try{
        List<String> allLines = Files.readAllLines(Paths.get("src/day60/note.txt"));
        System.out.println("allLines = " + allLines);

        for (String eachline :allLines){
            System.out.println("eachline = " + eachline);
        }
    }catch (Exception e){
    System.out.println("boom");
    System.out.println(e.getMessage());
    }
}}