package Exercise2_15;

import java.util.Scanner;

//Arithmetic
//This program obtains integers from user and shows different arithmetical operations made on them


//class declaration of class Main
public class Main { //Beginning of class Main body

    static void main() { //beginning of method main body
        //Declaring a Scanner object to obtain input from user ( keybboard) and initializing it to have readable source as System.in
        Scanner input = new Scanner(System.in);

        //Declaring variables to store values from prompts
        int x;
        int y;

        //Prompting user to enter first integer
        System.out.print("Enter please first integer: ");

        //Taking user's input of first integer
        x = input.nextInt(); //Storing the user's input integer to variable x


        //Prompting user to enter second integer
        System.out.print("Enter please second integer: ");

        //Taking user's input of second integer
        y = input.nextInt(); //Storing the user's input integer to variable y



        //Showing the user the difference of x and y: x - y

        System.out.printf("%d - %d = %d\n", x,y, (x-y));

        //Showing the user the product of x and y: x * y

        System.out.printf("%d * %d = %d\n", x,y, (x*y));

        //Showing the user the sum of x and y: x + y

        System.out.printf("%d + %d = %d\n", x,y, (x+y));

        //Showing the user the division of x and y: x / y

        System.out.printf("%d / %d = %d\n", x,y, (x/y));
    }//end of method main body
}//end of class Main body
