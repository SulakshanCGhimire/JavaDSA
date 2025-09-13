import java.util.*;

public class SecondLargest {

    // Function to find the second largest element in the array
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;        // Initialize largest as the smallest possible integer
        int secondLargest = Integer.MIN_VALUE;  // Initialize second largest similarly

        // Traverse through the array
        for (int num : arr) {
            if (num > largest) {
                // Case 1: New number is greater than the current largest
                // → Update secondLargest to old largest, and update largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Case 2: Number is smaller than largest but greater than secondLargest
                // → Update only secondLargest
                secondLargest = num;
            }
        }

        // After traversal, check if secondLargest was updated
        if (secondLargest == Integer.MIN_VALUE) {
            // This happens if all elements are equal or array has only one unique element
            throw new RuntimeException("No second largest element exists (all elements are equal)");
        }

        return secondLargest;
    }

    // Function to display array elements as a string
    static String display(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");  // Append each element followed by a space
        }
        return sb.toString().trim();     // Trim removes extra space at the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            // Edge case: Cannot find second largest if less than 2 elements
            System.out.println("Array must contain at least two elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Take input into array
        }

        System.out.println("Array: " + display(arr));

        try {
            // Call function and print result
            int secondLargest = findSecondLargest(arr);
            System.out.println("The second largest element is: " + secondLargest);
        } catch (Exception e) {
            // Handle cases like "all elements are equal"
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
