package assignmentTest.TicTacTest;

import assignments.TicTacToe.Board;
import assignments.TicTacToe.Player;
import assignments.TicTacToe.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TicTacToeTest {

    private TicTacToe playGame;
    private Board board;

    @BeforeEach
    public void setUp() {
        playGame = new TicTacToe();
        board = playGame.getBoard();
    }

    @Test
    public void testThatBoardIsEmpty__isBoardEmpty() {
        assertTrue(playGame.isBoardEmpty());
    }

    @Test
    public void testThatBoardIsFull__() {
        char[][] grid = board.getGrid();
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = 'X';
            }
        }
        assertFalse(playGame.isBoardEmpty());
    }

    @Test
    public void testThatPlayerCanMakeMove__makeMove() {
        Player playerOne = Player.X;
        Player playerTwo = Player.O;
        char[][] grid = board.getGrid();

        playGame.makeMove(2, playerOne);
        assertEquals('X', grid[0][1]);

        playGame.makeMove(5, playerTwo);
        assertEquals('O', grid[1][1]);

        assertEquals(' ', grid[2][1]);
        playGame.displayBoard();
    }

    @Test
    public void testInvalidPosition__ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> playGame.makeMove(0, Player.X));
        assertEquals(exception.getMessage(), "Invalid position");

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> playGame.makeMove(10, Player.O));
        assertEquals(exception2.getMessage(), "Invalid position");
    }
}