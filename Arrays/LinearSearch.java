import java.util.*;

public class LinearSearch {

    /**
     * Performs Linear Search in the array.
     * - Iterates through array elements one by one.
     * - Compares each element with the target (key).
     * - Returns index if found, otherwise -1.
     * 
     * Why this matters:
     * - Simple but powerful searching technique for unsorted data.
     * - Foundation for understanding searching algorithms before Binary Search.
     * - Time Complexity: O(n) → worst case (when key is at the end or absent).
     * - Space Complexity: O(1) → constant extra space.
     */
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index if element found
            }
        }
        return -1; // if not found, return -1
    }

    /**
     * Utility function to return array as string
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
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Show original array (good for debugging/verification)
        System.out.println("Array: " + display(arr));

        // Input element to be searched
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        // Perform Linear Search
        int result = linearSearch(arr, key);

        // Output result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            // Show both index (0-based) and position (1-based)
            System.out.println("Element found at index: " + result);
            System.out.println("Element found at position: " + (result + 1));
        }

        sc.close();
    }
}
