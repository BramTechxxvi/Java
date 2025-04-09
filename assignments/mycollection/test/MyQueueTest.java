package assignments.mycollection.test;
import assignments.mycollection.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyQueueTest {

    private MyQueue myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new MyQueue(3);
    }

    @Test
    public void testIfQueueIsEmpty_isEmpty() {assertTrue(myQueue.isEmpty());}

    @Test
    public void testIfQueueCanAddElement_enqueue() {
        myQueue.enqueue(10);
        myQueue.enqueue(20);
    }
    @Test
    public void testIfQueueIsFull_isFull() {
        myQueue = new MyQueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        assertTrue(myQueue.isFull());
    }
    @Test
    public void testIfQueueCanRemoveElement_dequeue() {
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        assertEquals(5, myQueue.dequeue());
    }
    @Test
    public void testIfQueueCanPeekElement_peek() {
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        assertEquals(5, myQueue.peek());
    }
}
