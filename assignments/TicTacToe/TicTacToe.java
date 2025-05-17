package assignments.TicTacToe;

public class TicTacToe {

    private Player player;
    private Board board;

    public TicTacToe() {
        board = new Board();
    }

    public boolean isBoardEmpty() {
        return board.isEmpty();
    }

    public Board getBoard() {
        return board;
    }

    public void displayBoard() {
        board.displayGrid();
    }
    public void makeMove(int position, Player player) {
        validateMove(position);
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        board.placeMove(row, col, player);
    }

    private void validateMove(int position) {
        if (position < 0 || position > 9) throw new IllegalArgumentException("Invalid position");
    }

}
