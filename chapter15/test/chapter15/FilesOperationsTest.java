package chapter15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FilesOperationsTest {

    private final String folder = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\chapter15\\test\\files\\";

    @Test
    void testCanReadFromFile() {
        String fileLocation = folder.concat("data.txt");
        String data = FileOperations.readFrom(fileLocation);
        assertNotNull(data);
        assertFalse(data.isEmpty());
    }

    @Test
    void testCanWriteToFile() throws IOException {
        String fileLocation = folder.concat("Output.java");
        String data = """
                package files;
                import java.util.Arrays;
                
                public class Output {
                    public static void main(String[] args) {
                    System.out.print(Arrays.toString(args));
                    }
                }
                """;
        FileOperations.writeDataTo(data, fileLocation);
        String fileData = FileOperations.readFrom(fileLocation);
        assertNotNull(fileData);
        assertFalse(fileData.isEmpty());
    }

    @Test
    void testCanWriteToFile2() throws IOException {
        String fileLocation = folder.concat("Input.java");
        String data = """
                package files;
                import java.util.Arrays;
                
                public class Input {
                    public static void main(String[] args) {
                    System.out.print(Arrays.toString(args));
                    }
                }
                """;
        FileOperations.writeDataTo2(data, fileLocation);
        String fileData = FileOperations.readFrom(fileLocation);
        assertNotNull(fileData);
        assertFalse(fileData.isEmpty());
    }

    @Test
    void testCanReadFromWeb() throws IOException {
        String url = "https://jsonplaceholder.typicode.com/posts/";
        String fileLocation = folder.concat("data.json");
        FileOperations.readFromWeb(url, fileLocation);
        String fileData = FileOperations.readFrom(fileLocation);
        assertNotNull(fileData);
        assertFalse(fileData.isEmpty());
    }



}
