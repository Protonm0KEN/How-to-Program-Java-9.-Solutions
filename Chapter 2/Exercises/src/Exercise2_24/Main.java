package Exercise2_24; //package declaration of package Exercise2_24

import java.util.Scanner; //importing the Scanner class to read user input

//Largest and Smallest integers
//This application prompts the user for five integers, reads them, and determines the largest and smallest among them.

//class declaration of class Main
public class Main { //Beginning of class Main body
    // Method main definition (Note: The standard signature required by the JVM is 'public static void main(String[] args)')
    static void main() { //beginning of method main body
        //Declaring and initializing a Scanner object named 'input' to obtain user input from the keyboard
        Scanner input = new Scanner(System.in);

        //Declaring five integer variables to store the user's input values
        int x;
        int y;
        int z;
        int a;
        int b;

        //Prompting user to enter the first integer
        System.out.print("Enter first integer: ");
        //Obtaining user's input and storing it in variable x
        x = input.nextInt();

        //Prompting user to enter the second integer
        System.out.print("Enter second integer: ");
        //Obtaining user's input and storing it in variable y
        y = input.nextInt();

        //Prompting user to enter the third integer
        System.out.print("Enter third integer: ");
        //Obtaining user's input and storing it in variable z
        z = input.nextInt();

        //Prompting user to enter the fourth integer
        System.out.print("Enter fourth integer: ");
        //Obtaining user's input and storing it in variable a
        a = input.nextInt();

        //Prompting user to enter the fifth integer
        System.out.print("Enter fifth integer: ");
        //Obtaining user's input and storing it in variable b
        b = input.nextInt();

        //Initializing the 'largest' variable, assuming x is the largest initially
        int largest = x;
        //Initializing the 'smallest' variable, assuming x is the smallest initially
        int smallest = x;

        // --- Logic to find the Largest Number ---

        //Checking if y is greater than the current largest, and updating if true
        if(y > largest)
            largest = y;
        //Checking if z is greater than the current largest, and updating if true
        if(z > largest)
            largest = z;
        //Checking if a is greater than the current largest, and updating if true
        if(a > largest)
            largest = a;
        //Checking if b is greater than the current largest, and updating if true
        if(b > largest)
            largest = b;


        // --- Logic to find the Smallest Number ---

        //Checking if y is smaller than the current smallest, and updating if true
        if(y < smallest)
            smallest = y;
        //Checking if z is smaller than the current smallest, and updating if true
        if(z < smallest)
            smallest = z;
        //Checking if a is smaller than the current smallest, and updating if true
        if(a < smallest)
            smallest = a;
        //Checking if b is smaller than the current smallest, and updating if true
        if(b < smallest)
            smallest = b;

        //Displaying the label for the largest number
        System.out.println("The largest: "+largest);
        //Displaying the label for the smallest number
        System.out.println("The smallest: "+smallest);


    } //end of method main body
} //end of class Main body