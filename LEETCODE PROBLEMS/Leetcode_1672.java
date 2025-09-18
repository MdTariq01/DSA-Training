public class Leetcode_1672 {
  public static void main(String[] args) {
    int[][] arr = {
      {1 , 2 , 3},
      {5 , 1 , 0}
    };
      System.out.println(maximumWealth(arr));
  }
  static int maximumWealth(int[][] accounts) {
    int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
          int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (ans < sum) {
              ans = sum;
            }
        }
        return ans;
    }
}
