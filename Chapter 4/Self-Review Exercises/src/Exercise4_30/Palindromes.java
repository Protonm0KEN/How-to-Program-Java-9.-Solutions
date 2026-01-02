package Exercise4_30;

import java.util.Scanner;
/*
*  A palindrome is a sequence of characters that reads the same backward as forward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits long, display an error message and allow the user to enter
a new value*/
//public class declaration with the same file name
public class Palindromes { //Beginning of class Palindromes body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window. Readable source: Standard input object
        Scanner input = new Scanner(System.in);

        //Prompting the user to enter a sequence of digits or a number for validation
        System.out.print("Enter please the number to check for the palindrome: ");

        //Retrieving the input as a String to easily access individual digit positions via index
        String numberStr = input.nextLine();

        //Initializing a pointer variable to track the current character position from the start of the string
        int pos = 0;



        //Beginning of while loop to iterate through the first half of the string
        //Logic: If the first half matches the mirrored second half, the sequence is a palindrome
        while(pos <= numberStr.length() / 2) {

            //Decision structure: Comparing the character at the current 'pos' with its mirrored counterpart at the end
            if(numberStr.charAt(pos) != numberStr.charAt(numberStr.length() - pos - 1)) {

                //Displaying result if a mismatch is found, indicating the number is not a palindrome
                System.out.printf("\nNumber %s is not a palindrome", numberStr);

                //Terminating the method execution immediately as the palindrome condition has failed
                return;
            }

            //Incrementing the position pointer to move toward the center of the string
            pos++;

        } //End of while loop body

        //Displaying final result if the loop completes without finding any mismatched characters
        System.out.printf("\nNumber %s is a palindrome", numberStr);

    } //End of method main body
} //End of class Palindromes body