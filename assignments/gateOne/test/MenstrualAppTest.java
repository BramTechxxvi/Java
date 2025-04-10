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
    public void testIfSecondSafePeriodIsValid_getSecondSafePeriod() {
        String start = "20 Mar 2025";
        String end = "30 Mar 2025";
        String actual = myTracker.getSecondSafePeriod(4, 3);
        String expected = "Your second safe period is between " +start+" and " +end;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfFertileWindowIsValid_getFertileWindow() {
        String start = "12 Mar 2025";
        String end = "18 Mar 2025";
        String actual = myTracker.getFerTileWindow(4, 3);
        String expected = "Your fertile window period is between " +start+" and " +end;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfOvulationPeriodIsValid_getOvulationPeriod() {
        String ovulationDay = "17 Mar 2025";
        String actual = myTracker.getOvulationPeriod(4, 3);
        String expected = "Your ovulation day is " +ovulationDay;
        assertEquals(expected, actual);
    }
    @Test
    public void testIfNextCycleDateIsValid_getNextCycleDate() {
        String cycleDay = "01 Apr 2025";
        String actual = myTracker.getNextCycleDate(4, 3);
        String expected = "Your next cycle day is " +cycleDay;
        assertEquals(expected, actual);
    }}