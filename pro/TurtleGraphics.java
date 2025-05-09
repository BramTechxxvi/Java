package pro;

public class TurtleGraphics {

    private int row;
    private int col;
    private char[][] grid;
    private PenPosition penPosition;
    private Direction currentDirection;

    public TurtleGraphics() {
        //this.row = row;
        //this.col = col;
        this.grid = new char[row][col];
        this.penPosition = PenPosition.UP;
        this.currentDirection = Direction.EAST;
    }

    public boolean penIsUP() {
        return penPosition == PenPosition.UP;
    }

    public void togglePenUp () {
        penPosition = PenPosition.UP;
    }

    public void togglePenDown() {
        penPosition = PenPosition.DOWN;
    }

    public void turnRight() {
        if (currentDirection == Direction.WEST) currentDirection = Direction.NORTH;
        if (currentDirection == Direction.SOUTH) currentDirection = Direction.WEST;
        if (currentDirection == Direction.EAST) currentDirection = Direction.SOUTH;
    }

    public void turnLeft() {
        if (currentDirection == Direction.EAST) currentDirection = Direction.NORTH;
    }

    public Direction getCurrentDirection() { return currentDirection; }
    }
/*
    public void displayGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = ' ';
            } System.out.println();
        } System.out.println();
    }

 */

