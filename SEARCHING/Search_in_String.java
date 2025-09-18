// import java.util.Scanner;

public class Search_in_String {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    String name = "Tariq";
    char target = 'r';
    int index = searching(name, target);
    System.out.println("The element is found at the index: " + index );
  }
  static int searching(String name , char target) {
    for (int i = 0; i < name.length(); i++) {
        if (target == name.charAt(i)) {
          return i;
        }
    }
    return -1;
  }
}