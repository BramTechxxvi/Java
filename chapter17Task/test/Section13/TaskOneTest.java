package Section13;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test

    public void testCanReadFromFileWithStream() {
        String testFile = "testFile";
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