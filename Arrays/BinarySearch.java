import java.util.*;

public class BinarySearch {

    /**
     * Iterative Binary Search implementation.
     * - Works on a sorted array.
     * - Keeps narrowing the search range by comparing the key with the mid element.
     * 
     * Why this matters:
     * - Foundation for divide-and-conquer algorithms.
     * - Very efficient compared to Linear Search.
     * - Time Complexity: O(log n)
     * - Space Complexity: O(1) (no recursion stack)
     */
    static int binarySearchIterative(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            // Prevents potential overflow (better than (left+right)/2)
            int mid = left + (right - left) / 2; 
            
            if (arr[mid] == key) {
                return mid; // key found
            }
            if (arr[mid] < key) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }
        return -1; // key not found
    }

    /**
     * Recursive Binary Search implementation.
     * - Uses the same logic as iterative but via recursion.
     * 
     * Why this matters:
     * - Helps in understanding recursion and call stacks.
     * - Time Complexity: O(log n)
     * - Space Complexity: O(log n) due to recursive stack calls.
     */
    static int binarySearchRecursive(int[] arr, int key, int left, int right) {
        if (left > right) {
            return -1; // base case: not found
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] < key) {
            return binarySearchRecursive(arr, key, mid + 1, right); // search right half
        } else {
            return binarySearchRecursive(arr, key, left, mid - 1); // search left half
        }
    }

    /**
     * Utility function to return array as string.
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

        // Show unsorted array
        System.out.println("Array: " + display(arr));

        // Sort before Binary Search (mandatory condition)
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + display(arr));

        // Input element to search
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();

        // Iterative Binary Search
        System.out.println("Performing Binary Search Iteratively...");
        int result = binarySearchIterative(arr, key);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
            System.out.println("Element found at position: " + (result + 1));
        }

        // Recursive Binary Search
        System.out.println("Performing Binary Search Recursively...");
        int resultRec = binarySearchRecursive(arr, key, 0, n - 1);
        if (resultRec == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + resultRec);
            System.out.println("Element found at position: " + (resultRec + 1));
        }

        sc.close();
    }
}
