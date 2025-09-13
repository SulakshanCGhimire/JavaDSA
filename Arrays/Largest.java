import java.util.*;

public class Largest {

    /**
     * Finds the largest element in the array.
     * - Initialize with the first element.
     * - Compare each element with the current largest.
     * - Update largest when a bigger element is found.
     * 
     * Why this matters:
     * - Foundation for solving min/max problems.
     * - Core for many algorithms like finding top-k elements, range queries, etc.
     * - Time Complexity: O(n)
     * - Space Complexity: O(1)
     */
    static int findLargest(int[] arr) {
        int largest = arr[0]; // assume first element is largest initially
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // update largest
            }
        }
        return largest;
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

        // Edge case check: empty array (optional for interview readiness)
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

        // Find and print largest
        int largest = findLargest(arr);
        System.out.println("The largest element is: " + largest);

        sc.close();
    }
}
