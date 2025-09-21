public class PROBLEM_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 0, 8};
        int[] arr2 = {3, 3, 5, 0, 0, 3, 1, 4};

        System.out.println("Max Profit (1 transaction): " + maxProfitOneTransaction(arr1));
        System.out.println("Max Profit (2 transactions): " + maxProfitTwoTransactions(arr2));
    }

    static int maxProfitOneTransaction(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minimum) {
                minimum = price; 
            } else {
                int profit = price - minimum;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    static int maxProfitTwoTransactions(int[] prices) {
        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;

        for (int price : prices) {
            buy1 = Math.max(buy1, -price);         
            sell1 = Math.max(sell1, buy1 + price); 
            buy2 = Math.max(buy2, sell1 - price); 
            sell2 = Math.max(sell2, buy2 + price); 
        }
        return sell2;
    }
}
