
public class Max_and_Min {
  public static void main(String[] args) {
    int[] arr = {1 , 3 , 4 , 5 , 6};
    System.out.println("The Max Value is " + Max(arr) + " " + "and the Min Value is " + Min(arr));
  }
  static int Max(int[] arr) {
    int Max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
       if (arr[i] > Max) {
        Max = arr[i];
       }
    }
    return Max;
  }

  static int Min(int[] arr) {
    int Min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
       if (arr[i] < Min) {
        Min = arr[i];
       }
    }
    return Min;
  }
}
