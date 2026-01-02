package Exercise4_35;

import java.util.Scanner;
/*(Sides of a Triangle) Write an application that reads three nonzero values entered by the
user and determines and prints whether they could represent the sides of a triangle.
* */
//public class declaration with the same file name
public class SideOfTriangle { //Beginning of class SideOfTriangle body

    //Starting point of the Java application. JVM executes this method to run Java application
    //Note: Added 'public' to satisfy JVM requirements for the entry point
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window. Readable source: Standard input object
        Scanner input = new Scanner(System.in);

        //Prompting the user to enter the integer value for the first side of the potential triangle
        System.out.print("Enter first side: ");
        int a = input.nextInt(); //Retrieving the first side length from the keyboard

        //Prompting the user to enter the integer value for the second side
        System.out.print("\nEnter second side: ");
        int b = input.nextInt(); //Retrieving the second side length from the keyboard

        //Prompting the user to enter the integer value for the third side
        System.out.print("\nEnter third side: ");
        int c = input.nextInt(); //Retrieving the third side length from the keyboard



        /* * Decision structure: Validating the sides using the Triangle Inequality Theorem.
         * Logic: In a valid triangle, the sum of any two sides must be strictly greater than the third side.
         * If the sum of any two sides is less than or equal (<=) to the third, the condition is true.
         */
        if (a + b <= c || a + c <= b || b + c <= a) {

            //Displaying a message informing the user that the provided lengths cannot form a valid triangle
            System.out.println("Those are not sides of the triangle");

        } //End of if-condition block

        //Closing the Scanner to release system resources
        input.close();

    } //End of method main body
} //End of class SideOfTriangle body