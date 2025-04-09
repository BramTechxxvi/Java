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
    public void testIfStackIsEmpty_isEmpty() {
        assertTrue(myStack.isEmpty(), "Stack is empty");
    }
    @Test
    public void testIfStackCanAddElement_push() {
        myStack.push(10);
        myStack.push(7);
        myStack.push(9);
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void testIfStackCanPickItems_peek() {
        myStack.push(10);
        myStack.push(7);
        myStack.push(-17);
        assertEquals(-17, myStack.peek());
        myStack.viewStack();
    }
   @Test
    public void testIfStackCanRemoveElement_pop() {
        myStack.push(10);
        myStack.push(7);
        myStack.push(-17);
        assertEquals(-17, myStack.pop());
        myStack.viewStack();
   }
   @Test
    public void testIfStackIsFull() {
        myStack = new MyStack(2);
        myStack.push(10);
        myStack.push(-17);
        assertTrue(myStack.isFull());
   }}