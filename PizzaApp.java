import java.util.Scanner;
	public class PizzaOrderApp {
	
		public static void main(String [] args) {
			Scanner customerInput = new Scanner(System.in);

	System.out.print("""                   
	<<<WELCOME TO IYA MOSES PIZZA Joint>>>
 	
	Kindly Place An Order From Our Menu Below
  ___________________________________________________						 
  | Pizza Type  |  Slices per Box  | Price Per Box  |
  |_____________|__________________|________________|					 
  | Sapa Size	|       4          |   2,500        |						 
  |_____________|__________________|________________|							
  | Small Money |       6          |   2,900        |			
  |_____________|__________________|________________|						
  | Big Boys	|       8          |   4,000        |							 
  |_____________|__________________|________________|			 
  | Odogwu      |      	12         |   5,200        |					 		 
  |_____________|__________________|________________|

""");


String[] pizzaType = new String[4];	
	pizzaType[0] = "Sapa size";
	pizzaType[1] = "Small money";
	pizzaType[2] = "Big boys";
	pizzaType[3] = "Odogwu";
		int[] slicesPerBox = {4, 6, 8, 12};
		int[] pricesPerBox = {2500, 2900, 4000, 5200};

			String preferredPizzaType;
			int numberOfGuest = 0;

				System.out.print("Number Of Guest: ");
				numberOfGuest = customerInput.nextInt();

					System.out.print("\nEnter pizza Type: ");
					preferredPizzaType = customerInput.next();

						boolean availablePizzaType = false;
						int numberOfSlices = 0; int pricePerBox = 0; 

								for (int pizzaIndex = 0; pizzaIndex <= pizzaType.length; pizzaIndex++) {
								if (preferredPizzaType.equalsIgnoreCase(pizzaType[pizzaIndex]){

									numberOfSlices = slicesPerBox[pizzaIndex]; 
									pricePerBox = pricesPerBox[pizzaIndex];
									availablePizzaType = true;
										

			}
			
		 }

										if (!availablePizzaType) {
										System.out.println("Invalid Order \nKindly input order again.");
											return;

			}
				
int boxesNeeded = (numberOfGuest + numberOfSlices - 1) / numberOfSlices;
int totalSlices = boxesNeeded * numberOfSlices;  
	int leftOverSlices = totalSlices - numberOfGuest; 
	int totalPrice = boxesNeeded * pricePerBox;

	System.out.printf("""
			Number of box(es) to buy = %d box(es). 
			%s size contains %d slices per box.
			%d box(es) should be sufficient for %d peron(s) as it would contain %d in all.

			Number of left over slices after serving = %d slices.
			Price = %d
			""", boxesNeeded, preferredPizzaType, numberOfSlices, boxesNeeded, numberOfGuest, totalSlices, leftOverSlices, totalPrice);  

	
	                        }
							
}