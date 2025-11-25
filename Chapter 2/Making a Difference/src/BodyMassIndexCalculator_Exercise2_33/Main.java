package BodyMassIndexCalculator_Exercise2_33; //package declaration of package BodyMassIndexCalculator

import java.util.Scanner; //importing the Scanner class to read user input

//class declaration of class Main
public class Main { //Beginning of class Main body
    // Method main definition
    static void main(String[] args) { //beginning of method main body
        //Declaring and initializing a Scanner object named 'input' to obtain user input from the keyboard
        Scanner input = new Scanner(System.in);

        //Declaring variables of type double to store floating-point values for weight and height
        double weight; // Variable for weight in kilograms
        double height; // Variable for height in meters

        //Prompting user to enter weight in kilograms
        System.out.print("Enter your weight in kg: ");
        //Obtaining user's input (a double value) and storing it in the 'weight' variable
        weight = input.nextDouble();

        //Prompting user to enter height in meters
        System.out.print("Enter your height in meters: ");
        //Obtaining user's input (a double value) and storing it in the 'height' variable
        height = input.nextDouble();


        //Calculating Body Mass Index (BMI) using the formula: weight / (height * height)
        double BMI =  weight /(height * height);
        //Displaying the calculated BMI value using floating-point formatting (%f)
        System.out.printf("Yur BMI is: %f\n", BMI); // Added newline character for cleaner output separation

        //Printing a header for the reference values
        System.out.println("BMI Values");
        //Displaying the Underweight category range
        System.out.println("Underweight: less than 18.5");
        //Displaying the Normal category range
        System.out.println("Normal between 18.5 and 24.9");
        //Displaying the Overweight category range
        System.out.println("Overweight: between 25 and 29.9");
        //Displaying the Obese category range
        System.out.println("Obese: 30 or greater");
    } //end of method main body
} //end of class Main body