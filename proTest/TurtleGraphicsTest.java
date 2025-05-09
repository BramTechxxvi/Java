package proTest;
import pro.Direction;
import pro.TurtleGraphics;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TurtleGraphicsTest {

    private TurtleGraphics grid;
    @BeforeEach
    void setUp() {
        grid = new TurtleGraphics();
    }

    @Test
    public void testThatPenIsUp__penIsUP() {
        assertTrue(grid.penIsUP());
    }

    @Test
    public void testThatPenIsUp__togglePenUp() {
        grid.togglePenDown();
        assertFalse(grid.penIsUP());
        grid.togglePenUp();
        assertTrue(grid.penIsUP());
    }

    @Test
    public void testThatPenIsDown__togglePenDown() {
        grid.togglePenDown();
        assertFalse(grid.penIsUP());
    }

    @Test
    public void testThatPenCanChangeDirectionFromEastToSouth__turnRight() {
        assertEquals(Direction.valueOf("EAST"), grid.getCurrentDirection());
        grid.turnRight();
        assertEquals(Direction.valueOf("SOUTH"), grid.getCurrentDirection());
    }

    @Test
    public void testThatPenCanChangeDirectionFromSouthToWest__turnLeft() {
        assertEquals(Direction.valueOf("EAST"), grid.getCurrentDirection());
        grid.turnRight();
        grid.turnRight();
        assertEquals(Direction.valueOf("WEST"), grid.getCurrentDirection());
    }

    @Test
    public void testThatPenCanChangeDirectionFromWestToNorth__turnRight() {
        assertEquals(Direction.valueOf("EAST"), grid.getCurrentDirection());
        grid.turnRight();
        grid.turnRight();
        grid.turnRight();
        assertEquals(Direction.valueOf("NORTH"), grid.getCurrentDirection());

    }

    @Test
    public void testThatPenCanChangeDirectionFromEastToNorth__turnLeft() {
        assertEquals(Direction.valueOf("EAST"), grid.getCurrentDirection());
        grid.turnLeft();
        assertEquals(Direction.valueOf("NORTH"), grid.getCurrentDirection());
    }

    @Test
    public void testThatPenCanChangeDirectionFromNorthToWest__turnLeft() {
        assertEquals(Direction.valueOf("EAST"), grid.getCurrentDirection());
    }


}
