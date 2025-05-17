package assignmentTest.problemTest;
import assignments.Problem.Problem;
import assignments.Problem.ProblemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProblemTest {

    private Problem myProblem;
    @BeforeEach
    public void setUp() {
        myProblem = new Problem("Debt", "Student loan", ProblemType.FINANCIAL);
    }

    @Test
    public void test_if_Problem_Is_Solved__isSolved() {assertFalse(myProblem.isSolved()); }

    @Test
    public void test_if_Problem_Cab_Be_Solved__solved() {
        assertFalse(myProblem.isSolved());
        myProblem.solve();
        assertTrue(myProblem.isSolved());
    }

    @Test
    public void test_If_Problem_Can_Get_Type__getType() {
        assertEquals(ProblemType.FINANCIAL, myProblem.getType());
    }

    @Test
    public void test_If_Problem_Can_Get_Name__getName() {
        assertEquals("Debt", myProblem.getName());
    }

    @Test
    public void test_If_Problem_Can_Get_Description__getDescription() {
        Problem newProblem = new Problem("Debt", "Credit card", ProblemType.FINANCIAL);
        assertEquals("Credit card", newProblem.getDescription());
    }

    @Test
    public void test_If_Problem_Can_Create_With_Invalid_name__ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            new Problem("", "Credit card", ProblemType.FINANCIAL);
        });
        assertEquals("Field cannot be empty", exception.getMessage());
        Exception exception2 = assertThrows(IllegalArgumentException.class, ()-> {
            new Problem(" ", "Credit card", ProblemType.FINANCIAL);
        });
        assertEquals("Field cannot be empty", exception2.getMessage());
    }

    @Test
    public void test_If_Problem_Can_Create_With_Invalid_Description__ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            new Problem("Debt", "", ProblemType.FINANCIAL);
        });
        assertEquals("Field cannot be empty", exception.getMessage());
        Exception exception2 = assertThrows(IllegalArgumentException.class, ()-> {
            new Problem("Debt", " ", ProblemType.FINANCIAL);
        });
        assertEquals("Field cannot be empty", exception2.getMessage());
    }

    @Test
    public void test_If_Problem_Has_All_Fields__toString() {
        Problem newProblem = new Problem("Laptop", "Broken screen", ProblemType.TECHNICAL);
        String string = newProblem.toString();
        assertTrue(string.contains("Laptop"));
        assertTrue(string.contains("Broken screen"));
        assertTrue(string.contains("TECHNICAL"));
    }
}