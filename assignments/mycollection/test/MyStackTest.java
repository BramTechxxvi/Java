package assignments.mycollection.test;
import assignments.mycollection.MyStack;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyStackTest {

    private MyStack myStack;
    @BeforeEach
    void setUp() {
        myStack = new MyStack(3);
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
    public void test_If_Stack_Can_Add_Element_When_Full() {
        myStack.push(10);
        myStack.push(7);
        myStack.push(9);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myStack.push(11));
        assertEquals("Stack is full", exception.getMessage());
        assertTrue(myStack.isFull());
    }

    @Test
    public void testIfStackCanPickItems_peek() {
        myStack.push(10);
        myStack.push(7);
        myStack.push(-17);
        assertEquals(-17, myStack.peek());
    }

    @Test
    public void test_If_Stack_Can_Pick_Items_When_Empty__ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myStack.peek());
        assertEquals("Stack is empty", exception.getMessage());
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
   public void testIfStackCanRemoveElement_When_Empty__ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> myStack.pop());
        assertEquals("Stack is empty", exception.getMessage());
   }

   @Test
    public void testIfStackIsFull() {
        myStack = new MyStack(2);
        myStack.push(10);
        myStack.push(-17);
        assertTrue(myStack.isFull());
   }}