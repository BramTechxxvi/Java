package assignments.Problem.test;
import assignments.Problem.Problem;
import assignments.Problem.ProblemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProblemTest {

    private Problem myProblem;
    @BeforeEach
    public void setUp() {
        myProblem = new Problem("Debt", ProblemType.FINANCIAL);
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
        assertEquals(myProblem.getType(), ProblemType.FINANCIAL);
    }

    @Test
    public void test_If_Problem_Can_Get_Name__getName() {
        assertEquals("Debt", myProblem.getName());
    }



}
