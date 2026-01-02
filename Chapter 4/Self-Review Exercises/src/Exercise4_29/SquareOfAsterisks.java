package Exercise4_29;

import java.util.Scanner;
/*
* (Square of Asterisks) Write an application that prompts the user to enter the size of the side
of a square, then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20.*/
//public class declaration with the same file name
public class SquareOfAsterisks { //Beginning of class SquareOfAsterisks body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Declaring and initializing variable n to store the length of the square's side
        int n = 0;

        //Scanner object input to obtain user's input from the command line window
        Scanner input = new Scanner(System.in);

        //Prompting the user to enter the integer value for the side of the square
        System.out.println("Enter the side of a square: ");
        n = input.nextInt(); //Retrieving the side length from the keyboard

        //Variable to keep track of the current row being processed in the loop
        int counter = 1;

        //Beginning of while loop to iterate through each row of the square until n is reached
        while(counter <= n) {

            //Decision structure: Determining if the current row is the top boundary (first row)
            if(counter == 1) {
                //Initializing a counter for the horizontal top side asterisks
                int topSideCounter = 0;
                //Nested while loop to print a solid line of asterisks for the top side
                while(topSideCounter < n) {
                    System.out.print("*");
                    topSideCounter++; //Incrementing the horizontal counter
                }
                System.out.println(); //Moving to a new line after completing the top boundary
            }
            //Decision structure: Determining if the current row is the bottom boundary (last row)
            else if(counter == n) {
                //Initializing a counter for the horizontal bottom side asterisks
                int bottomSideCounter = 0;
                //Nested while loop to print a solid line of asterisks for the bottom side
                while(bottomSideCounter < n) {
                    System.out.print("*");
                    bottomSideCounter++; //Incrementing the horizontal counter
                }
                System.out.println(); //Moving to a new line after completing the bottom boundary
            }
            //Decision structure: Logic for processing the internal (hollow) rows
            else {
                //Initializing a counter for the spacing within the hollow rows
                int internalCounter = 1;

                //Printing the leftmost vertical boundary asterisk
                System.out.print("*");

                //Nested while loop to print the internal spaces between the vertical boundaries
                while(internalCounter <= n) {
                    System.out.print(" ");
                    internalCounter++; //Incrementing the space counter
                }

                //Printing the rightmost vertical boundary asterisk
                System.out.print("*");
                System.out.println(); //Moving to a new line after completing the hollow row
            }

            //Incrementing the main row counter to process the next line of the square
            counter++;

        } //End of while loop body

    } //End of method main body
} //End of class SquareOfAsterisks body