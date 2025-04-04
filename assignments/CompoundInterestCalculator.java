package assignments;
import java.util.Scanner;
public class CompoundInterestCalculator {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
double initialInvestment;
double monthlyContribution;
int years;
double interestRate;
	
System.out.print("Enter Initial investment: ");
initialInvestment = userInput.nextDouble();

System.out.print("Enter Monthly Contribution: ");
monthlyContribution = userInput.nextDouble();

System.out.print("Enter Years: ");
years = userInput.nextInt();

System.out.print("Enter Estimated interest Rate(in %): ");
interestRate = userInput.nextDouble() / 10;
	
System.out.print("Enter Compound Frequency: ");
int compoundFrequency = userInput.nextInt();




			}
}