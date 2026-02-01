package Exercise6_23;

import java.util.Scanner;

public class FindMinimum3Test {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to application that can find minimum of 3 floating point numbers");
        System.out.print("Please enter 3 floating point numbers separated by spaces: ");

        double x = 0;
        double y = 0;
        double z = 0;
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();

        System.out.println("The minimum is: " + FindMinimumOf3.minimum3(x,y,z));
    }
}
