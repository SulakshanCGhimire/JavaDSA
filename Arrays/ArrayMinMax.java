import java.util.*;

public class ArrayMinMax {

    /**
     * Finds the minimum and maximum in an array using a single linear scan.
     * 
     * - Traverse array once, update min and max as you go.
     * - Time Complexity: O(n) → every element is checked once.
     * - Space Complexity: O(1) → only two variables (min, max).
     * 
     * Why this matters:
     * - Very common interview warm-up problem.
     * - Reinforces scanning + conditional logic.
     * - This "track min & max" pattern appears often in range, stock span,
     *   temperature span, sliding window, etc.
     */
    static void findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) min = num; // update minimum
            if (num > max) max = num; // update maximum
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    /**
     * Utility function to display array elements as a string.
     * - Good practice for iterating with enhanced for-loop.
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

        // Find Min and Max
        findMinMax(arr);

        sc.close();
    }
}
