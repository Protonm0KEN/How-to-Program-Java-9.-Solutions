package Exercise6_27;
/*
* /*
* Problem Statement:
* The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
into an application that reads two values from the user and displays the result.


This is the driver class to test the gcd method of class GCD
 */
public class GCDTest {
    static void main() {
        System.out.println("Gcd of 825 and 25 is: " + GCD.gcd(825,25));
    }
}
