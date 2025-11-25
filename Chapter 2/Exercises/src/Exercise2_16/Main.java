package Exercise2_16; //package declaration of package Exercise2_16

//Comparing Integers
//This application prompts the user for two integers, reads them, and displays a comparison result.

import java.util.*; //importing all classes from the java.util package

/*
* Write an application that asks the user to enter two integers, obtains
them from the user and displays the larger number followed by the words "is larger". If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
* */
//class declaration of class Main
public class Main { //Beginning of class Main body
    static void main() { //beginning of method main body (Note: The standard signature is public static void main(String[] args))
        //Declaring and initializing to System.in readable source Scanner object "input" to obtain user's input from keyboard
        Scanner input = new Scanner(System.in);

        //Declaring variables with names x and y to store user's input
        int x; //Variable x with type int and variable name ( valid identifier ) x
        int y; //Variable y with type int and variable name ( valid identifier ) y


        //Prompting user to enter first integer
        System.out.print("Enter please first integer: ");

        //Obtaining user's input for first integer
        x = input.nextInt(); //Storing the user's input integer to variable x

        //Prompting user to enter second integer
        System.out.print("Enter please second integer: ");

        //Obtaining user's input for second integer
        y = input.nextInt(); //Storing the user's input integer to variable y

        //Checking if x is greater than y
        if(x > y)
            //If x is larger, display the result using printf. (Note: The problem asks for "%d is larger")
            System.out.printf("%d is larger than %d", x, y);

        //Checking if y is greater than x
        if (y > x)
            //If y is larger, display the result using printf. (Note: The problem asks for "%d is larger")
            System.out.printf("%d is larger than %d", y, x);

        //Checking if x is equal to y
        if (x == y)
            //If numbers are equal, display the result using printf. (Note: The problem asks for "These numbers are equal")
            System.out.printf("%d is equal to %d", x, x);
    } //end of method main body
} //end of class Main body