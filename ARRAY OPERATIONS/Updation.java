import java.util.Scanner;

public class Updation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare and initialize array
        int[] arr = new int[99];   // fixed maximum size
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int size = 5;  // current number of elements in the array

        // Ask user which index to update
        System.out.print("Enter index to update (0 to " + (size - 1) + "): ");
        int pos = sc.nextInt();

        // Ask user for new element value
        System.out.print("Enter new element: ");
        int item = sc.nextInt();

        // Update operation: replace element at given index
        arr[pos] = item;

        // Print updated array
        System.out.print("Array after update: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
