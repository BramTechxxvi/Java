package chapter15;

import java.io.*;
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

    public static void writeDataTo(String data, String fileLocation) throws IOException {
        Path path = Path.of(fileLocation);
        if(!Files.exists(path)) {
            Files.createFile(path);
        }
        try(BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(data);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeDataTo2(String data, String fileLocation) throws IOException {
        try(FileOutputStream output = new FileOutputStream(fileLocation)) {
            output.write(data.getBytes());
        }
    }
}
