package assignments.mycollection.test;
import assignments.mycollection.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MyArrayListTest {

    private MyArrayList myList;
    @BeforeEach
    public void setUp() {
        myList = new MyArrayList();
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
    MyArrayList myList = new A();

}
