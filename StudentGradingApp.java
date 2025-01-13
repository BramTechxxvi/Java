import java.util.Scanner;
public class StudentGradingApp {

		public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);

int numberOfStudents; int numberOfSubjects; 

System.out.print("<<<<<<WELCOME TO LAGBAJA GROUP OF SCHOOLS>>>>>> \n\nEnter number of Students: ");
numberOfStudents = userInput.nextInt();

System.out.print("Enter number of Subject: ");
numberOfSubjects = userInput.nextInt();

int[][] studentGrade = new int[numberOfStudents][numberOfSubjects];
double score;

for (int row = 0; row < studentGrade.length; row++) {
for (int index = 0; index < studentGrade[row].length; index++) {
	do {
	System.out.printf("%s%d%c%n","Student ", row + 1, ':');
	score = userInput.nextInt();
	System.out.printf("%s%n%s%n%n", "Saving>>>>>>>>>>>>>>>>>>>>>", "Saved Successfully");
	if (score < 0 || score > 100) {
	System.out.printf("%s%n%s%n", "Invalid input", "Kindly enter again");
	}} while(score < 0 || score > 100);
}}




              }



}