

public abstract class Transaction {
    //2. Declare all instance variables
    private int accountNumber;
    //3. Declare all references from class diagram
    private BankDatabase bankDatabase;
    private Screen screen;


    //1. Declare no-arg constructor

    public Transaction( int accountNumber, BankDatabase bankDatabase, Screen screen ) {
        this.accountNumber = accountNumber;
        this.bankDatabase = bankDatabase;
        this.screen = screen;
    }


    //4. Declare all class operations ( methods )

    //Getting private instance (primitive)variable values
    public int getAccountNumber() {
        return this.accountNumber;
    }
    //Getting references (instance reference variables)
    public Screen getScreen() {
        return screen;
    }
    public BankDatabase getBankDatabase() {
        return bankDatabase;
    }

    //Declaring abstract methods, since Transaction is abstract class
    public abstract void execute();
}
