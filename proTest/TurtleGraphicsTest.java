package proTest;
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
    public void testThatPenIsUp__penIsDown() {
        assertFalse(grid.penIsDown());
    }
    @Test
    public void testThatPenIsUp__togglePenUp() {
        grid.togglePenDown();
        grid.togglePenUp();
        assertFalse(grid.penIsDown());
    }


    @Test
    public void testThatPenIsDown__togglePenDown() {
        grid.togglePenUp();
        grid.togglePenDown();
        assertTrue(grid.penIsDown());
    }


}
