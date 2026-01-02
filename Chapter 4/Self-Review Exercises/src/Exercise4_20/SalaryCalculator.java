package Exercise4_20;

import java.util.Scanner;
/*
* Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data*/
//public class declaration with the same file name
public class SalaryCalculator { //Beginning of class SalaryCalculator body

    //Starting point of the Java application. JVM executes this method to run Java application
    //Note: Added 'public' and 'String[] args' to satisfy JVM requirements for the entry point
    public static void main(String[] args) { //Beginning of method main body

        //Scanner object input to obtain user's input from the command line window. Readable source: Standard input object
        Scanner input = new Scanner(System.in);

        //Declaring double variables to store time and rate data for precise financial calculations
        double numberOfHours = 0; //Variable to hold the total hours worked by the employee
        double hourlyRate = 0; //Variable to hold the rate of pay per hour

        //Variable to keep track of the current employee index for reporting purposes
        int employeeCounter = 1;

        //Declaring and initializing a String to accumulate salary reports for all employees
        String totalInformationAboutEmployees = "";

        //Beginning of do-while loop to process data for multiple employees until a negative hour value is entered
        do {
            //Initializing a new String for each iteration to hold data for the current employee
            String informationAboutThisEmployee = "";

            //Prompting the user to enter work hours; provides a sentinel exit condition (negative number)
            System.out.printf("Enter the number of hours for employee #%d (or any negative number to exit): ", employeeCounter);

            //Using nextDouble() instead of nextInt() to allow for partial hours and match the double data type
            numberOfHours = input.nextDouble();

            //Logic check: Only process input and prompt for rate if the hours entered are non-negative
            if (numberOfHours >= 0) {
                //Concatenating the employee identifier and hours to the individual info string
                //Using %.2f to limit decimal places to two for cleaner reading
                informationAboutThisEmployee += String.format("Employee %d\n", employeeCounter);
                informationAboutThisEmployee += String.format("Number of hours: %.2f\n", numberOfHours);

                //Prompting user for the hourly rate for the current employee
                System.out.printf("Enter the hourly rate for employee #%d: ", employeeCounter);
                hourlyRate = input.nextDouble(); //Retrieving hourly rate from the keyboard
                informationAboutThisEmployee += String.format("Hourly rate: $%.2f\n", hourlyRate);

                double totalSalary = 0;

                //Decision structure: Determining if the employee is eligible for overtime pay (over 40 hours)
                if (numberOfHours > 40) {
                    //Calculating straight time for the first 40 hours
                    double straightPay = 40 * hourlyRate;
                    //Calculating overtime pay: (hours over 40) multiplied by (rate * 1.5)
                    double overtimePay = (numberOfHours - 40) * (hourlyRate * 1.5);

                    totalSalary = straightPay + overtimePay;
                } else {
                    //Calculating regular pay if no overtime was worked
                    totalSalary = numberOfHours * hourlyRate;
                }

                //Concatenating the final calculated salary to the current employee's record
                informationAboutThisEmployee += String.format("Salary: $%.2f\n\n", totalSalary);

                //Appending the completed employee report to the master total string
                totalInformationAboutEmployees += informationAboutThisEmployee;

                //Incrementing the counter to prepare for the next potential employee entry
                employeeCounter++;
            }

        } while (numberOfHours >= 0); //Sentinel control: If numberOfHours < 0, the loop terminates

        //Displaying the final summary of all processed salaries collected in the master string
        System.out.println("\n------------INFORMATION ABOUT EMPLOYEES SALARIES------------");
        System.out.println(totalInformationAboutEmployees);

        //Closing the Scanner to prevent memory leaks and release system resources
        input.close();

    } //End of method main body
} //End of class SalaryCalculator body