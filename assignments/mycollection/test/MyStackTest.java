package assignments.mycollection.test;
import assignments.mycollection.MyStack;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyStackTest {

    private MyStack myStack;
    @BeforeEach
    void setUp() {
        myStack = new MyStack(5);
    }

    @Test
    public void testThatStackIsEmpty_isEmpty() {
        assertTrue(myStack.isEmpty(), "Stack is empty");
    }
    @Test
    public void testThatStackCanAddElement_push() {
        myStack.push(10);
        myStack.push(7);
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void testThatsTACKcAnPickItesm_peek() {
        myStack.push(10);
        myStack.push(7);
        myStack.push(-17);
        myStack.peek(10);
    }
    @Test
    public void testViewElements_viewStack() {
        myStack.push(10);
        myStack.push(7);
        myStack.viewStack();
    }
}
