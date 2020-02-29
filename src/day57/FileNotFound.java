package day57;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFound {
    public static void main(String[] args) throws IOException {
        Files.readAllLines(Paths.get("file.txt"));
    }
}
