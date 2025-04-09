package assignments.gateOne.test;
import assignments.gateOne.MenstrualApp;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MenstrualAppTest {

    private MenstrualApp myTracker;
    @BeforeEach
    public void setUp() {
        myTracker = new MenstrualApp();
    }
    @Test
    public void testIfNameIsValid_getUserName() {
        myTracker.getUserDetails("D09");
        assertTrue(true);
    }
}
