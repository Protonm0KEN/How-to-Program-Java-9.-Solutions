public class Screen {
    //2. Declare all instance variables

    //1. Declare a no-arg constructor
    public Screen() {}

    //3. Declare class operations

    //Displaying message without carriage return ( For prompts )
    public void displayMessage( String message ) {
        System.out.print( message );
    }

    //Displaying a message with carriage return
    public void displayMessageLine( String message ) {
        System.out.println( message );
    }

    //Displaying ammounts of dollars with 2 decimal places
    public void displayDollarAmount( double amount ) {
        System.out.printf( "$%,.2f", amount);
    }

}
