import java.util.Scanner;
public class PosApp{

	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
	int total = 0;
	int count = 1;

	while (count != 0){

	System.out.println("""

1. DEPOSIT
2. WIHTDRAWAL
3. LEAVE PAGE
_. ERROR 

""");
int menu = userInput.nextInt();

switch (menu){
	case 1: System.out.print("Enter deposit amount: "); 
		int amountDeposited = userInput.nextInt();
		total += amountDeposited;
	System.out.printf("Deposit succesful %nYour present balance is: %d%n", total); 
break; 		

	case 2: System.out.print("Enter withdrawal amount: "); 
		int amountWithdrawed = userInput.nextInt();
		if (total < amountWithdrawed){
	System.out.println("Insufficient funds");
}
		else{
			total -= amountWithdrawed;
	System.out.printf("Deposit successful %nYour new balance is: %d%n", total );
}
break;

	case 3: System.out.println("EXITING"); break;
}

	count++;
}

       }

}