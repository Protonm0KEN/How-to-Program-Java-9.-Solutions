package Exercise4_23;

import java.util.Scanner;
/*
* (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]*/
//public class declaration with the same file name
public class FindTwoLargestNumbers { //Beginning of class FindTwoLargestNumbers body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window
        Scanner input = new Scanner(System.in);

        //Variable to store the current integer provided by the user
        int number = 0;

        //Variable to keep track of the number of inputs processed (loop control)
        int counter = 0;

        //Initializing both variables to the lowest possible integer value to handle any input range
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //Beginning of while loop to collect and process exactly 10 integers
        while (counter < 10) {
            //Prompting the user for input and displaying the current count
            System.out.printf("Enter integer #%d: ", (counter + 1));
            number = input.nextInt(); //Retrieving the integer from the keyboard

            //Decision structure: Determine if the new number is the highest found so far
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            }

            else if (number > secondLargest) {
                secondLargest = number;
            }

            //Incrementing the counter to move toward the loop termination condition
            counter++;
        } //End of while loop

        //Displaying the final results for the two highest values discovered during the session
        System.out.println("\n----------------RESULTS----------------");
        System.out.println("First largest: " + firstLargest);
        System.out.println("Second largest: " + secondLargest);

        //Closing the Scanner to release system resources
        input.close();

    } //End of method main body
} //End of class FindTwoLargestNumbers body