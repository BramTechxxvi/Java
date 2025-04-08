package assignments.tddSnacks.test;
import assignments.tddSnacks.AutomaticBike;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AutomaticBikeTest {

    private AutomaticBike myMethod;
    @BeforeEach
    public void setUp() { myMethod = new AutomaticBike();}

    @Test
    public void testThatAutomaticBikeOff_switchOffBike() {
        assertTrue(myMethod.switchOnBike());
        assertFalse(myMethod.switchOffBike());
    }
    @Test
    public void testThatAutomaticBikeIsOn_switchOnBike() {
        assertFalse(myMethod.switchOffBike());
        assertTrue(myMethod.switchOnBike());
    }
    @Test
    public void testThatBikeCannotAccelerateWhenOff() {
        assertEquals(0, myMethod.accelerateBike());
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearOne_accelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(1);
        assertEquals(1, myMethod.accelerateBike());
        assertEquals(2, myMethod.accelerateBike());
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearTwo_accelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(2);
        assertEquals(2, myMethod.accelerateBike());
        myMethod.accelerateBike();
        assertEquals(4, myMethod.getSpeed());
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearThree_accelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(3);
        assertEquals(3, myMethod.accelerateBike());
        myMethod.accelerateBike();
        assertEquals(6, myMethod.getSpeed());
    }
    @Test
    public void testThatAutomaticBikeCanAccelerateInGearFour_accelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(4);
        assertEquals(4, myMethod.accelerateBike());
        assertEquals(8, myMethod.accelerateBike());
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearOne_decelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(1);
        for (int count = 0; count < 5; count++) { myMethod.accelerateBike(); }
        assertEquals(4, myMethod.decelerateBike());
        assertEquals(3, myMethod.decelerateBike());
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearTwo_decelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(2);
        for (int count = 0; count < 5; count++) { myMethod.accelerateBike(); }
        assertEquals(8, myMethod.decelerateBike());
        assertEquals(6, myMethod.decelerateBike());
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearThree_decelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(3);
        for (int count = 0; count < 5; count++) { myMethod.accelerateBike(); }
        assertEquals(12, myMethod.decelerateBike());
        assertEquals(9, myMethod.decelerateBike());
    }
    @Test
    public void testThatAutomaticBikeCanDecelerateInGearFour_decelerateBike() {
        assertTrue(myMethod.switchOnBike());
        myMethod.setGear(4);
        for (int count = 0; count < 11; count++) { myMethod.accelerateBike(); }
        assertEquals(40, myMethod.decelerateBike());
    }}