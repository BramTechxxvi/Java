package chapter15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilesOperationsTest {

    @Test
    void testCanReadFromFile() {
        String fileLocation = "";
        String data = FileOperations.readFrom(fileLocation);
        assertNotNull(data);
        assertFalse(data.isEmpty());
    }




}
