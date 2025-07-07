package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperations {

    public static String readFrom(String fileLocation) {
        Path path = Path.of(fileLocation);
        StringBuilder data = new StringBuilder();
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            while(reader.ready()) data.append(reader.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(data);
        return data.toString();
    }

//    public static String

}
