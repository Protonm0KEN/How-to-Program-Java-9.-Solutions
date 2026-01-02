package Exercise4_21;

import java.util.Scanner;
/*
* The process of finding the largest value is used frequently in computer applications. For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.*/
//public class declaration with the same file name
public class FindTheLargestNumber { //Beginning of class FindTheLargestNumber body

    //Starting point of the Java application. JVM executes this method to run Java application
    //Added 'public' and 'String[] args' for proper execution
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window
        Scanner input = new Scanner(System.in);

        //Variable to keep track of the number of inputs processed
        int counter = 0;

        //Variable to store the current integer provided by the user
        int number = 0;

        int largest = Integer.MIN_VALUE;

        //Beginning of while loop to prompt the user for exactly 10 integers
        while (counter < 10) {
            //Prompting user for input based on the current iteration count
            System.out.printf("Enter integer #%d: ", (counter + 1));

            //Retrieving the integer from the keyboard
            number = input.nextInt();

            //Decision structure: If the current number is greater than the current maximum
            if (number > largest) {
                //Update the 'largest' variable with the new maximum value
                largest = number;
            }

            //Incrementing the counter to move toward the loop termination condition
            counter++;
        } //End of while loop

        //Displaying the final result after all 10 numbers have been processed
        System.out.println("\n----------------RESULTS----------------");
        System.out.println("The largest number entered was: " + largest);

        //Closing the Scanner to release system resources
        input.close();

    } //End of method main body
} //End of class FindTheLargestNumber body