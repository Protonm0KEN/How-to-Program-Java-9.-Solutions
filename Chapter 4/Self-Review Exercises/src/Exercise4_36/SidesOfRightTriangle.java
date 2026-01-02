package Exercise4_36;

import java.util.Scanner;
/*
* (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines and prints whether they could represent the sides of a right triangle.*/
//public class declaration with the same file name
public class SidesOfRightTriangle { //Beginning of class SidesOfRightTriangle body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window
        Scanner input = new Scanner(System.in);

        //Retrieving three integer values from the keyboard representing potential triangle sides
        int a = input.nextInt(); //First side input
        int b = input.nextInt(); //Second side input
        int c = input.nextInt(); //Third side input

        if( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c,2)
                || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a,2)
                || (Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b,2)
        ) {
            //Displaying confirmation if any of the three conditions are met
            System.out.println("Sides are forming right triangle");
        } else {
            //Alternative branch: executed if none of the Pythagorean combinations hold true
            System.out.println("Not forming");
        }

        //Closing the Scanner to release system resources
        input.close();

    } //End of method main body
} //End of class SidesOfRightTriangle body