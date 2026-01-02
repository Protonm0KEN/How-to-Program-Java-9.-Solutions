package Exercise4_31;

import java.util.Scanner;
/*
* Write an application that inputs an
integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use
the remainder and division operators to pick off the binary number’s digits one at a time, from right
to left. In the decimal number system, the rightmost digit has a positional value of 1 and the next
digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal number 234
can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number system, the rightmost digit has
a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]*/
//public class declaration with the same file name
public class PrintingDecimalEquivalentOfBinary { //Beginning of class PrintingDecimalEquivalentOfBinary body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window. Readable source: Standard input object
        Scanner input = new Scanner(System.in);

        //Prompting the user to enter a binary number (consisting of 0s and 1s)
        System.out.print("Enter the binary number: ");

        //Retrieving the input as an integer to process digits using mathematical operations
        int numberInBinary = input.nextInt();

        //Initializing the accumulator for the decimal result and the positional exponent tracker
        int numberInDecimal = 0; //Variable to store the final decimal equivalent
        int pos = 0; //Variable to track the current power of 2 (positional weight)



        //Beginning of while loop to process each digit of the binary number until all digits are extracted
        while(numberInBinary != 0) {
            if(numberInBinary % 10 == 1) {
                numberInDecimal += (int) (Math.pow(2, pos));
            }
            numberInBinary /= 10;

            //Incrementing the position counter to represent the next power of 2 (2^1, 2^2, etc.)
            pos++;

        } //End of while loop body

        //Displaying the final decimal conversion result to the console
        System.out.println("The number in decimal is: " + numberInDecimal);

        //Closing the Scanner to release system resources
        input.close();

    } //End of method main body
} //End of class PrintingDecimalEquivalentOfBinary body