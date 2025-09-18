import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1 , 2 ,4 ,5 ,5};
    int target = 2;
    int index = linear_Search(arr, target);
    System.out.println(index);
    System.out.println(linear_Search1(arr, target));
    
  }
  static int linear_Search(int[] arr , int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
          return i;
        } 
    }
    return -1;
  }

  static boolean linear_Search1(int[] arr , int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
          return true;
        } 
    }
    return false;
  }
}