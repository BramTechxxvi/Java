import java.util.Scanner;
	public class PizzaLogisticsApp {

	public static void main(String... args) { 
	Scanner userInput = new Scanner(System.in);
		
int basePay = 5000;
int amountPerParcel = 0;

	System.out.print("Enter successful delivery: ");
	int collectionRate = userInput.nextInt();
	
		if(collectionRate < 50) {
		amountPerParcel = 160;
		} else if(collectionRate <= 59) {
		  amountPerParcel = 200;
		} else if(collectionRate <= 69) {
		  amountPerParcel = 250;
		} else if(collectionRate >= 70) {
		  amountPerParcel = 500;
		}

int ridersWage = (collectionRate * amountPerParcel) + basePay;
System.out.println("Rider's Wage = " + ridersWage);




		}


}