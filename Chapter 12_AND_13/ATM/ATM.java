public class ATM {
    //2. Declare all instance variables and references to objects in class diagram
    private boolean isUserAuthenticated;
    private int currentAccountNumber;

    private BankDatabase bankDatabase;
    private Transaction transaction;
    private Screen screen;
    private CashDispenser cashDispenser;
    private Keypad keypad;
    private DepositSlot depositSlot;

    //constants for main menu options
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;


    //1. Declare no-arg constructor
    public ATM() {
        this.isUserAuthenticated = false; // Initially user isn't authenticated
        currentAccountNumber = 0; // Since we still are not authenticated, thus don't have real account number
        screen = new Screen(); //create a screen
        keypad = new Keypad(); //create a keypad
        cashDispenser = new CashDispenser(); //create a cash dispenser
        depositSlot = new DepositSlot(); //create a deposit slot
        bankDatabase = new BankDatabase(); //create accounts database
    }

    //3. Declare class operations
    public void run() {
        while ( true ) {
            while ( !this.isUserAuthenticated ) {
                screen.displayMessageLine( "\nWelcome!" );
                authenticateUser();
            }

            performTransactions();
            this.isUserAuthenticated = false;
            currentAccountNumber = 0;
            screen.displayMessageLine( "\nThank you! Goodbye!" );
        }
    }

    private void authenticateUser() {
        screen.displayMessage( "\nPlease enter you account number" );
        int accountNumber = keypad.getInput();
        screen.displayMessage( "\nEnter your PIN: " );
        int pin = keypad.getInput();

        isUserAuthenticated = bankDatabase.authenticateUser( accountNumber, pin );

        if( isUserAuthenticated ) {
            currentAccountNumber = accountNumber;
        }else{
            screen.displayMessageLine( "Invalid account number or PIN. PLease try again" );
        }
    }

    private void performTransactions() {
        Transaction currentTransaction = null;
        boolean userExited = false;

        while ( !userExited ) {
            int mainMenuSelection = displayMainMenu();

            switch ( mainMenuSelection ) {
                case BALANCE_INQUIRY:
                case WITHDRAWAL:
                case DEPOSIT:
                    currentTransaction = createTransaction( mainMenuSelection );

                    currentTransaction.execute();
                    break;
                case EXIT:
                    screen.displayMessageLine( "\nExiting the system..." );
                    userExited = true;
                    break;
                default:
                    screen.displayMessageLine( "\nYou did not enter a valid selection. Try again." );
                    break;
            }
        }
    }
    private Transaction createTransaction( int transactionType ) {
        Transaction temp = null;
        switch ( transactionType ) {
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry( currentAccountNumber, bankDatabase, screen );
                break;
            case WITHDRAWAL:
                temp = new Withdrawal( currentAccountNumber, bankDatabase, screen, cashDispenser, keypad );
                break;
            case DEPOSIT:
                temp = new Deposit( currentAccountNumber, screen, bankDatabase, keypad, depositSlot );
                break;
        }
        return temp;
    }

    private int displayMainMenu() {
        screen.displayMessageLine( "\nMain menu: ");
        screen.displayMessageLine( "1 - View my balance" );
        screen.displayMessageLine( "2 - Withdraw cash" );
        screen.displayMessageLine( "3- Deposit funds" );
        screen.displayMessageLine( "4 - Exit" );
        screen.displayMessageLine( "Enter a choice: " );
        return keypad.getInput();
    }
}
