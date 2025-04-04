import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExpenseTrackerTest {

	@Test
	public void testExpenseTrackerAdd() {
		ExpenseTracker ex = new ExpenseTracker();
		int user = ex.addUp(11, 20);
		int result = 90;
		assertEquals(user, result);


}






}