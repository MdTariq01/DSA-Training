public class Leetcode_62 {
  public static void main(String[] args) {
      int[] arr = {1 , 3 , 5 , 0 , 8};
      int Profit = maxProfit(arr);
      System.out.println(Profit);
  }
  static int maxProfit(int[] prices) {
            int minimum = prices[0];
            int profit = 0;
            int maxProfit = 0;
            for(int i = 0 ; i < prices.length ; i++){
                if(prices[i] < minimum) {
                    minimum = prices[i];
                }
                else {
                    profit = prices[i] - minimum;
                    if(maxProfit < profit){
                        maxProfit = profit;
                    }
                }
            }
            return maxProfit;
        }
}