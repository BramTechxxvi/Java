package assignmentTest.nigeriaTest;
import assignments.nigeria.PoliticalZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class PoliticalZoneTest {

    @Test
    public void test_If_Nigeria_Can_Get_All_Geo_Political_Zones() {
        String[] zoneNames = {"NorthCentral", "NorthEast", "NorthWest", "SouthEast", "SouthWest", "SouthSouth"};
        assertEquals(Arrays.toString(zoneNames), Arrays.toString(PoliticalZone.getAllZones()));
    }

    @Test
    public void test_If_Nigeria_Can_Get_States_In_Political_Zone__getStates() {
        PoliticalZone theZone = PoliticalZone.SouthEast;
        String[] expectedStates = {"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"};
        assertArrayEquals(expectedStates, theZone.getStates());
    }

    @Test
    public void test_If_Nigeria_Can_Get_States_In_Political_Zone2__getStates() {
        PoliticalZone theZone = PoliticalZone.NorthWest;
        String[] expectedStates = {"Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"};
        assertArrayEquals(expectedStates, theZone.getStates());
    }

    @Test
    public void test_If_Nigeria_Can_Get_State_Zone() {
        String state = "Abia";
        String zone = "SouthEast";
        assertEquals(zone, PoliticalZone.findZoneByState(state));
    }

    @Test
    public void test_If_Nigeria_Can_Get_State_Zone__ThrowsException() {
        Exception bram = assertThrows(Exception.class, () ->  PoliticalZone.findZoneByState(""));
        assertEquals("Invalid state", bram.getMessage());

        Exception bram2 = assertThrows(Exception.class, () ->  PoliticalZone.findZoneByState(" "));
        assertEquals("Invalid state", bram2.getMessage());
    }

    @Test
    public void test_If_Nigeria_Can_Get_State_Zone_With_Invalid_State__ThrowsException() {
        Exception bram = assertThrows(Exception.class, () ->  PoliticalZone.findZoneByState("New York"));
        assertEquals("State not in any Political Zone", bram.getMessage());
    }

}
