package Exercise2_3;
import java.util.Scanner;

//class declaration statement
class Main{    //Begining of class Main body

    //declaration of method main iwth String[] args as an argument. This is a starting point of java application
    public static void main(String[] args){ //Beginning of main method body
        // (a) Declare variables c, thisIsAVariable, q76354, number to be a type of int

        //The variable declaration statements are on separate lines to enhance readability
        int c; //Declaring a variable with type int, and variable name as identifier "c"
        int thisIsAVariable; //Declaring a variable with type int, and variable name as identifier "thisIsAVariable"
        int q76354; //Declaring a variable with type int, and variable name as identifier "q76354"
        int number; //Declaring a variable with type int, and variable name as identifier "number"


        // (b) Prompt the user to enter an integer

        //Prompt - is a statement that urges user to perform a specific action

        //Calling the method System.out.print() to prompt the user and perform task of showing a message of the prompt
        System.out.print("Enter the integer please ( prompt ): "); //System.out.print puts the output cursor immediately after the white space character in argument of print()

        // (c) Input an integer and assign the result to int variable "value". Assume Scanner variable input can be used to read value from the keyboard

        //Declaring variable input that is object of class Scanner from java.util
        Scanner input = new Scanner(System.in); //Initializing variable input and setting the source of reading as System.in to take the input from typing on keyboard by user

        //* Cursor is still of last character of print statement by the way

        //Declaring variable "value" to store the value typed by user in command line ( command window, shell, terminal ) and initializing it as input.nextInt() to get integer value typed from user
        int value = input.nextInt();

        // (d) Print "This is a Java Program" on one line in the command window. Use method System.out.println()

        //Calling the method System.out.println() to show the user the message specified in arguments of the method
        System.out.println("This is a Java Program");

        // (e)  Print "This is a Java program" on two lines in the command window. The first line should end with Java. Use method System.out.println.

        //Calling the method System.out.println() to show the user the message specified in arguments of the method
        System.out.println("This is a Java\n Program"); //Added new line character to put output cursor on new line and print " Program" on new line

        // (f) Print "This is a Java program" on two lines in the command window. The first line should end with Java. Use method System.out.printf and two %s format specifiers.

        //Calling the method System.out.printf() to show the user the message specified in arguments of the method
        System.out.printf("%s\n%s", "This is a Java", " Program");

        // (g)  If the variable number is not equal to 7, display "The variable number is not equal to 7".


        //To escape the error that number might not have been initialized, i would initialize it to 6
        number = 6;
        if(number != 7)
            System.out.println("The variable number is not equal to 7");

    } //End of main method body
    //end of main method declaration

}//end of class Main declaration