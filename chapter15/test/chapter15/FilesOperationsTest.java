package chapter15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilesOperationsTest {

    @Test
    void testCanReadFromFile() {
        String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\chapter15\\test\\files\\data.txt";
        String data = FileOperations.readFrom(fileLocation);
        assertNotNull(data);
        assertFalse(data.isEmpty());
    }

    @Test
    void testCanWriteToFile() {
        String fileLocation = "C:Users\\Dell\\Desktop\\Mr Chibuzor\\chapter15\\test\\files\\Output.java";
        String data = """
                package files;
                
                public class Output {
                    public static void main(String[] args) {
                    System.out.print(Arrays.toString(args))
                    }
                }
                """;
        FileOperations.writeDataTo(data, fileLocation);
        String fileData = FileOperations.readFrom(fileLocation);
        assertNotNull(fileData);
        assertFalse(fileData.isEmpty());

    }




}
