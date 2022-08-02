
public class Knapsack {

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int matrix[][];

    static int tabulation(int prices[], int weights[],
            int maxWeight, int totalItems) {
        matrix = new int[totalItems + 1][maxWeight + 1];
        // fill the 0th Row and fill the 1st Column for the Base Case
        for (int i = 0; i <= maxWeight; i++) {
            matrix[0][i] = 0; // Not Need it for Java
        }
        for (int i = 0; i <= totalItems; i++) {
            matrix[i][0] = 0; // Not Need it for Java
        }
        for (int i = 1; i <= totalItems; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (weights[i - 1] > j) { // given weight is > than the max weight (Col)
                    matrix[i][j] = matrix[i - 1][j];
                } else {
                    int option1 = prices[i - 1] + matrix[i - 1][j - weights[i - 1]]; // Include
                    int option2 = matrix[i - 1][j]; // Not Include
                    matrix[i][j] = Math.max(option1, option2);
                }
            }
        }
        return matrix[totalItems][maxWeight];
    }

    static int knapSack01(int[] weights, int prices[], int maxWeight, int index) {
        // Termination case
        if (index == weights.length || maxWeight == 0) {
            return 0;
        }
        // if current item weight is greater than with given max weight so by pass that
        // item
        if (weights[index] > maxWeight) {
            // By Pass that item
            return knapSack01(weights, prices, maxWeight, index + 1);
        } else {
            // No current item is > maxWeight (Bag)
            // It means item can come in bag
            // Include the item in a Bag (Weight Less) + Value Increase
            int option1 = prices[index] + knapSack01(weights, prices,
                    maxWeight - weights[index], index + 1);
            // Not Include in the Bag
            int option2 = knapSack01(weights, prices,
                    maxWeight, index + 1);
            return Math.max(option1, option2);
        }
    }

    public static void main(String[] args) {
        int maxWeight = 10; // Maximum we have 3 Kg Capacity Bag
        int prices[] = { 10, 40, 30, 50 };
        int weights[] = { 5, 4, 6, 3 };
        int maxProfit = knapSack01(weights, prices, maxWeight, 0);
        System.out.println(maxProfit);
        System.out.println(tabulation(prices, weights, maxWeight, prices.length));
        System.out.println("Matrix ......");
        printMatrix(matrix);
    }
}

