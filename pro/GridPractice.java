package pro;

public class GridPractice {

    public static void main(String[] args) {
        boolean[][] grid = {
                {true, false, true},
                {false, true, true},
                {true, true, false}
        };

        updateElement(grid);

        for (int i = 10; i >0; i--) {
            System.out.println(i);
        }
    }

    public static void updateElement(boolean[][] grid) {
        for (int count = 0; count < grid.length; count++) {
            for (int counter = 0; counter < grid[count].length; counter++) {
                if (grid[count][counter]) System.out.print(1 + " ");
                else System.out.print(0 + " ");
        } System.out.println();
        }
    }

}
