package Exercise6_26;

import java.util.Scanner;
/*
* Problem statement:
*  Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367.
* Incorporate the method into an application that reads a value from the user and displays the result.
*
* This is a driver class that helps for the user to read value from the CLI and to display the reversed number
*
* */
public class ReversingDigitsTest {
    static void main() {
        //To obtain the user's input. The object of class Scanner and as a readable source standard input object System.in
        Scanner input = new Scanner(System.in);

        //Prompting user to enter the grade
        System.out.print("Enter please the number to display its reverse: ");

        int number = input.nextInt();//Storing the value obtained

        System.out.println("Reversed number is: " + ReversingDigits.getReverse(number));

    }
}
