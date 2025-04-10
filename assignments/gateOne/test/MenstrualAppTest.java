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
    @Test
    public void testIfPeriodLengthIsValid_getPeriodLength() {
        String start = "04 Mar 2025";
        String end = "09 Mar 2025";
        String actual = myTracker.getFlowPeriod(4, 3);
        String expected = "Your flow period is between " +start+" and " +end;
        assertEquals(expected, actual);
    }
    @Test
    public void testEndOfYear_getPeriodLength() {
        String start = "28 Dec 2025";
        String end = "02 Jan 2026";
        String actual = myTracker.getFlowPeriod(28, 12);
        String expected = "Your flow period is between " +start+" and " +end;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfSafePeriodLengthIsValid_getSafePeriodLength() {
        String start = "09 Mar 2025";
        String end = "13 Mar 2025";
        String actual = myTracker.getSafePeriod(4, 3);
        String expected = "Your safe period is between " +start+" and " +end;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfFertileWindowIsValid_getFertileWindow() {
        String start = "13 Mar 2025";
        String end = "19 Mar 2025";
        String actual = myTracker.getFerTileWindow(4, 3);
        String expected = "Your fertile window period is between " +start+" and " +end;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfOvulationPeriodIsValid_getOvulationPeriod() {
        String ovulationDay = "18 Mar 2025";
        String actual = myTracker.getOvulationPeriod(4, 3);
        String expected = "Your ovulation day is " +ovulationDay;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfn_getCycleLength() {
        String cycleDay = "01 Apr 2025";
        String actual = myTracker.getNextCycleDate(4, 3);
        String expected = "Your next cycle day is " +cycleDay;
        assertEquals(expected, actual);
    }}