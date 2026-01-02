package Exercise4_37;
/*
* (Factorial) The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”) and is defined as follows:
n! = n · (n – 1) · (n – 2) · … · 1 (for values of n greater than or equal to 1)
********
********
********
********
********
********
********
********
150 Chapter 4 Control Statements: Part 1
and
n! = 1 (for n = 0)
For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
a) Write an application that reads a nonnegative integer and computes and prints its factorial.
b) Write an application that estimates the value of the mathematical constant e by using
the following formula. Allow the user to enter the number of terms to calculate.
c) Write an application that computes the value of e
x by using the following formula. Allow the user to enter the number of terms to calculate.*/
//public class declaration with the same file name
public class Factorial { //Beginning of class Factorial body

    /* * Recursive static method to calculate the factorial of an integer.
     * Logic: n! = n * (n-1) * (n-2)... * 1.
     * Base case: if n is 0 or 1, the method returns 1 to terminate recursion.
     */
    static double getFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        //Recursive call: multiplying current n by the factorial of n - 1
        return n * getFactorial(n - 1);
    }



    /* * Static method to estimate the value of mathematical constant e.
     * Logic: e = 1 + 1/1! + 1/2! + 1/3! + ...
     * This method sums the terms of the series based on the specified numberOfTerms.
     */
    static double getE(int numberOfTerms) {
        double result = 0;
        //For loop to iterate through each term and accumulate the sum
        for (int i = 0; i < numberOfTerms; i++) {
            //Calculating the term by dividing 1 by the factorial of the current index i
            result += (double) 1 / Factorial.getFactorial(i);
        }
        return result;
    }



    /* * Static method to calculate the value of e raised to the power of x (e^x).
     * Logic: e^x = 1 + x/1! + x^2/2! + x^3/3! + ...
     * Uses the Taylor series expansion for exponential functions.
     */
    static double getEX(int numberOfTerms, int x) {
        double result = 0;
        //For loop to calculate and sum each term of the expansion
        for (int i = 0; i < numberOfTerms; i++) {
            /* * Logic: Raising x to the power of i and dividing by the factorial of i.
             * Utilizes Math.pow for exponentiation and getFactorial for the denominator.
             */
            result += Math.pow(x, i) / Factorial.getFactorial(i);
        }
        return result;
    }

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body

        //Displaying the calculated estimation of e using 30 terms of the series
        System.out.println(Factorial.getE(30));

        //Displaying the calculated value of e^3 (where x = 3) using 30 terms of the series
        System.out.println(Factorial.getEX(30, 3));

    } //End of method main body
} //End of class Factorial body