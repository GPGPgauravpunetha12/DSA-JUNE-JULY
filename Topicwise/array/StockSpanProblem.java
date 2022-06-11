public class StockSpanProblem {
    public static void main(String[] args) {
        int prices[] = { 1, 5, 3, 8, 12 };
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                int profit = prices[i] - prices[i - 1];
                maxProfit = maxProfit + profit;
            }
        }
        System.out.println("Max Profit " + maxProfit);
    }
}
