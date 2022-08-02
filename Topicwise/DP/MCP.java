public class MCP {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int matrix[][];

    static int tabulation(int costMatrix[][]) {
        matrix = new int[costMatrix.length][costMatrix.length];
        matrix[0][0] = costMatrix[0][0];
        // First Fill the First Row Column
        for (int i = 1; i < matrix.length; i++) {
            matrix[0][i] = matrix[0][i - 1] + costMatrix[0][i];
        }
        // First Fill the First Column Row
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = matrix[i - 1][0] + costMatrix[i][0];
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                int diagonal = matrix[i - 1][j - 1];
                int left = matrix[i][j - 1];
                int up = matrix[i - 1][j];
                int min = Math.min(Math.min(diagonal, left), up);
                matrix[i][j] = min + costMatrix[i][j];
            }
        }
        return matrix[matrix.length - 1][matrix.length - 1];
    }

    static int mcp(int costMatrix[][], int row, int col) {
        // Termination Case
        if (row < 0 || col < 0) {
            return Integer.MAX_VALUE; // Can't Contribute in a result
        }
        if (row == 0 && col == 0) {
            return costMatrix[row][col];
        }
        // Small Problem
        int diagonal = mcp(costMatrix, row - 1, col - 1);
        int right = mcp(costMatrix, row, col - 1);
        int down = mcp(costMatrix, row - 1, col);
        return costMatrix[row][col] + Math.min(Math.min(diagonal, right), down);

    }

    public static void main(String[] args) {
        int costMatrix[][] = {
                { 2, 0, 6 }, { 3, 1, 7 }, { 4, 5, 9 }
        };
        int result = mcp(costMatrix, 2, 2);
        System.out.println(result);
        System.out.println(tabulation(costMatrix));
        printMatrix(matrix);
    }
}
