import java.util.Scanner;
import java.util.ArrayList;
public class StudentGradingApp {

		public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);

int numberOfStudents; 
int numberOfSubjects; 

System.out.print("<<<<<<WELCOME TO LAGBAJA GROUP OF SCHOOLS>>>>>> \n\nHow many students do you have: ");
numberOfStudents = userInput.nextInt();

System.out.print("How many subjects do they offer: ");
numberOfSubjects = userInput.nextInt();

System.out.printf("%s%n%s%n%n", "Saving>>>>>>>>>>>>>>>>>>>>>", "Saved Successfully");

int[][] studentGrade = new int[numberOfStudents][numberOfSubjects];
double score; 
//double[] scores = new double[score];
ArrayList<Double> scores = new ArrayList<>();

for (int row = 0; row < studentGrade.length; row++) {
	System.out.printf("%n%s%d%n", "Student ", row + 1);
for (int index = 0; index < studentGrade[row].length; index++) {
	do {
	System.out.printf("%s%d%c%n","Subject ", index + 1, ':');
	score = userInput.nextDouble();
	scores.add(score);
	if (score < 0 || score > 100) {
	System.out.printf("%s%n%s%n", "Invalid input", "Kindly enter again");
	}}while(score < 0 || score > 100);
}
}
//System.out.print(scores.get(score));
              }
}