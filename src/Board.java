public class Board {
    private String[][] grid;
    private static final int gird = 3;

    public Board() {
        grid = new String[3][3];
        resetBoard();
    }

    private void resetBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = "";
            }
        }
    }
    public boolean makeMove(int row, int col, String player) {
        // Ensure the row and column are within bounds and the cell is empty
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col] == " ") {
            grid[row][col] = player; // Mark the move for the player ('X' or 'O')
            return true;
        }
        return false;
    }

    public boolean checkWin() {
        // Check rows for a win
        for (int row = 0; row < 3; row++) {
            if (grid[row][0] == grid[row][1] && grid[row][1] == grid[row][2] && grid[row][0] != " ") {
                return true;
            }
        }
        // Check columns for a win
        for (int col = 0; col < 3; col++) {
            if (grid[0][col] == grid[1][col] && grid[1][col] == grid[2][col] && grid[0][col] != " ") {
                return true;
            }
        }

        // Check diagonals for a win
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != " ") {
            return true;
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != " ") {
            return true;
        }

        return false; // No win detected
    }

    public boolean checkTie() {
        for (int row = 0; row < 3; row++)
        {
            for (int col = 0; col < 3; col++)
            {
               if (grid[row][col].equals(" "))
                {
                    return false;
                }
            }
        }
        return true;
    }
}