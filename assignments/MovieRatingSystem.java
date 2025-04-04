package assignments;
import java.util.Scanner;
public class MovieRatingSystem {

    public String getHeader() {
        return "======== MOVIE RATING SYSTEM ========";
    }
    public String getFeatures() {
        return "\n1. Add a movie \n2. Rate a movie \n3. View ratings \n4. View average ratings \n5. Exit";
    }/*
    public String getDate() {
        return;
    }*/
    public String getMovieName(String name ) {
        if (name.isEmpty() || name.equals(" ")) {
            return null;
        } return name;
    }/*
    public int rateMovie(String movieName) {

    }
    public String viewRating(String movieName) {
        return;
    }
    public String viewAverageRating(String movieName) {
        return;
    }*/
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        MovieRatingSystem myMovie = new MovieRatingSystem();
        System.out.print(myMovie.getHeader());
        int choice;
        do {
            System.out.print(myMovie.getFeatures());
            System.out.print("\nSelect an option: ");
            choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movieName = userInput.next();
                    System.out.println(myMovie.getMovieName(movieName)); continue;
                case 2:
                    System.out.println(); break;
                case 3:
                    System.out.println(); break;
                case 4:
                    System.out.println(); break;
                case 5:
                    System.out.print("Exiting Application...");
                    break;
                default:
                    System.out.println("Invalid input... Enter number between 1-5");
            }}while(choice < 1 || choice > 5);
    }}
