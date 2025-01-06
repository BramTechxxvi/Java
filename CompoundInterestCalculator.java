import java.util.Scanner;
public class CompoundInterestCalculator {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);

		System.out.print("Enter Initial investment: ");
		double initialInvestment = userInput.nextDouble();

			System.out.print("Enter Monthly Contribution: ");
			double monthlyContribution = userInput.nextDouble();

				System.out.print("Enter Years: ");
				int lengthOfTime = userInput.nextInt();

					System.out.print("Enter Estimated interest Rate: ");
					double interestRate = userInput.nextDouble();
	
						System.out.print("Enter Compound Frequency: ");
						int compoundFrequency = userInput.nextInt();

interestRate /= 100;
double compoundInterest = initialInvestment * Math.pow((1 * interestRate / compoundFrequency), (compoundFrequency / lengthOfTime)) * monthlyContribution * (((Math.pow((1 * interestRate / compoundFrequency), (compoundFrequency * lengthOfTime)) - 1) / (interestRate / compoundFrequency)));

	System.out.println("Compound Interest = " + compoundInterest);




			}


}