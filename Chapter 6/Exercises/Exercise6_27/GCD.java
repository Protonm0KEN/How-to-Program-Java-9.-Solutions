package Exercise6_27;
/*
* Problem Statement:
* The greatest common divisor (GCD) of two integers is the largest
integer that evenly divides each of the two numbers. Write a method gcd that returns the greatest
common divisor of two integers. [Hint: You might want to use Euclid’s algorithm. You can find
information about it at en.wikipedia.org/wiki/Euclidean_algorithm.] Incorporate the method
into an application that reads two values from the user and displays the result.
*
* This method gcd should by logic be declared as static,
* since it's logic is not bound to any object,
* but rather it is a common mathematical operation for finding the gcd
* */
public class GCD {

    /*
    This gcd uses Euclid's algorithm and uses recursion to handle the logic
    *
    * */
    public static int gcd(int a, int b){
        //Euclid's algorithm
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
