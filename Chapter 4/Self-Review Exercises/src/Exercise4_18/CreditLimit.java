package Exercise4_18;

import java.util.Scanner;
/*
* ) Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".*/
//public class declaration with the same file name
public class CreditLimit { //Beginning of class CreditLimit body

    //Starting point of the Java application. JVM executes this method to run Java application
    //Added 'public' modifier to ensure the method is accessible by the JVM
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window. Readable source: Standard input object
        Scanner input = new Scanner(System.in);

        //Declaring and initializing integer variables to store account-specific financial data
        int accountNumber = 0; //Variable to hold the unique account identifier
        int initialBalance = 0; //Variable to store the balance at the beginning of the month

        int itemsTotal = 0; //Variable to store the total cost of all items charged by the customer this month
        int creditsTotal = 0; //Variable to store the total of all credits applied to the customer's account this month

        int creditLimit = 0; //Variable to store the allowed credit limit for the specific account

        //Declaring a String to accumulate and store the formatted information for all processed clients
        String totalInformationAboutClients = "";

        //Beginning of do-while loop to process at least one client and continue until a sentinel value is entered
        do {
            //Declaring and initializing a new String object to hold data for the current iteration's client
            String informationAboutThisClient = new String();

            //Prompting user to enter the account number to begin data entry or exit the loop
            System.out.print("Enter the account number (any negative number to exit): ");
            accountNumber = input.nextInt(); //Retrieving account number from the keyboard

            //Logic check: If the account number is non-negative, proceed with data collection and calculations
            if(accountNumber >= 0) {
                //Concatenating information about account number to information string about the account
                informationAboutThisClient += String.format("Account number: %d", accountNumber);

                //Prompting the user to enter the initial balance of the account
                System.out.print("\nEnter the initial balance: ");
                initialBalance = input.nextInt(); //Retrieving initial balance from the keyboard

                //Concatenating information about initial balance to information string about the account
                informationAboutThisClient += String.format("\nInitial balance: %d", initialBalance);

                //Prompting the user to enter the total of items (sum of all items bought) of the account
                System.out.print("\nEnter the items total: ");
                itemsTotal = input.nextInt(); //Retrieving items total from the keyboard

                //Concatenating information about items total to information string about the account
                informationAboutThisClient += String.format("\nItems total: %d", itemsTotal);

                //Prompting the user to enter the credits of the account
                System.out.print("\nEnter the credits total: ");
                creditsTotal = input.nextInt(); //Retrieving credits total from the keyboard

                //Concatenating information about credits total to information string about the account
                informationAboutThisClient += String.format("\nCredits total: %d", creditsTotal);

                //Prompting the user to enter the total of credit limit of the account
                System.out.print("\nEnter the credit limit: ");
                creditLimit = input.nextInt(); //Retrieving credit limit from the keyboard

                //Concatenating information about credit limit to information string about the account
                informationAboutThisClient += String.format("\nCredit limit: %d", creditLimit);

                //Calculating the user's new balance using the formula: new balance = beginning balance + charges - credits
                int newBalance = initialBalance + itemsTotal - creditsTotal;

                //Concatenating the calculated new balance result to the individual client information string
                informationAboutThisClient += "\nNew Balance: " + newBalance;

                //Decision structure: Determining if the new balance exceeds the predefined credit limit
                if(newBalance > creditLimit) {
                    //Appending a warning message if the calculated balance is greater than the allowed limit
                    informationAboutThisClient += "\nCredit limit exceeded!";
                }

                //Appending the completed individual client report to the master string and adding a newline for separation
                totalInformationAboutClients += informationAboutThisClient + "\n\n";
            } //End of if-condition for valid account number

        } while(accountNumber >= 0); //Sentinel control: If accountNumber < 0, the loop condition becomes false and terminates

        //Displaying total accumulated information for all clients processed during the session
        System.out.println("\n----------------TOTAL INFORMATION ABOUT CLIENTS----------------");
        System.out.println(totalInformationAboutClients);

        //Closing the Scanner object to release system resources
        input.close();
    } //End of method main body
} //End of class CreditLimit body