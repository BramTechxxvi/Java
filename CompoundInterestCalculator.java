import java.util.Scanner;
public class CompoundInterestCalculator {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
		
double initialInvestment; double monthlyContribution; int lengthOfTime; double interestRate;
	
	System.out.print("Enter Initial investment: ");
	initialInvestment = userInput.nextDouble();

		System.out.print("Enter Monthly Contribution: ");
		monthlyContribution = userInput.nextDouble();

			System.out.print("Enter Years: ");
			lengthOfTime = userInput.nextInt();

				System.out.print("Enter Estimated interest Rate: ");
				interestRate = userInput.nextDouble();
	
						System.out.print("Enter Compound Frequency: ");
						int compoundFrequency = userInput.nextInt();

interestRate/= 100;
	System.out.println(interestRate);




			}


}