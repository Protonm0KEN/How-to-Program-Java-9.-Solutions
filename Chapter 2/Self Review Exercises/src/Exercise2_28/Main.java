package Exercise2_28;

//Floating point numbers applications
import java.util.Scanner;

//Program that calculates diameter, circumference, area of circle and displays

//class Main declaration
public class Main {//Begninng of class Main body

    //method main declaration
    static void main() {//Beginning of method main body

        //declaring and initializing variable "PI" to store value of pi in math
        double PI = Math.PI;

        //declaring a variable of type int to store the value of radius typed by user
        int radius;

        //Declaring the object of class Scanner and identifier input that uses System.in as a readable source to take user's input
        Scanner input = new Scanner(System.in);

        //Prompting user to enter the radius
        System.out.print("Enter please the radius of a circle as an integer: ");

        //Storing the value typed by user from the input in command line to variable radius
        radius = input.nextInt();


        //Displaying diameter, circumference, and area of circle like in math
        System.out.printf("\n Diameter: %d \n", 2*radius);
        System.out.printf("\n Circumference: %f \n", 2*radius*PI);
        System.out.printf("\n Area of a circle: %f \n", PI*radius*radius);

    }//end of method main body
}//end of class Main body
