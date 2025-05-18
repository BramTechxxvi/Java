package assignmentTest.problemTest;
import assignments.Problem.Person;
import assignments.Problem.Problem;
import assignments.Problem.ProblemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    private Person newPerson;
    @BeforeEach
    public void setUp() {
        newPerson = new Person("Ade");
    }

    @Test
    public void test_If_Person_Has_Problems__getSize() { assertEquals(0, newPerson.getSize()); }

    @Test
    public void test_If_Person_Can_Add_Problem__addProblem() {
        Problem problem = new Problem("Dream", ProblemType.SPIRITUAL);
        newPerson.addProblem(problem);
        assertEquals(1, newPerson.getSize());
    }

    @Test
    public void test_If_Person_Can_Add_Multiple_Problems__addProblem() {
        Problem problem1 = new Problem("Dream", ProblemType.SPIRITUAL);
        Problem problem2 = new Problem("Illiteracy", ProblemType.EDUCATIONAL);
        newPerson.addProblem(problem1);
        newPerson.addProblem(problem2);
        assertEquals(2, newPerson.getSize());
    }

    @Test
    public void test_If_Person_Can_Solve_Problem__solve() {
        Problem problem1 = new Problem("Dream", ProblemType.SPIRITUAL);
        Problem problem2 = new Problem("Illiteracy", ProblemType.EDUCATIONAL);
        newPerson.addProblem(problem1);
        newPerson.addProblem(problem2);
        newPerson.solveProblem(problem1);
        assertTrue(problem1.isSolved());
    }

    @Test
    public void test_If_Person_Can_Count_Unsolved_Problems__unSolvedProblems() {
        Problem problem1 = new Problem("Dream", ProblemType.SPIRITUAL);
        Problem problem2 = new Problem("Illiteracy",  ProblemType.EDUCATIONAL);
        newPerson.addProblem(problem1);
        newPerson.addProblem(problem2);
        newPerson.solveProblem(problem1);
        assertTrue(problem1.isSolved());
        assertEquals(1, newPerson.unSolvedProblems());
    }

}