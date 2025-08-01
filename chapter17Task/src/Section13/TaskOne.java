package Section13;

public class TaskOne {

//        • Files method lines creates a Stream<String> for reading the lines of text from a file.

}

//        Path inputPath = Paths.get("input.txt");
//        Path outputPath = Paths.get("output.txt");
//
//        try (Stream<String> lines = Files.lines(inputPath)) {
//            List<String> result = lines
//                    .filter(line -> !line.isBlank())              // Remove blank lines
//                    .map(line -> line.trim())                     // Trim whitespace
//                    .map(line -> ">> " + line)                    // Add prefix
//                    .sorted((a, b) -> a.compareToIgnoreCase(b))   // Sort alphabetically
//                    .toList();
//
//            Files.write(outputPath, result, StandardOpenOption.CREATE);
//            System.out.println("Processed and written with lambdas.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//    Path path = Path.of(fileLocation);
//    StringBuilder data = new StringBuilder();
//    try(BufferedReader reader = Files.newBufferedReader(path)) {
//        while(reader.ready()) data.append(reader.readLine());
//    } catch(IOException e) {
//        e.printStackTrace();
//    }
//    System.out.println(data);
//    return data.toString();
//}
//        Path path = Path.of(fileLocation);
//
//        try (Stream<String> lines = Files.lines(path)) {
//            // Join all lines into a single string with newline separators
//            String data = lines.collect(Collectors.joining(System.lineSeparator()));
//            System.out.println(data);
//            return data;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return ""; // Return empty string on error
//        }
//    }
