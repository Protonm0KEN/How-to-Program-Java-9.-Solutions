package Exercise4_24;

import java.util.Scanner;
/*
* Modify the program in Fig. 4.12 to validate its inputs. For any input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value.*/
//public class declaration with the same file name
public class ValidatingUserInput { //Beginning of class ValidatingUserInput body

    //Starting point of the Java application. JVM executes this method to run Java application
    //Added 'public static' and 'String[] args' for proper entry
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window
        Scanner input = new Scanner(System.in);

        //Initializing counters for exam results and student tracking
        int passes = 0; //Variable to accumulate the number of successful results
        int failures = 0; //Variable to accumulate the number of unsuccessful results
        int studentCounter = 1; //Control variable to ensure exactly 10 students are processed
        int result; //Variable to hold the current input value (1 or 2)

        //Outer while loop: Iterates until 10 students' results have been validated and recorded
        while (studentCounter <= 10) {

            //Prompting user for the specific student's result
            System.out.printf("Enter result for student #%d (1=pass, 2=fail): ", studentCounter);
            result = input.nextInt(); //Retrieving the initial input from the keyboard

            while (result != 1 && result != 2) {
                System.out.print("Invalid entry! Please enter 1 for pass or 2 for fail: ");
                result = input.nextInt(); //Re-retrieving input until valid
            }

            //Decision structure: Incrementing the appropriate counter based on validated input
            if (result == 1) {
                passes++;
            } else {
                failures++;
            }

            //Incrementing the student counter to proceed to the next iteration
            studentCounter++;

        } //End of outer while loop

        //Displaying the final summary of exam results
        System.out.println("\n----------------EXAM SUMMARY----------------");
        System.out.printf("Total Passed: %d\nTotal Failed: %d\n", passes, failures);

        //Logic check: Determining if the instructor receives a bonus based on performance
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }

        //Closing the Scanner to release system resources
        input.close();

    } //End of method main body
} //End of class ValidatingUserInput body