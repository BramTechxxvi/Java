package assignments.TicTacToe;

public class Board {
    private static final int size = 3;
    private char[][] grid;

    public Board() {
        this.grid = new char[size][size];
        initializeGrid();
    }

    public boolean isEmpty() {
        for (int count = 0; count < grid.length; count++) {
        for (int counter = 0; counter < grid[count].length; counter++) {
            if (grid[count][counter] != ' ') return false;
        }} return true;
    }

    private void initializeGrid() {
        for (int count = 0; count < grid.length; count++) {
        for (int counter = 0; counter < grid[count].length; counter++) {
           grid[count][counter] = ' ';
        }}
    }

    public void getGrid() {
    }



}
