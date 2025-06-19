import java.util.*; // Import the Scanner class for user input

public class C {
    public static void main(String args[]) {
        int a[] = new int[5]; // Declare an integer array of size 5
        int sum = 0; // Variable to store the sum of array elements
        Scanner s1 = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter the values:");
        for (int i = 0; i < a.length; i++) {
            // Prompt user to enter value for each array element
            System.out.print("Value of a["+i+"]:");
            a[i] = s1.nextInt(); // Read integer input and store in array
            sum += a[i]; // Add the input value to sum
        }
        // Display the sum of all elements in the array
        System.out.println("The sum of all the elements of the array is: " + sum);

        s1.close(); // Close the Scanner to free resources
    }
}
