import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CheckOutApp { 

	public static void main(String... args) {
	Scanner userInput = new Scanner(System.in);
String customerName; String itemBought; int itemPieces; double unitPrice; String addMoreItems; String cashierName; double discount;

LocalDateTime dateTime = LocalDateTime.now(); DateTimeFormatter dateTimeFmt = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
String fmtDateTime = dateTime.format(dateTimeFmt);

ArrayList<String> itemBoughts = new ArrayList<>(); ArrayList<Double> unitPrices = new ArrayList<>();
ArrayList<Integer> quantity = new ArrayList<>();
		
	System.out.println("Enter Customer's Name: ");
	customerName = userInput.next();
			userInput.nextLine();
	
		do {
		System.out.println("\nWhat item did the user purchase? ");
		itemBought = userInput.next();
			itemBoughts.add(itemBought);

					userInput.nextLine();
				do {
				System.out.print("\nHow many pieces? ");
				itemPieces = userInput.nextInt();
					quantity.add(itemPieces);
					if (itemPieces <= 0) {
					System.out.println("Invalid Input \nKindly enter a positive number");
	
					}} while (itemPieces <= 0); 

						do {
						System.out.println("\nHow much per unit: ");
						unitPrice = userInput.nextDouble();
							unitPrices.add(unitPrice);
							if (unitPrice <= 0) {
							System.out.println("\nInvalid Input \nKindly enter a positive number");
							}} while (unitPrice <= 0);

								userInput.nextLine();
								System.out.print("\nWould you like to add more items(Yes/No)? ");
									addMoreItems = userInput.next();
										userInput.nextLine();
									if (addMoreItems.equalsIgnoreCase("NO")){
										break;
									}} while (addMoreItems.equalsIgnoreCase("YES"));
										
										System.out.print("Cahier's Name: ");
										cashierName = userInput.next();
											userInput.nextLine();
											System.out.print("How much discount will be given? \n");
											discount = userInput.nextDouble();



System.out.printf(""" 
	Welcome TO SEMICOLON STORES.
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULY WAY, SABO YABA, LAGOS.
	TEL: 03293828343
	DATE: %s
	CASHIER NAME: %s
	CUSTOMER NAME: %s
==========================================================================================
	Item			QTY		Price				Total(NGN)
------------------------------------------------------------------------------------------
""", fmtDateTime, cashierName, customerName);  
  

double subTotal = 0;
for (int index = 0; index < itemBoughts.size(); index++) {
	subTotal+= quantity.get(index) * unitPrices.get(index);
System.out.printf("""
%s				%d		%.2f				%.2f
""", itemBoughts.get(index), quantity.get(index), unitPrices.get(index), quantity.get(index) * unitPrices.get(index));
}


double discountTotal = (discount / 100) * subTotal;
double vat = (17.50 / 100) * subTotal;
double bill = (subTotal - discountTotal) + vat;
System.out.printf("""
--------------------------------------------------------------------------------------------
						 Sub Total:                             %.2f
						  Discount:				%.2f
						VAT @17.50:				%.2f
============================================================================================
						Bill Total:				%.2f
============================================================================================
		THIS IS NOT A RECEIPT KINDLY PAY   				%.2f
============================================================================================
""", subTotal, discountTotal, vat, bill, bill);

double amountPaid;

do {
System.out.println("How much did the customer give to you? ");
amountPaid = userInput.nextInt();
	if (amountPaid <= bill) {
	System.out.println("Insufficient amount=> " + amountPaid + "\nKindly pay the full amount=> " + bill);
}} while (amountPaid <= bill);

System.out.printf("""


	SEMICOLON STORES
	MAIN BRANCH
	LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
	Tel: 03293828343
	DATE: %s
	Cashier: %s
	Customer Name: %s
==========================================================================================
	Item			QTY		Price				Total(NGN)
------------------------------------------------------------------------------------------
""", fmtDateTime, cashierName, customerName);


double totalBalance = amountPaid - bill;
for (int ind = 0; ind < itemBoughts.size(); ind++) {
	subTotal+= quantity.get(ind) * unitPrices.get(ind);


System.out.printf("""
%s				%d		%.2f				%.2f
""", itemBoughts.get(ind), quantity.get(ind), unitPrices.get(ind), quantity.get(ind) * unitPrices.get(ind));
}

System.out.printf("""
--------------------------------------------------------------------------------------------
						 Sub Total:                             %.2f
						  Discount:				%.2f
						VAT @17.50:				%.2f
============================================================================================
						Bill Total:				%.2f
					       Amount Paid:				%.2f
 						   Balance:				%.2f
============================================================================================
		THANKS FOR YOUR PATRONAGE, WE HOPE TO SEE YOU AGAIN 
============================================================================================
""", subTotal, discountTotal, vat, bill, amountPaid, totalBalance );

	}



}