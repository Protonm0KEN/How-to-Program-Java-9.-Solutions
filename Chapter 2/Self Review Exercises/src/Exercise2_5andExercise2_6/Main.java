//Write declarations, statements or comments that accomplish each of the following tasks:

import java.util.Scanner;

//class Main declaration
class Main{//Beginning of class Main body

    //main method declaration
    static void main(String[] args){ //Beginning of method main body

        //a) State that a program will calculate the product of three integers.

        //This program calculates the product of three integers

        //b) Create a Scanner called input that reads values from the standard input.

        //Declaring the variable input of type Scanner ( from class Scanner ) and initializing it to object of Scanner with readable source System.in
        Scanner input = new Scanner(System.in);

        //c) Declare the variables x, y, z and result to be of type int.
        int x;
        int y;
        int z;

        int result;

        //d) Prompt the user to enter the first integer.
        System.out.print("Enter the first integer: ");

        //e) Read the first integer from the user and store it in the variable x.
        x = input.nextInt();

        //f) Prompt the user to enter the second integer.
        System.out.print("Enter the second integer: ");

        //g) Read the second integer from the user and store it in the variable y.
        y = input.nextInt();

        //h) Prompt the user to enter the third integer.
        System.out.print("Enter the third integer: ");

        //i) Read the third integer from the user and store it in the variable z.
        z = input.nextInt();

        //j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result.
        result = x*y*z;

        //k) Display the message "Product is" followed by the value of the variable result.
        System.out.println("Product is: "+result);
    }//End of method main body
}//End of class Main body