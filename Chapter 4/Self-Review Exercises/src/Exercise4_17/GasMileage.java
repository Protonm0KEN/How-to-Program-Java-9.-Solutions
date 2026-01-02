package Exercise4_17;

import java.util.Scanner;
/*
*
* In comparison with my written stepwise refinement, the thing i actually did is to use the do while repetition statement, because at least once we should ask user to enter the data, if no
* correct value of miles was entered, then the program should exit ( If i didn't use the do while statement for this sentinel controlled repetition, i would place the body of the statement
* outside the statement to do the one "iteration", because as a sentinel i choose that mileage will be a negative number, and if it is, loop should terminate. However,
* the condition milesForTrip<0 would always be false in the beginning because milesForTrip has to be initialized to 0 ( local variable always has to be initialized to some values ), thus to escape such a problem,
* i would need to do one iteration outside of while body and before the statement ( which works the same as the do while statement)
*
* Also, there can not be error for division by 0 and there ca not be negative numbers
*
* Problem statement:
*  Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.
* */

//public class declaration with an access modifier public ( thus a file has a same file name), driver class because it involves the functionality in main method
public class GasMileage {

    //The thing is that we can't use arrays before chapter 7, so i invented a way to store the result using a string by concatenating them together
    public static String messageForTrip(int milesForTrip, int gallonsForTrip, int tripNumber){
        //Local variable message to store a message formatted to "this" trip written by user
        String message;
        //Assigning a formatted string using static method String.format
        message = String.format("\n ---------------------- \n Мурасаки: %d\n Miles: %d\n Trip number: %d\n Miles per gallon: %.12f \n ---------------------- ", gallonsForTrip, milesForTrip, tripNumber, (double) milesForTrip/gallonsForTrip);

        return message;//returning the info ( message) to method caller
    }

    //Starting point of every Java application. Main method is the method that JVM calls to run the Java application
    static void main() {

        //Scanner input object to retrieve user's input from command line and readable source as standard input object
        Scanner input = new Scanner(System.in);

        //Storing the total message that would represent all of the trips messagesForTrip as concatenated string
        String totalDataMessage = new String();

        //Data to get from the user, miles for this trip and gallons for this trip
        int milesForTrip = 0;
        int gallonsForTrip = 0;

        //Total of all trips for mileage and gallons
        int milesTotal = 0;
        int gallonsTotal = 0;

        //First trip would be first). Stores the number of the trip written by user
        int tripNumber = 1;

        do {

            //Prompt to show how to exit from the application
            System.out.println("Enter <0 number (either to miles or gallons) to exit");
            //Prompt to get the mileage from the user
            System.out.printf("\n Please enter the miles for trip number %d: ", tripNumber);

            //Storing integer value of mileage to milesForTrip variable
            milesForTrip = input.nextInt();

            //If single selection statement if user is willing to continue to enter values ( assumed user didn't press -1 above)
            if(milesForTrip > 0){

                //Prompting user to enter the gallons for the trip
                System.out.printf("Please enter the gallons for trip number %d: ", tripNumber);

                //Storing integer value of gallons to gallonsForTrip variable
                gallonsForTrip = input.nextInt();
                if(gallonsForTrip > 0){
                    //Adding the milesForTrip to total mileage milesTotal
                    milesTotal += milesForTrip;
                    //Adding the gallonsForTrip to gallonsTotal
                    gallonsTotal += gallonsForTrip;

                    //Adding the information about the trip to total list of trips
                    totalDataMessage+=GasMileage.messageForTrip(milesForTrip, gallonsForTrip, tripNumber);
                }
            }

            //Incrementing trip number to track number of trips
            tripNumber++;
        } while (milesForTrip > 0 && gallonsForTrip > 0);

        //Displaying final results
        System.out.println("Total information: ");
        System.out.println(totalDataMessage);
        System.out.println("Total gallons: "+gallonsTotal);
        System.out.println("Total miles: "+milesTotal);

    }
}
