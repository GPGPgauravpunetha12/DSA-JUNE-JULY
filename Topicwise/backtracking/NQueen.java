
public class NQueen {
    static boolean canIPlaceAQueen(boolean board[][], int currentRow, int col) {
        // Constraint Check
        // 1. Check in Same Row (Above Row and Same Col)
        for (int i = currentRow; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }

        // 2.Checking Upper Left Diagonal
        for (int i = currentRow, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // 3. Check in Upper Right Diagonal
        for (int i = currentRow, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    static int countNumberOfWaysToPlaceQueen(boolean board[][], int currentRow) {
        int count = 0;
        // Termination Case
        if (currentRow == board.length) {
            return 1; // Return Count (1 Way)
        }
        // 1st Step
        // Traverse the cols
        for (int cols = 0; cols < board[currentRow].length; cols++) {
            // Check Before Place
            if (canIPlaceAQueen(board, currentRow, cols)) {
                // Place a Queen in a Cell
                board[currentRow][cols] = true;
                count += countNumberOfWaysToPlaceQueen(board, currentRow + 1);
                // BackTracking
                board[currentRow][cols] = false; // Undo the Changes
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 4 x 4 matrix boolean
        boolean[][] board = new boolean[4][4];
        int ways = countNumberOfWaysToPlaceQueen(board, 0);
        System.out.println("No of ways " + ways);

    }
}
