import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ToDoListTest {
	
	@Test
	public void testThatToDoListCanReturnHeader() {
	ToDoList myToDoList = new ToDoList();
		String expected = "To-Do List Manager";
		String header = myToDoList.getHeader();
		assertEquals(expected, header);
	}

    @Test
	public void testThatToDoListCanReturnDisplay() {
	ToDoList myToDoList = new ToDoList();
		String result = "\n1. Add a task \n2. View tasks \n3. Mark task as complete \n4. Exit";
		String display = myToDoList.getDisplay();
		assertEquals(result, display);
        }

	@Test
	public void ToDoListMenu() {
	//ToDoList myToDoList = new ToDoList();

		}
		
		




}