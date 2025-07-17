import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LcmTest {

    @Test
    void testCanFindGcf__greatestCommonFsctor() {
        Lcm lcm = new Lcm();
        assertEquals(1, lcm.greatestCommonDivisor(1, 4, 8, 20, 29));
        assertEquals(4, lcm.greatestCommonDivisor(4, 8));
        assertEquals(9, lcm.greatestCommonDivisor(27, 81, 18));
    }
}