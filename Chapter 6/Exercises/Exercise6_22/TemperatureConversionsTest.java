package Exercise6_22;

import java.util.Scanner;

public class TemperatureConversionsTest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of degree you want to enter ( C for Celsius, F for Fahrenheit) : ");

        char choice = input.next().charAt(0);

        System.out.print("Enter the degree: ");
        double degree = input.nextDouble();
        switch (choice){
            case 'C':
                System.out.printf("\n The fahrenheit of %fC is %fF", degree, TemperatureConversions.fahrenheit(degree));
                break;
            case 'D':
                System.out.printf("\n The fahrenheit of %fC is %fF", degree, TemperatureConversions.celsius(degree));
                break;
            default:
                System.out.println("Incorrect choice is entered");
                break;
        }
    }
}
