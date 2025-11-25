package Exercise2_26;

// Multiples

import java.util.Scanner; // Import the Scanner class to read input from the user

/*
 * Write an application that reads two integers, determines whether the first is a
 * multiple of the second and prints the result. [Hint: Use the remainder operator.]
 */
public class Main {

    // The standard entry point for a Java application must be: public static void main(String[] args)
    public static void main(String[] args) {

        // Create a Scanner object to read input from the standard input stream (keyboard)
        Scanner input = new Scanner(System.in);

        // Declare two integer variables to store the user's input numbers
        int x; // Stores the first integer
        int y; // Stores the second integer

        // Prompt the user to enter the first integer
        System.out.print("Enter first integer: ");
        // Read the first integer entered by the user and store it in x
        x = input.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter second integer: ");
        // Read the second integer entered by the user and store it in y
        y = input.nextInt();

        // --- Core Logic for Determining Multiples ---

        // To check if 'x' is a multiple of 'y', the remainder of x divided by y must be 0.
        // x is a multiple of y if and only if x % y == 0. The original condition (y%x == 0 || x%y == 0) checks if either is a multiple of the other.
        // The problem asks specifically if the FIRST (x) is a multiple of the SECOND (y).

        if (x % y == 0) {
            // If the remainder is 0, x is a multiple of y.
            // Print the result using System.out.printf for formatted output.
            System.out.printf("%d is a multiple of %d%n", x, y);
        } else {
            // If the remainder is not 0, x is not a multiple of y.
            System.out.printf("%d is NOT a multiple of %d%n", x, y);
        }
    }
}