package Exercise3_12; // Package declaration for organizing this class file

// Declaring driver class AccountTest that executes and showcases capabilities of Account class
public class AccountTest {// Beginning of class AccountTest body


    // Special method: main. JVM calls this method for Java application to be executed
    // Correcting signature to standard public static void main(String[] args)
    public static void main(String[] args) {// Beginning of method main body

        // Declaring 2 Account objects and initializing them with initial balances
        // account1 is initialized with a valid positive balance
        Account account1 = new Account(50.00);
        // account2 is initialized with a negative balance, testing the constructor's validation logic (should result in 0.0)
        Account account2 = new Account(-7.53);


        // Displaying user balances before operations, formatted to two decimal places for currency
        System.out.printf("account 1 balance: $%.2f\n", account1.getBalance());
        // Displaying the balance of account2 (which will be $0.00 due to negative initial balance)
        System.out.printf("account 2 balance: $%.2f\n", account2.getBalance());


        // Fully qualified class name to declare and initialize Scanner object for console input
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Declaring depositAmount variable (local variable) to temporarily store the amount to deposit
        double depositAmount;

        System.out.print("Enter deposit amount for account1: ");// Prompting user to enter deposit amount
        depositAmount = input.nextDouble();// Obtaining input (double) from the user and storing it in depositAmount

        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);// Displaying user that this amount will be added to account1 balance
        account1.credit(depositAmount);// Calling method credit on account1 and passing depositAmount to arguments

        // Displaying account1 and account2 balances after depositing money to account1
        System.out.printf( "account1 balance: $%.2f \n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f \n\n", account2.getBalance() );


        System.out.print( "Enter deposit amount for account2: " ); // Prompting user to enter deposit amount for the second account
        depositAmount = input.nextDouble();// Obtaining input (double) from the user and storing it in depositAmount
        System.out.printf( "\nadding %.2f to account2 balance\n\n", depositAmount ); // Displaying user that this amount will be added to account2 balance
        account2.credit( depositAmount ); // Calling method credit on account2 and passing depositAmount as the argument

        // Displaying account1 and account2 balances after depositing money to account2
        System.out.printf( "account1 balance: $%.2f \n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f \n", account2.getBalance() );

        // Declaring debitAmount variable (local variable to method main) to temporarily store the amount to withdraw
        double debitAmount;

        System.out.print("\nEnter debit amount from account1: "); // Prompting user to enter debit amount
        debitAmount = input.nextDouble();// Obtaining input (double) from the user and storing it to debitAmount
        System.out.printf("\nwithdrawing %.2f from account1 balance\n\n", debitAmount);// Displaying user that this amount will be subtracted from account1 balance
        account1.debit(debitAmount); // Calling method debit on account1; this triggers the balance check logic

        System.out.printf( "account1 balance: $%.2f  \n", account1.getBalance() );// Displaying account1 final balance after the debit attempt

        // Close the Scanner object to release system resources
        input.close();

    }//End of main method body
}//End of class AccountTest body