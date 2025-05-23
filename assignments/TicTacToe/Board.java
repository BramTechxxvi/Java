package assignments.TicTacToe;

public class Board {
    private static final int size = 3;
    private final char[][] grid;

    public Board() {
        this.grid = new char[size][size];
        initializeGrid();
    }

    public boolean isEmpty() {
        for (int row = 0; row < grid.length; row++) {
        for (int col = 0; col < grid[row].length; col++) {
            if (grid[row][col] != ' ') return false;
        }} return true;
    }

    private void initializeGrid() {
        for (int row = 0; row < grid.length; row++) {
        for (int col = 0; col < grid[row].length; col++) {
           grid[row][col] = ' ';
        }}
    }

    public char[][] getGrid() { return grid; }

    public void displayGrid() {
        System.out.println("___+___+___");
        for (int row = 0; row < grid.length; row++) {
        for (int col = 0; col < grid[row].length; col++) {
            System.out.print(" " + grid[row][col]);
            if (col < grid[row].length - 1) System.out.print(" |");
            } System.out.println("\n___+___+___");
        }
    }

    public void placeMove(int row, int col, Player player) {
        getGrid()[row][col] = player.getSymbol();
    }



}
