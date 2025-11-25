package Exercise2_17; //package declaration of package Exercise2_17

//Arithmetic, Smallest and Largest
//This application obtains three integers from the user and calculates various metrics.

import java.util.Scanner; //importing the Scanner class to read user input

/*
* Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
* */
//class declaration of class Main
public class Main { //Beginning of class Main body
    static void main() { //beginning of method main body (Note: The standard signature is public static void main(String[] args))
        //Declaring and initializing a Scanner object named 'input' to obtain user input from the keyboard
        Scanner input = new Scanner(System.in);

        //Declaring three integer variables to store the user's input values
        int x;
        int y;
        int z;

        //Prompting user to enter the first integer
        System.out.println("Enter first integer: ");
        //Obtaining user's input and storing it in variable x
        x = input.nextInt();

        //Prompting user to enter the second integer
        System.out.println("Enter second integer: ");
        //Obtaining user's input and storing it in variable y
        y = input.nextInt();

        //Prompting user to enter the third integer
        System.out.println("Enter third integer: ");
        //Obtaining user's input and storing it in variable z
        z = input.nextInt();

        //Calculating the sum of the three integers
        int sum = x + y + z;
        //Calculating the integer average (integer division ensures truncation, e.g., 7/3 = 2)
        int average = sum / 3;
        //Calculating the product of the three integers
        int product = x * y * z;

        //Initializing the 'smallest' variable, assuming x is the smallest initially
        int smallest = x;
        //Initializing the 'largest' variable, assuming x is the largest initially
        int largest = x;

        // --- Largest Number Check ---

        //If y is greater than the current largest, update largest to y
        if(y > largest)
            largest = y;
        //If z is greater than the current largest, update largest to z
        if(z > largest )
            largest = z;

        // --- Smallest Number Check ---

        //If y is smaller than the current smallest, update smallest to y
        if(y < smallest)
            smallest = y;
        //If z is smaller than the current smallest, update smallest to z
        if(z < smallest )
            smallest = z;

        //Displaying the calculated sum
        System.out.println("The sum: " + sum);
        //Displaying the calculated average
        System.out.println("The average: " + average);
        //Displaying the calculated product
        System.out.println("The product: " + product);
        //Displaying the smallest number found
        System.out.println("The smallest: " + smallest);
        //Displaying the largest number found
        System.out.println("The largest: " + largest);

    } //end of method main body


} //end of class Main body