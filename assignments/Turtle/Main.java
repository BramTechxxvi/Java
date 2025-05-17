package assignments.Turtle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row = Integer.parseInt(input("Enter the number of rows you would like: "));
        int col = Integer.parseInt(input("Enter the number of columns you would like: "));
        TurtleGraphics grid = new TurtleGraphics();


    }



    public static String input(String prompt) {
        Scanner userInput = new Scanner(System.in);
        System.out.print(prompt);
        return userInput.nextLine();
    }
    public static void print(char[] message) {
        System.out.println(message);
    }
}
