package Exercise2_25; //package declaration of package Exercise2_25

import java.util.Scanner; //importing the Scanner class to read user input

/*
 * Write an application that reads an integer and determines and prints whether it’s odd or even.
 * [Hint: Use the remainder operator.
 * An even number is a multiple of 2.
 * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 * */

//Odd or even
//This application prompts the user for a single integer and prints whether the number is odd or even.

//class declaration of class Main
public class Main { //Beginning of class Main body
    // Method main definition (Note: The standard signature required by the JVM is 'public static void main(String[] args)')
    static void main() { //beginning of method main body
        //Declaring and initializing a Scanner object named 'input' to obtain user input from the keyboard
        Scanner input = new Scanner(System.in);

        //Declaring an integer variable to store the user's input value
        int x;

        //Prompting user to enter the number
        System.out.print("Enter the number: ");
        //Obtaining user's input and storing it in variable x
        x = input.nextInt();

        //Checking if the remainder of x divided by 2 is equal to 0 (i.e., if x is an even number)
        if(x % 2 == 0)
            //If the remainder is 0, the number is even
            System.out.println("It is an even number");

        //Checking if the remainder of x divided by 2 is NOT equal to 0 (i.e., if x is an odd number)
        //This second check is guaranteed to be true if the first check was false.
        if(x % 2 != 0)
            //If the remainder is not 0 (it must be 1), the number is odd
            System.out.println("It is an odd number");

    } //end of method main body
} //end of class Main body