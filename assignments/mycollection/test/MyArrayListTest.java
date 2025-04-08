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
    public void testIfArrayListIsEmpty() { assertTrue(myList.isEmpty());}

}
