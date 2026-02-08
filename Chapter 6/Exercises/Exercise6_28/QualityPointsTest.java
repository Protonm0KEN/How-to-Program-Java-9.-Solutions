package Exercise6_28;

import java.util.Scanner;

/*
Problem statement:
Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
that reads a value from the user and displays the result.

This is a driver class to showcase the method qualityPoints of class QualityPoints
* */
public class QualityPointsTest {
    static void main() {
        //To obtain the user's input. The object of class Scanner and as a readable source standard input object System.in
        Scanner input = new Scanner(System.in);

        //Prompting user to enter the grade
        System.out.print("Enter please the grade: ");

        int grade = input.nextInt();//Storing the value obtained

        //Displaying quality points for the grade
        System.out.println("Quality points for the grade are: " + QualityPoints.qualityPoints(grade));
    }
}
