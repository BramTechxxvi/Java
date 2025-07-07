package chapter15.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamImpl {

    private static final String fileLocation = "C:\\Users\\Dell\\Desktop\\Mr Chibuzor\\chapter15\\test\\files\\";

    public static void main(String[] args) {
        String content = input("Enter content: ");
        saveToFile(content);

    }

    private static void saveToFile(String content) {
        try(OutputStream output = new FileOutputStream(fileLocation.concat("data.txt"), true);
            PrintStream printStream = new PrintStream(output)) {
            printStream.println(content);
        } catch (IOException ex) {
            System.err.println("Error: " +ex.getMessage());
        }
    }
    private static String input(String message) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(message);
        return userInput.nextLine();
    }
}
