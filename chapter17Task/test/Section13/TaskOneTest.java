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
        String content = "Hello, World!" + "\n" + "Lets do something great today";
        Files.write(tempFile, content.getBytes());
    }

}
        // Arrange: create a temporary test file
//        Path tempFile = Files.createTempFile("testfile", ".txt");
//        String expectedContent = String.join(System.lineSeparator(),
//                "Hello", "World", "This is a test.");
//        Files.write(tempFile, expectedContent.getBytes(StandardCharsets.UTF_8));
//
//        // Act: read the file using your method
//        String actualContent = FileReaderStream.readFile(tempFile.toString());
//
//        // Assert: check if content matches
//        assertEquals(expectedContent, actualContent);
//
//        // Cleanup: delete the temp file
//        Files.deleteIfExists(tempFile);
//    }
//}