package assignments.TicTacToe;

public enum Player {
    X('X'),
    O('0');

    private char symbol;

    Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void makeMove() {
    }

}

