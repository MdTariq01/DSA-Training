import java.util.Arrays;
public class Search_in_2D {
  public static void main(String[] args) {
    int[][] arr = {
      {4 , 1 , 5},
      {32 , 553 , 3},
      {23, 53 , 21}
    };
    int target = 5;
    int[] array = Searching_In_2D(arr, target);
    System.out.println(Arrays.toString(array));
  }
  static int[] Searching_In_2D(int[][] arr , int target) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == target) {
              return new int[]{i ,j};
            }    
        }
    }
      return new int[]{-1,-1};
  }
}
