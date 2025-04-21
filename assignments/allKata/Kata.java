import java.util.Scanner;
	public class Kata{

			public static void main(String[] args){
			Scanner ogaCollector = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int isEven = ogaCollector.nextInt();

	if(isEven % 2 == 0){
	System.out.println("True");
}
	else{
	System.out.println("False");
}
		System.out.println( "Q2");

	System.out.println("Enter an integer: ");
	int isPrime = ogaCollector.nextInt();

	if(isPrime <= 1){
	System.out.println("False");
}
	for(int figure = 2; figure < isPrime; figure++){
	if(isPrime % 2 == 0){
	System.out.println("False");
}
	if(isPrime % 2 != 0){
	System.out.println("True");
	figure++;
}
	else if(isPrime == 0 && isPrime == 1){
	System.out.println("False");
}break;
}
		System.out.println( "Q3");

	System.out.print("Enter an integer: ");
	int num1 = ogaCollector.nextInt();


	System.out.print("Enter an integer: ");
	int num2 = ogaCollector.nextInt();

	int difference = Math.abs(num1 - num2);
	System.out.println(difference);

		System.out.println( "Q4");


	System.out.print("Enter an integer: ");
	int quotientFigure1 = ogaCollector.nextInt();

	System.out.print("Enter an integer: ");
	int quotientFigure2 = ogaCollector.nextInt();

	double  quotient = 0;
	System.out.println(quotient);

	if(quotientFigure2 == 0){
	quotient = 0;
	System.out.println(quotient);
}
	else{
		quotient = (double)quotientFigure1/quotientFigure2;
	System.out.println(quotient);
}


		System.out.println( "5");


	System.out.println("Enter an integer: ");
	int factorNum = ogaCollector.nextInt();
	int divids = factorNum;
	System.out.println("factoer of "+factorNum);
	while(divids > 0){
		if(factorNum % divids ==0){
	
		System.out.println(divids);
}
		divids--;
}


 		System.out.println( "Q6");

	System.out.print("Enter an integer: ");
	int squareFigure = ogaCollector.nextInt();

	double number =(double)Math.pow(squareFigure, 0.5);
	if(number % 1 != 0){
	System.out.println("False");
}
	else{
	System.out.println("True");
}



	 	System.out.println( "Q7");
	
	System.out.print("Enter a five digit integer: ");
	int fiveDigitsFigure = ogaCollector.nextInt();
	
	int fifthMod = 0;
	int fourDigitsFigure = 0; 
	int fourthMod = 0;
	int secondMod = 0;
	int firstMod = 0;
	int twoDigitsFigure = 0;

	fifthMod = fiveDigitsFigure % 10;
	fourDigitsFigure = fiveDigitsFigure / 10;
	fourthMod = fourDigitsFigure % 10;
	twoDigitsFigure = fourDigitsFigure / 100;
	secondMod = twoDigitsFigure % 10;
	firstMod = twoDigitsFigure / 10;

	if(firstMod == fifthMod && secondMod == fourthMod){
	System.out.println(fiveDigitsFigure + "is Pallindrome");
}
	else{
	System.out.println(fiveDigitsFigure + "is not Pallindrome");
}
	 	
		System.out.println( "Q8");
	System.out.println("Enter an integer: ");
	int factorialFigure = ogaCollector.nextInt();
	
	int factorialAnswer = 1;
	System.out.println(factorialFigure);
	
	while(factorialFigure > 0){
	factorialAnswer *= factorialFigure;
	factorialFigure--;
}
	System.out.println(factorialAnswer);



		System.out.println( "Q9");

	System.out.println("Enter an integer: ");
	int theSquare = ogaCollector.nextInt();
	int squareDigits= theSquare * theSquare;
	System.out.println(theSquare + "Squared is " + squareDigits);




}



}