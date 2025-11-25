package CarPoolSavingsCalculator_Exercise2_35; // Package declaration for organizing the class file

import java.util.Scanner; // Import the Scanner class, necessary for reading user input from the console

// Class declaration for the Main application
public class Main { // Start of the Main class body

    // Main method: The essential starting point for the Java application execution
    public static void main(String[] args) { // Start of the main method body

        // Declare double variables to hold input values. Using double allows for accurate
        // calculations involving currency (cost) and averages (MPG), which typically involve decimals.
        double totalMiles;          // Represents the total distance traveled daily (e.g., round trip to work)
        double costPerGallon;       // Represents the price of fuel per single gallon
        double avgMilesPerGallon;   // Represents the vehicle's fuel efficiency (miles per gallon)
        double parkingFeesPerDay;   // Represents fixed parking charges incurred daily
        double tollsPerDay;         // Represents fixed road usage fees (tolls) incurred daily

        // Create a Scanner object named 'input' to facilitate reading data provided by the user via System.in (console)
        Scanner input = new Scanner(System.in);


        // Display a title to introduce the program to the user
        System.out.println("--- Carpool Savings Calculator ---");



        // Prompt the user for the daily mileage
        System.out.print("Enter total miles driven per day: ");
        totalMiles = input.nextDouble(); // Read the floating-point value entered by the user for miles

        // Prompt the user for the fuel cost
        System.out.print("Enter cost per gallon of gasoline: ");
        costPerGallon = input.nextDouble(); // Read the floating-point value entered by the user for gas cost

        // Prompt the user for the car's fuel efficiency
        System.out.print("Enter average miles per gallon (MPG): ");
        avgMilesPerGallon = input.nextDouble(); // Read the floating-point value entered by the user for MPG

        // Prompt the user for parking fees
        System.out.print("Enter parking fees per day: ");
        parkingFeesPerDay = input.nextDouble(); // Read the floating-point value entered by the user for parking

        // Prompt the user for tolls
        System.out.print("Enter tolls per day: ");
        tollsPerDay = input.nextDouble(); // Read the floating-point value entered by the user for tolls


        /*
         * Calculate the total daily cost of driving alone.
         * The calculation is broken down into two components:
         * 1. Fuel Cost: (totalMiles / avgMilesPerGallon) calculates the total gallons consumed.
         * This result is then multiplied by costPerGallon to get the daily fuel expense.
         * 2. Fixed Fees: parkingFeesPerDay + tollsPerDay
         */
        double totalCost =  (totalMiles / avgMilesPerGallon) * costPerGallon + // Calculate fuel cost (gallons used * price per gallon)
                parkingFeesPerDay + // Add daily parking fees
                tollsPerDay; // Add daily toll fees. The sum is the total daily driving cost.


        // Display the calculated total cost, using printf to format the output to two decimal places (currency standard)
        System.out.printf("%nTotal cost per day of driving to work: $%.2f%n", totalCost);

        // Optional/Bonus calculation: Demonstrate the potential savings if the cost were shared equally with one other person (50% savings)
        System.out.println("If you carpool with one person, your savings are: $" +
                String.format("%.2f", totalCost / 2)); // Use String.format for precise currency output formatting
    } // End of the main method body
} // End of the Main class body