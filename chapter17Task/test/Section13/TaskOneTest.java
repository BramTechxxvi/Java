package Section13;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    public void testCanReadFromFileWithStream() throws IOException {
        Path tempFile = Files.createTempFile("testFile", ".txt");
        String expectedContent = "Hello, World!" + "\n" + "Lets do something great today";
        Files.write(tempFile, expectedContent.getBytes());

        String data = FileReaderStream.readFile(tempFile.toString());
        assertEquals(expectedContent, data);
        Files.deleteIfExists(tempFile);
    }
}