/*  Write a program in Java that takes 6 numbers from the user, stores them in an array, and then finds and prints the largest number among them. */

import java.util.Scanner;

// Main class named B
public class B {
    public static void main(String[] args) {
        // Create an array 'a' to store 6 integers
        int a[] = new int[6];

        // Create a Scanner object to take input from the user
        Scanner s1 = new Scanner(System.in);

        // Loop to get 6 numbers from the user and store them in the array
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the value of a[" + i + "]: "); // Ask user to enter a number
            a[i] = s1.nextInt(); // Store the entered number in the array
        }

        // Print all the numbers entered by the user
        System.out.println("The values you entered are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]); // Show each number with its position
        }

        // Find the maximum number in the array
        int m = 0; // Start with 0 as the maximum
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) { // If current number is bigger than current maximum
                m = a[i]; // Update the maximum
            }
        }

        // Print the largest number entered by the user
        System.out.print("Maximum number in the array is: " + m);
        s1.close(); // Close the scanner to free up resources
    }
}

/*        Output:

        Enter the value of a[0]: 1
        Enter the value of a[1]: 2
        Enter the value of a[2]: 3
        Enter the value of a[3]: 4
        Enter the value of a[4]: 5
        Enter the value of a[5]: 6
        The values you entered are:      
        a[0] = 1
        a[1] = 2
        a[2] = 3
        a[3] = 4
        a[4] = 5
        a[5] = 6
        Maximum number in the array is: 6

*/

