package assignments.tddSnacks.test;
import assignments.tddSnacks.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AutomaticBikeTest {

    private AutomaticBike myMethod;
    @BeforeEach
    public void setUp() {
        myMethod = new AutomaticBike();
    }
    @Test
    public void testThatAutomaticBikeOff() {
       assertFalse(myMethod.switchOffBike());
       assertTrue(myMethod.switchOnBike());
       assertFalse(myMethod.switchOffBike());
    }
    @Test
    public void testThatAutomaticBikeIsOn() {
        assertFalse(myMethod.switchOffBike());
        assertTrue(myMethod.switchOnBike());
    }
    @Test
    public void testThatAutomaticBikeCanAccelerate() {
        assertTrue(myMethod.switchOnBike());
        assertEquals(myMethod.accelerateBike(), 0);

    }
}