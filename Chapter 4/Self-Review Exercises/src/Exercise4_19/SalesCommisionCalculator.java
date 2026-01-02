package Exercise4_19;

import java.util.Scanner;
/*
*
* A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/
//public class declaration with the same file name
public class SalesCommisionCalculator { //Beginning of class SalesCommisionCalculator body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window. Readable source: Standard input object
        Scanner input = new Scanner(System.in);

        //Declaring and initializing double variables to handle financial calculations with decimal precision
        double earnings = 0; //Variable to store the final calculated weekly earnings
        double itemPrice = 0; //Variable to hold the price of the current item being entered
        double totalSales = 0; //Accumulator variable to store the sum of all valid item prices

        //Variable to keep track of the number of items entered for user-friendly prompting
        int itemsCounter = 1;

        //Beginning of do-while loop to process item entries until a negative sentinel value is detected
        do {
            //Prompting the user to enter the price of a specific item number
            System.out.printf("Enter the price of item #%d (or any negative number to stop): ", itemsCounter);

            //Retrieving the price as a double to allow for cents/decimal values
            itemPrice = input.nextDouble();

            //Logic check: If the entered price is non-negative, add it to the running total
            if (itemPrice >= 0) {
                totalSales += itemPrice; //Adding the current item price to the total sales accumulator
                itemsCounter++; //Incrementing the item count only after a successful valid entry
            }

        } while (itemPrice >= 0); //Sentinel control: loop continues as long as the user provides positive prices

        //Calculating the total earnings based on the formula: $200 base pay plus 9% of total gross sales
        earnings = 200 + (totalSales * 0.09);

        //Displaying the final financial results to the user
        System.out.println("\n----------------SALES SUMMARY----------------");
        System.out.printf("Total Gross Sales: $%.2f%n", totalSales);
        System.out.printf("Total Weekly Earnings: $%.2f%n", earnings);

        //Closing the Scanner object to release system resources
        input.close();

    } //End of method main body
} //End of class SalesCommisionCalculator body