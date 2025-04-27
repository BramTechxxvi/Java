package assignments.Problem.test;
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
        Problem problem = new Problem("Wierd dreams", ProblemType.SPIRITUAL);
        newPerson.addProblem(problem);
        assertEquals(1, newPerson.getSize());

         }




}
