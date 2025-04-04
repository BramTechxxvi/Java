package assignments.test;
import assignments.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AutomaticBikeTest {
    private AutomaticBike myMethod;
    @BeforeEach
    @Test
    public void setUp() {
        myMethod = new AutomaticBike();
    }
    @Test
    public void testThatAutomaticBikeOff() {
       myMethod.switchOffBike();
       assertFalse(myMethod.switchOffBike());
    }
    @Test
    public void testThatAutomaticBikeIsOn() {
        myMethod.switchOnBike();
        assertTrue(myMethod.switchOnBike());
    }
}