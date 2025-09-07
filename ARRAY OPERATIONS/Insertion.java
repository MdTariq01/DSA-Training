import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user which element to insert
        System.out.print("Enter element to insert into array: ");
        int num = sc.nextInt();

        // Declare and initialize array
        int[] arr = new int[99];   // fixed maximum size
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int size = 5;  // current size of array (we already filled 5 elements)

        // Ask user at which index to insert the new element
        System.out.print("Enter the index to insert at: ");
        int pos = sc.nextInt();

        // Shift elements to the right, starting from the end of the array,
        // to make space for the new element at 'pos'
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Increase size after insertion
        size++;

        // Place the new element at the given index
        arr[pos] = num;

        // Print updated array
        System.out.print("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
