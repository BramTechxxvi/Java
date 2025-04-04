package assignments;
public class ExpenseTrackerApp {

	public String displayHeader() {
		return "Welcome To Semicolon Expense Tracker App \n";
	}

	public String displayMenu() {
		return "\n1. Add an expense \n2. View all expense \n3. Calculate total expense \n4. Exit";
	}

    	public static int addUp(int firstNumber,  int secondNumber) {
		int answer = firstNumber + secondNumber;
		return answer;
	}
    
	public static void main(String... args) {
		ExpenseTrackerApp myMethod = new ExpenseTrackerApp();
		System.out.print(myMethod.displayMenu());



}
}