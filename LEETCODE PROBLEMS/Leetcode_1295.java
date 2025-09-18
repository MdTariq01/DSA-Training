public class Leetcode_1295 {
  public static void main(String[] args) {
    int[] num = {-12};
    System.out.println(findNumbers(num));
  }
  static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if (even(nums[i])){
            count++;
           } 
        }
        return count;
}
    static boolean even(int num) {
      int count = 0;
      while(num > 0) {
        count++;
        num = num/10;
      }
      if (even_odd(count)){
        return true;
      }
      return false;
    }
    static boolean even_odd(int num) {
      if(num%2 == 0) {
        return true;
      }
      return false;
    }
}
