import java.util.Scanner;

public class Deletion {
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

        // Ask user which index to delete
        System.out.print("Enter the index to delete (0 to " + (size - 1) + "): ");
        int pos = sc.nextInt();

        // Shift elements to the left to "remove" the element at index 'pos'
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Reduce the size after deletion
        size--;

        // Print updated array
        System.out.print("Array after deletion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
