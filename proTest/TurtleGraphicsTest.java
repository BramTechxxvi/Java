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
    public void testThatPenCanChangeDirectionFromWestToEast__turnRight() {
        assertFalse(grid.penIsUP());
        grid.turnRight();
        assertEquals(Direction.valueOf("SOUTH"), grid.getCurrentDirection());
    }


}
