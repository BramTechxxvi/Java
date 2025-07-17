import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LcmTest {

    @Test
    void testCanFindGcf__greatestCommonFsctor() {
        Lcm lcm = new Lcm();
        int result = lcm.greatestCommonDivisor(1, 4, 8, 20, 29);
        assertEquals(1, result);
    }
}