import java.util.*;

public class ReverseArray {

    /**
     * Reverses the array in-place using the Two-Pointer Technique.
     * - Start one pointer from the left, another from the right.
     * - Swap elements until pointers meet.
     * 
     * Why this matters:
     * - Foundation for the Two-Pointer approach (used in palindromes, reverse linked list, etc.)
     * - In-place algorithm → O(1) extra space
     * - Time Complexity: O(n), Space Complexity: O(1)
     */
    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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

        // Show original array
        System.out.println("Original array: " + display(arr));

        // Reverse operation
        reverseArray(arr);

        // Show reversed array
        System.out.println("Reversed array: " + display(arr));

        sc.close();
    }
}
