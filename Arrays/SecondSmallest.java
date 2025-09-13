import java.util.*;

public class SecondSmallest {

    // Function to find the second smallest element in the array
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;        // Initialize with the largest possible integer
        int secondSmallest = Integer.MAX_VALUE;  // Same for second smallest

        // Traverse the array
        for (int num : arr) {
            if (num < smallest) {
                // Case 1: Found a new smallest → shift old smallest to secondSmallest
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                // Case 2: num lies between smallest and secondSmallest (ignore duplicates of smallest)
                secondSmallest = num;
            }
        }

        // After traversal, check if secondSmallest got updated
        if (secondSmallest == Integer.MAX_VALUE) {
            // This happens if all elements are equal or only one unique element exists
            throw new RuntimeException("No second smallest element exists (all elements are equal)");
        }

        return secondSmallest;
    }

    // Utility function to display array as a string
    static String display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");  // Append each number followed by a space
        }
        return sb.toString().trim();     // Remove trailing space
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            // Edge case: cannot find second smallest if fewer than 2 elements
            System.out.println("Array must contain at least two elements.");
            sc.close();
            return;
        }

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display array
        System.out.println("Array: " + display(arr));

        try {
            // Find and print second smallest
            int secondSmallest = findSecondSmallest(arr);
            System.out.println("The second smallest element is: " + secondSmallest);
        } catch (Exception e) {
            // Handle cases like all elements equal
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
