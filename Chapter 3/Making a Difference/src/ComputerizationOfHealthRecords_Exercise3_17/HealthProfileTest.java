package ComputerizationOfHealthRecords_Exercise3_17;

import Exercise3_15.Date;

//Importing class scanner from package java.util. ( Importing class scanner exclusively)
import java.util.Scanner;

public class HealthProfileTest {
    static void main() {

        //Declaring and initializing Scanner object to retrieve user's input
        Scanner input = new Scanner(System.in);


        //Declaring local variables that will store user's personal data
        String personFirstName;
        String personLastName;

        String gender;

        Date personBirthDate;

        int personBirthDay;
        int personBirthMonth;
        int personBirthYear;

        double weight;
        double height;



        System.out.println("Hello in HealthProfile application!");//Message greeting the user

        System.out.print("\nEnter your first name: ");//Prompt for first name
        personFirstName = input.nextLine();

        System.out.print("\nEnter your last name: ");//Prompt for last name
        personLastName = input.nextLine();

        System.out.print("\nEnter your gender ( 1 - M, 0 - F): ");//Prompt for gender
        int genderChoice = input.nextInt();
        if(genderChoice == 1) gender = "Male";
        else gender = "Female";

        //Prompt for birthDate
        System.out.print("\nEnter your birthday: ");
        personBirthDay = input.nextInt();
        System.out.print("\nEnter your birthmonth: ");
        personBirthMonth = input.nextInt();
        System.out.print("\nEnter your birthyear: ");
        personBirthYear = input.nextInt();

        //Prompt for body parameters
        System.out.print("\nEnter your weight ( in kilograms ): ");
        weight = input.nextDouble();
        System.out.print("\nEnter your height ( in cm ): ");
        height = input.nextDouble();


        //Initializing the date object
        personBirthDate = new Date(personBirthDay, personBirthMonth, personBirthYear);

        //Initializing ( creating ) health profile object
        HealthProfile healthProfile = new HealthProfile(personFirstName, personLastName, gender,  height, weight,  personBirthDate);

        //Displaying user info
        healthProfile.displayInfo();
    }
}
