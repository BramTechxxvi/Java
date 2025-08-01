package Section13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskOne {

    public String readFile(String fileLocation) {
        Path path = Path.of(fileLocation);
        try(Stream<String> lines = Files.lines(path)) {
            return lines.collect(Collectors.joining("\n"));
        } catch (IOException e) {
            System.out.println("Error reading file " + fileLocation);
        }
        return "";
    }
}