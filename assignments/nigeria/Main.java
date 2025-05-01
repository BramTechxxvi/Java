package assignments.nigeria;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        String state = input("Enter your state: ");

        String zone = PoliticalZone.findZoneByState(state);
        print(zone);

    }

    private static String input(String prompt) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(prompt);
        return userInput.nextLine();
    }
    private static void print(String message) {
        System.out.println(message);
    }
}
