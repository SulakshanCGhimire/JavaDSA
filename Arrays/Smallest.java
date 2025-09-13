import java.util.*;

public class Smallest {

    /**
     * Finds the smallest element in the array.
     * - Initialize with the first element.
     * - Compare each element with the current smallest.
     * - Update smallest when a smaller element is found.
     *
     * Why this matters:
     * - Complements "find largest" problem.
     * - Core for problems like range finding, optimization checks, etc.
     * - Time Complexity: O(n)
     * - Space Complexity: O(1)
     */
    static int findSmallest(int[] arr) {
        int smallest = arr[0]; // assume first element is smallest initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; // update smallest
            }
        }
        return smallest;
    }

    /**
     * Utility function to return array as a string.
     * - Uses StringBuilder for efficiency.
     * - Alternative: Arrays.toString(arr)
     */
    static String display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Edge case check: empty array
        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            sc.close();
            return;
        }

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Show array
        System.out.println("Array: " + display(arr));

        // Find and print smallest
        int smallest = findSmallest(arr);
        System.out.println("The smallest element is: " + smallest);

        sc.close();
    }
}
