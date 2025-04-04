package assignments.test;
import assignments.ExpenseTrackerApp;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ExpenseTrackerAppTest {
	
	@Test
	public void testExpenseTrackerAppFunctionReturnHeader() {
		ExpenseTrackerApp myTrackerApp = new ExpenseTrackerApp();
		String actual = "Welcome To Semicolon Expense Tracker App \n";
		String result = myTrackerApp.displayHeader();
		assertEquals(actual, result);
	}

	@Test
	public void testExpenseTrackerAppFunctionReturnMenu() {
		ExpenseTrackerApp myTrackerApp = new ExpenseTrackerApp();
		String actual = "\n1. Add an expense \n2. View all expense \n3. Calculate total expense \n4. Exit";
		String result = myTrackerApp.displayMenu();
		assertEquals(actual, result);
	}

	@Test
	public void testExpenseTrackerAppFunctionReturnAddition() {
		int add = ExpenseTrackerApp.addUp(7, 10);
		int result = 11;
	assertEquals(result, add);
	}
    }
    

