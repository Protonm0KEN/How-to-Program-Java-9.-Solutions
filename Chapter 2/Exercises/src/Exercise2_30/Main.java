package Exercise2_30; //package declaration of package Exercise2_30

/*
Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
Assume that the user enters the correct number of digits. What happens when you execute the
program and type a number with more than five digits? What happens when you execute the program and type a number with fewer than five digits? [Hint: It’s possible to do this exercise with the
techniques you learned in this chapter. You’ll need to use both division and remainder operations
to “pick off ” each digit.]
* */

import java.util.Scanner; //importing the Scanner class to read user input

//class declaration of class Main
public class Main { //Beginning of class Main body
    // Method main definition
    static void main(String[] args) { //beginning of method main body
        //Declaring an integer variable to store the user's five-digit number
        int number;

        //Declaring and initializing a Scanner object named 'input' to obtain user input from the keyboard
        Scanner input = new Scanner(System.in);
        //Prompting user to enter the five-digit number
        System.out.println("Enter the number consisting of 5 digits");
        //Obtaining user's input and storing it in variable number
        number = input.nextInt();

        //Extracting and displaying the first digit (the units digit, as it uses modulo 10)
        //Note: This process extracts the digits in reverse order (units first, then tens, etc.)
        System.out.printf("%d ", number % 10);
        //Removing the units digit by performing integer division by 10
        number /= 10;

        //Extracting and displaying the second digit (the tens digit)
        System.out.printf("%d ", number % 10);
        number /= 10;

        //Extracting and displaying the third digit (the hundreds digit)
        System.out.printf("%d ", number % 10);
        number /= 10;

        //Extracting and displaying the fourth digit (the thousands digit)
        System.out.printf("%d ", number % 10);
        number /= 10;

        //Extracting and displaying the fifth digit (the ten thousands digit)
        System.out.printf("%d ", number % 10);
        //Removing the last digit (leaving number = 0 if input was exactly five digits)
        number /= 10;
    } //end of method main body
} //end of class Main body