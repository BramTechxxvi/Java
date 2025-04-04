package assignments.test;
import assignments.AirConditioner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AirConditionerTest {

    private AirConditioner mySwitch;
    @BeforeEach
    @Test
    public void setUp() {
        mySwitch = new AirConditioner();
    }
    @Test
    public void testFunctionSwitchOnAC_switchOnAc() {
        assertTrue(mySwitch.switchOnAc());
    }
    @Test
    public void testFunctionSwitchOffAC_switchOffAc() {
        assertFalse(mySwitch.switchOffAc());
    }
    @Test
    public void testFunctionIncreaseTemperature() {
        int counter = 16;
        counter = counter+1;
        assertTrue(mySwitch.switchOnAc());
        assertEquals(counter, mySwitch.increaseTemp(), "Increase temperature");
        assertEquals(18, mySwitch.increaseTemp(), "Increase temperature");
        counter = mySwitch.increaseTemp() + 30;
        counter = 30;
        assertEquals(30, counter, "Increase temperature");

    }
    @Test
    public void testFunctionDecreaseTemperature() {
        int counter = 0;
        counter = counter - 1;
        assertTrue(mySwitch.switchOnAc());
        assertEquals(16, mySwitch.decreaseTemp(), "Decrease temperature");
        counter = mySwitch.increaseTemp();
    }
}