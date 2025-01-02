import java.util.Scanner;
public class BeginnerArrayKata {
	
	public static void main(String[] args) {
		Scanner inputCollector = new Scanner(System.in);
		
	System.out.println("Q1\n");
	System.out.print("Numbers in array: ");
	int arraySize = inputCollector.nextInt();
		int[] array = new int[arraySize];
	for (int num = 0; num < arraySize; num++) {
			System.out.print("Enter number: " );
						array[num] = inputCollector.nextInt();		
}
		int maximum = array[0];
		int minimum = array[0];
		int total = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int[] maxmin = new int[2];

	for (int num = 0; num < array.length; num++) {
		if (array[num] > maximum) {
			maximum = array[num];
	}
		if (array[num] < minimum) {
			minimum = array[num];
	}
		if (array[num] % 2 == 0) {
			sumEven+= array[num];
	} 	else {
			sumOdd+= array[num];
	}	
		total+= array[num];
}		
			maxmin[0] = maximum;
			maxmin[1] = minimum;
		System.out.printf("%s%d%n%n", "Maximum in (array of integers): ", maximum);
		
		System.out.println("\nQ2\n");
		System.out.printf("%s%d%n%n", "Minimum in (array of integers): ", minimum);
		
		System.out.println("\nQ3\n");
		System.out.printf("%s%d%n%n", "Sum of numbers in (array of integers): ", total);
		
		System.out.println("\nQ4\n");
		System.out.printf("%s%d%n%n", "Sum of even numbers in (array of integers): ", sumEven);
		
		System.out.println("\nQ5\n");
		System.out.printf("%s%d%n%n", "Sum of odd numbers in (array of integers): ", sumOdd);
		
		System.out.println("\nQ6\n");
		System.out.printf("%s%d%s%d%s%n%n", "the maximun and minimum is [", maxmin[0], ", ", maxmin[1], "]");
		
		System.out.println("\nQ7\n");
		int countEven = 0;
		int countOdd = 0;
	for (int number : array) {
		if (number % 2 == 0) {
			countEven++;
	} 	else {
		countOdd++;
	}		
}
		System.out.printf("%s%d%n%n", "number of even numbers in (array of integers): ", countEven);
	
		System.out.println("\nQ8\n");
		System.out.printf("%s%d%n%n", "number of odd numbers in (array of integers): ", countOdd);

		System.out.println("\nQ9\n");
		System.out.println("Even numbers in (array of integers)");
		int evenNumber = 0;
	for (int number : array) {
		if (number % 2 == 0) {
			evenNumber = number;
		System.out.println(evenNumber);
	} 	
}	

		System.out.println("\nQ10\n");
		int oddNumber = 0;
		System.out.println("Odd numbers in (array of integers)");
	for (int number : array) {
		if (number % 2 != 0) {
			oddNumber = number;
		System.out.println(oddNumber);
	}		
}		
		System.out.println("\n\nQ11\n");
		System.out.println("Square numbers in (array of integers)");
		int squareNumber = 0;
	for (int number : array) {
			squareNumber = number * number;
		System.out.println(squareNumber);
}



		
		
		
	              }
	
	
}