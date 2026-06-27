
//Class Withdrawal which represents an ATM withdrawal type of transaction
public class Withdrawal extends Transaction {

    //2. Declare all instance variables
    private int amount;

    //3. Declare references to other objects depending on association class diagram
    private CashDispenser cashDispenser;
    private Keypad keypad;

    private final static int CANCELED = 6;


    //1. Declare empty no-arg constructor ( Reminder to customize the constructor )
    public Withdrawal( int accountNumber, BankDatabase bankDatabase, Screen screen, CashDispenser cashDispenser, Keypad keypad ) {
        super(accountNumber, bankDatabase, screen);

        this.keypad = keypad;
        this.cashDispenser = cashDispenser;
    }


    //4. Declare all shells of class operations ( methods )

    //We override method execute, since Withdrawal is a concrete class
    @Override
    public void execute() {
        boolean cashDispensed = false;
        double availableBalance;

        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        do{
            amount = displayMenuOfAmounts();

            if( amount != CANCELED ){
                availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() );

                if( amount <= availableBalance ) {
                    if( cashDispenser.isSufficientCashAvailable( amount ) ){
                        bankDatabase.debit( getAccountNumber(), amount );

                        cashDispenser.dispenseCash( amount );
                        cashDispensed = true;

                        screen.displayMessageLine( "\nYour cash has been dispensed. Please take your cash now");

                    }else{
                        screen.displayMessageLine( "\nInsufficient cash available in the ATM. \n\nPlease choose a smaller amount" );
                    }
                }else{
                    screen.displayMessageLine( "\nInsufficient funds in you account. \n\nPlease choose a smaller amount.");
                }
            }else{
                screen.displayMessageLine( "\nCancelling transaction..." );
                return;
            }
        } while (!cashDispensed);
    }

    private int displayMenuOfAmounts(){
        int userChoice = 0;
        Screen screen = getScreen();

        int[] amounts = {0,20,40,60,100, 200};

        while(userChoice == 0){
            screen.displayMessageLine( "\nWithdrawal Menu: ");
            screen.displayMessageLine( "1 - $20" );
            screen.displayMessageLine( "2 - $40" );
            screen.displayMessageLine( "3 - $60" );
            screen.displayMessageLine( "4 - $100" );
            screen.displayMessageLine( "5 - $200" );
            screen.displayMessageLine( "6 - Cancel transaction" );
            screen.displayMessage( "\nChoose a withdrawal amount: " );

            int input = keypad.getInput();

            switch (input){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    userChoice = amounts[input];
                    break;
                case CANCELED:
                    userChoice = CANCELED;
                    break;
                default:
                    screen.displayMessageLine( "\nInvalid selection. Try again.");
            }
        }
        return userChoice;
    }

}

