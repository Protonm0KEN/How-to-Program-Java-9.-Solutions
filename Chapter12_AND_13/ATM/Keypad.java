import java.util.Scanner;

//Class Keypad which represents an ATM keypad
public class Keypad {

    //2. Declare all instance variables
    private Scanner input;
    //3. Declare all references to other objects from class diagram depending on associations




    //1. Declare no-arg constructor ( For reminder to declare new constructors )
    public Keypad() {
        input = new Scanner( System.in );
    }


    //4. Declare all class operations ( methods )
    public int getInput() {
        return input.nextInt();
    }



}
