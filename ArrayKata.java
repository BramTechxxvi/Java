import java.util.Scanner;
public class ArrayKata{

	public static void main(String[] args){
	Scanner learn = new Scanner(System.in);

System.out.print("          Q1 \n\n");
int[] list = {8, 12, 45, 3, 89, 54, 7, 21};

	 int largest = list[0]; int smallest = list[0]; 

for(int num : list){
System.out.println(num);
	if (num > largest){
	largest = num;
}
	if (num < smallest){
	smallest = num;
}
}
System.out.printf("%S%d%n%n", "largest element is: ", largest);


System.out.print("          Q2 \n\n");
System.out.printf("%S%d%n%n", "smallest element is: ", smallest);


System.out.print("          Q3 \n\n");
System.out.print("Enter an integer: ");
int elementToCheck = learn.nextInt();


 boolean number = false;	
	for (int num : list){
	if(num == elementToCheck){
		number = true;

}}
	if (number){
	System.out.printf("%d%s%n%n", elementToCheck, " is in the list");
} 
	else{
	System.out.printf("%d%s%n%n", elementToCheck, " is not in the list");
}
	learn.close();

System.out.print("          Q4 \n\n");
System.out.print("Odd numbers are:");
	for(int num : list){
	if(num % 2 != 0){
	System.out.println(num);
}
}


System.out.print("          Q5 \n\n");
System.out.print("Even numbers are:");
	for(int num : list){
	if(num % 2 == 0){
	System.out.println(num);
}
}

System.out.print("          Q6 \n\n");
int total = 0;
	for(int num : list){
	System.out.println(num);
	total+=num;
}
	System.out.printf("%S%d%n%n", "Total is: ", total);

System.out.print("          Q7 \n\n");
	String[] palDigit = new String[1];
		palDigit[0] = "90929";

	String reversed = new StringBuffer(palDigit[0]).reverse().toString();
	if(palDigit[0].equals(reversed)){
	System.out.println(palDigit[0] +" is Palindrome");
}
	else {
	System.out.print(palDigit[0] + " is not Palindrome \n\n");
}


System.out.print("          Q8 \n\n");
int forSum = 0;
	for (int num : list){
	forSum+= num;
}
	System.out.printf("%d%s%n%n", forSum, " For loop sum");


int whileSum = 0;
int count = 0;
	while (count < list.length){
	whileSum+= list[count];
	count++;
}
	System.out.printf("%d%s%n%n", whileSum, " While loop sum");


int doWhileSum = 0;
int counter = 0;
do{
	doWhileSum+= list[counter];
	counter++;
}
	while (counter < list.length);
	System.out.printf("%d%s%n%n", doWhileSum, " Do While loop sum");


System.out.print("          Q9 \n\n");
int listOfDigits = 2342;
String arrayDigits = Integer.toString(number);
for (char figure : arrayDigits) {
		System.out.println(arrayDigits[figure]);

}

                  }

}