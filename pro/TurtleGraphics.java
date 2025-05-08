package pro;

public class TurtleGraphics {

    private int row;
    private int col;
    private char[][] grid;
    private boolean penStatus;

    public TurtleGraphics() {
        this.row = row;
        this.col = col;
        this.grid = new char[row][col];
    }

    public boolean penIsDown() {
       return penStatus;
    }

    public void togglePenUp () {
        penStatus = false;
    }

    public void togglePenDown() {
        penStatus = true;
    }
    /*
    public int move(int numOfSteps) {
        if (numOfSteps < 0) {}
    }

     */
    public void displayGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = ' ';
            } System.out.println();
        } System.out.println();
    }

}
