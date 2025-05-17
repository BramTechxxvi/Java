package assignmentTest.collecrtionTest;
import assignments.mycollection.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyArrayListTest {

    private MyArrayList myList;
    @BeforeEach
    public void setUp() {
        myList = new MyArrayList(3);
    }
    @Test
    public void testIfArrayListIsEmpty() { assertTrue(myList.isEmpty()); }

    @Test
    public void test_If_ArrayList_Can_Add__add() {
        myList.add(7);
        myList.add(8);
        assertFalse(myList.isEmpty());
    }

    @Test
    public void test_If_ArrayList_Can_Increase_Size_When_Full__add() {
        myList.add(2);
        myList.add(10);
        myList.add(5);
        myList.add(1);
        assertEquals(4, myList.getSize());
    }

    @Test
    public void test_If_ArrayList_Can_Add_A_Collection__addAll() {
        int[] data = new int[3];
        myList.add(7);
        myList.add(8);
        myList.add(2);
        for (int i = 0; i < 3; i++) data[i] = i;
        myList.addAll(data);
        assertEquals(6, myList.getSize());
    }


}
