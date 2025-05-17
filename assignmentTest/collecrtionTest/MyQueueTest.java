package assignmentTest.collecrtionTest;
import assignments.mycollection.RealQueue;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyQueueTest {

    private RealQueue myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new RealQueue(3);
    }

    @Test
    public void testIfQueueIsEmpty_isEmpty() {assertTrue(myQueue.isEmpty());}

    @Test
    public void testIfQueueCanAddElement_enqueue() {
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        assertFalse(myQueue.isEmpty());
    }

    @Test
    public void test_If_Queue_Can_Add_Element_When_Full__ThrowsException() {
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        Exception exception = assertThrows(Exception.class, () -> myQueue.enqueue(40));
        assertEquals("Queue is full", exception.getMessage());
    }

    @Test
    public void testIfQueueIsFull_isFull() {
        myQueue = new RealQueue(2);
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
        myQueue.viewQueue();
    }

    @Test
    public void test_If_Queue_Can_Remove_Element_When_Empty__ThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> myQueue.dequeue());
        assertEquals("Queue is empty", exception.getMessage());
    }

    @Test
    public void testIfQueueCanPeekElement_peek() {
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        assertEquals(5, myQueue.peek());
    }

    @Test
    public void test_If_Queue_Can_Peek_Element_When_Empty__ThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> myQueue.peek());
        assertEquals("Queue is empty", exception.getMessage());
    }

    @Test
    public void testIfQueueCanPeekElement_peekk() {
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        assertEquals(5, myQueue.dequeue());
        myQueue.enqueue(7);
        myQueue.viewQueue();
    }


}
