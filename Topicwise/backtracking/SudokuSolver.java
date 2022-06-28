
public class SudokuSolver {
    final int MAX_SIZE = 9;

    public SudokuSolver(int[][] board) {
        this.board = board;
    }

    public void display() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isPresentInRow(int row, int value) {
        for (int col = 0; col < MAX_SIZE; col++) {
            if (board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInCol(int col, int value) {
        for (int row = 0; row < MAX_SIZE; row++) {
            if (board[row][col] == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isPresentInSubGrid(int row, int col, int value) {
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isCorrectToPlace(int row, int col, int value) {
        // Row Unique
        // Col Unique
        // Sub Grid Unique
        return !isPresentInRow(row, value) &&
                !isPresentInCol(col, value) &&
                !isPresentInSubGrid(row, col, value);
    }

    int[][] board;

    public boolean solveSudoku(int row, int col) {

        // Edge Case Col out of Board
        if (col == MAX_SIZE) {
            row = row + 1; // Move to the Next Row
            col = 0; // Col reset to 0
        }
        // Termination Case
        if (row == MAX_SIZE) {
            return true;
        }
        if (board[row][col] != 0) {
            return solveSudoku(row, col + 1);
        }
        // if cell is empty , cell is 0, Put the value there
        for (int i = 1; i <= MAX_SIZE; i++) {
            if (isCorrectToPlace(row, col, i)) {
                board[row][col] = i; // Put the value in a cell.
                // Move to the Next Cell
                boolean result = solveSudoku(row, col + 1);
                if (result) {
                    return true; // Stack Fall
                }
                // Undo the cell value (Stack Fall)
                board[row][col] = 0; // Empty the Cell
            }
        }
        // nothing works
        return false;
    }

    public static void main(String[] args) {
        // Empty is represent as 0.
        int board[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

        SudokuSolver solver = new SudokuSolver(board);
        boolean result = solver.solveSudoku(0, 0);
        System.out.println(result ? " Sudoku Solve " : " Not Solve...");
        solver.display();
    }
}
