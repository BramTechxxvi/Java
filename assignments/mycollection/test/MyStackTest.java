package assignments.mycollection.test;
import assignments.mycollection.MyStack;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyStackTest {

    private MyStack myStack;
    @BeforeEach
    void setUp() {
        myStack = new MyStack();
    }

    @Test
    public void testThatStackIsEmpty_isEmpty() {
        assertTrue(myStack.isEmpty());
    }
}
