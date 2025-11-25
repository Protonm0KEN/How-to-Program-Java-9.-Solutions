package Exercise2_32; //package declaration of package Exercise2_31

import java.util.Scanner; //importing the Scanner class to read user input

//This application reads five integers from the user and counts how many are positive, how many are negative, and how many are zero.

//class declaration of class Main
public class Main { //Beginning of class Main body
    // Method main definition (Note: The standard signature required by the JVM is 'public static void main(String[] args)')
    static void main() { //beginning of method main body
        //Declaring and initializing a Scanner object named 'input' to obtain user input from the keyboard
        Scanner input = new Scanner(System.in);

        //Declaring and initializing counter variables for each category
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        //Declaring a variable to temporarily store the integer input
        int number;

        // --- Input 1 ---
        System.out.print("Enter number: ");
        //Reading the first integer
        number = input.nextInt();
        //Checking if the number is negative and incrementing the count
        if(number < 0)
            negativeCount += 1;
        //Checking if the number is positive and incrementing the count
        if(number > 0)
            positiveCount += 1;
        //Checking if the number is zero and incrementing the count
        if(number == 0)
            zeroCount += 1;

        // --- Input 2 ---
        System.out.print("Enter number: ");
        //Reading the second integer
        number = input.nextInt();
        //Checking and counting
        if(number < 0)
            negativeCount += 1;
        if(number > 0)
            positiveCount += 1;
        if(number == 0)
            zeroCount += 1;

        // --- Input 3 ---
        System.out.print("Enter number: ");
        //Reading the third integer
        number = input.nextInt();
        //Checking and counting
        if(number < 0)
            negativeCount += 1;
        if(number > 0)
            positiveCount += 1;
        if(number == 0)
            zeroCount += 1;

        // --- Input 4 ---
        System.out.print("Enter number: ");
        //Reading the fourth integer
        number = input.nextInt();
        //Checking and counting
        if(number < 0)
            negativeCount += 1;
        if(number > 0)
            positiveCount += 1;
        if(number == 0)
            zeroCount += 1;

        // --- Input 5 ---
        System.out.print("Enter number: ");
        //Reading the fifth integer
        number = input.nextInt();
        //Checking and counting
        if(number < 0)
            negativeCount += 1;
        if(number > 0)
            positiveCount += 1;
        if(number == 0)
            zeroCount += 1;


        //Displaying the final counts
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

    } //end of method main body
} //end of class Main body