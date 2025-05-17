package assignmentTest.tddTest;
import assignments.tddSnacks.AirConditioner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AirConditionerTest {

    private AirConditioner mySwitch;
    @BeforeEach
    public void setUp() { mySwitch = new AirConditioner();}

    @Test
    public void testFunctionSwitchOnAC_turnsOnAc() { assertTrue(mySwitch.switchOnAc());}

    @Test
    public void testFunctionSwitchOffAC_turnsOffAc() { assertFalse(mySwitch.switchOffAc()); }

    @Test
    public void testIfTemperatureCannotChangeWhenOff() {
        mySwitch.switchOffAc();
        assertEquals(0, mySwitch.increaseTemperature());
        assertEquals(0, mySwitch.decreaseTemperature());
    }
    @Test
    public void testFunctionIncreaseTemperature_increasesTemperatureBy1() {
        assertTrue(mySwitch.switchOnAc());
        assertEquals(17, mySwitch.increaseTemperature(), "Increased temperature by  1");
        assertEquals(18, mySwitch.increaseTemperature(), "Increased temperature by  1");
        for (int i = 1; i < 20; i++) {mySwitch.increaseTemperature();}
        assertNotEquals(38, mySwitch.increaseTemperature());
        assertEquals(30, mySwitch.getTemperature(), "Temperature does not go above 30 degrees");
    }
    @Test
    public void testFunctionDecreaseTemperature_decreasesTemperatureBy1() {
        assertTrue(mySwitch.switchOnAc());
        assertEquals(16, mySwitch.decreaseTemperature(), "Decrease temperature by 1");
        mySwitch.increaseTemperature();
        mySwitch.increaseTemperature();
        assertEquals(18, mySwitch.getTemperature(),"Temperature after increasing by 2 degrees");
        mySwitch.decreaseTemperature();
        assertEquals(17, mySwitch.getTemperature());
        assertNotEquals(16, mySwitch.getTemperature());
        assertEquals(16, mySwitch.decreaseTemperature());
        mySwitch.decreaseTemperature();
        assertEquals(16, mySwitch.getTemperature(),"Temperature does not gpo below 16 degrees");
    }}