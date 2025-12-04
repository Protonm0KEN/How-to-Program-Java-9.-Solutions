package TargetHeartRateCalculatorExercise3_16; // Package declaration for the test application

import Exercise3_15.Date; // Importing the Date class from Exercise 3.15
import java.util.Scanner; // Importing the Scanner class for obtaining user input from the console

// Driver class that executes and showcases capabilities of HeartRates class
public class HeartRatesTest { // Beginning of class HeartRatesTest body

    // Special method: main. JVM uses this method to execute Java application. ( Starting point of every Java application )
    public static void main(String[] args) { // Corrected main method signature. Beginning of method main body

        // Fully qualified class name to declare and initialize Scanner object for console input
        Scanner input = new Scanner(System.in);

        // Declaring local variables to store personal information input by the user
        String personFirstName;
        String personLastName;

        // Declaring the Date object variable for the person's birth date
        Date personBirthDate;

        // Declaring local variables to store the components of the date of birth
        int personBirthDay;
        int personBirthMonth;
        int personBirthYear;

        System.out.println("Hello in Heart Rates application!");

        // --- Input Collection ---

        System.out.print("\nEnter your first name: "); // Prompting user for first name
        personFirstName = input.nextLine(); // Obtaining string input from the user

        System.out.print("\nEnter your last name: "); // Prompting user for last name
        personLastName = input.nextLine(); // Obtaining string input from the user

        // Prompting and obtaining the date components
        System.out.print("\nEnter your birth month (1-12): ");
        personBirthMonth = input.nextInt(); // Obtaining integer input for month

        System.out.print("\nEnter your birth day: ");
        personBirthDay = input.nextInt(); // Obtaining integer input for day

        System.out.print("\nEnter your birth year (YYYY): ");
        personBirthYear = input.nextInt(); // Obtaining integer input for year

        // Closing the Scanner resource
        input.close();

        // --- Object Instantiation ---

        // Creating a new Date object using the collected components
        personBirthDate = new Date(personBirthDay, personBirthMonth, personBirthYear);

        // Creating and initializing object of class HeartRates using the constructor
        // that accepts first name, last name, and a Date object
        HeartRates heartRates = new HeartRates(personFirstName, personLastName, personBirthDate);

        // --- Output ---

        // Calling method displayInfo to calculate and print all stored and calculated information
        System.out.println(); // Print newline for formatting
        heartRates.displayInfo();

    } // End of main method body
} // End of class HeartRatesTest body