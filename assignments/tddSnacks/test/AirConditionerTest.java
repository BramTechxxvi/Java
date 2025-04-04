package assignments.tddSnacks.test;
import assignments.tddSnacks.AirConditioner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AirConditionerTest {

    private AirConditioner mySwitch;
    @BeforeEach
    public void setUp() {
        mySwitch = new AirConditioner();
    }
    @Test
    public void testFunctionSwitchOnAC_switchOnAc() {
        assertFalse(mySwitch.switchOffAc());
        assertTrue(mySwitch.switchOnAc());
    }
    @Test
    public void testFunctionSwitchOffAC_switchOffAc() {
        assertFalse(mySwitch.switchOffAc());
        assertTrue(mySwitch.switchOnAc());
        assertFalse(mySwitch.switchOffAc());
    }
    @Test
    public void testFunctionIncreaseTemperature() {
        int initialTemp = 16;
        assertTrue(mySwitch.switchOnAc());
        assertEquals(initialTemp +1, mySwitch.increaseTemp(), "Increase temperature by  10");
        assertEquals(17, mySwitch.increaseTemp(), "Increase temperature by  17");
    }
    @Test
    public void testFunctionDecreaseTemperature() {
        assertTrue(mySwitch.switchOnAc());
        assertEquals(16, mySwitch.decreaseTemp(), "Decrease temperature by 1");
        mySwitch.increaseTemp();
        mySwitch.increaseTemp();
        assertEquals(18, mySwitch.getTemperature());
        mySwitch.decreaseTemp();
        assertEquals(17, mySwitch.getTemperature());
        assertNotEquals(16, mySwitch.getTemperature());
        assertEquals(16, mySwitch.decreaseTemp());
        mySwitch.decreaseTemp();
        assertEquals(16, mySwitch.getTemperature());
    }
}