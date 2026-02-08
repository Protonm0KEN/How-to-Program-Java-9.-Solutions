package Exercise6_26;
/*

Problem statement:
 Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367.
Incorporate the method into an application that reads a value from the user and displays the result.
*
* */
public class ReversingDigits {

    //Method to obtain the integer value of the number passed to parameters with reversed digits
    public static int getReverse(int number){

        //To store string equivalent of reversed number
        String numberReversed = "";

        //This algorithm actually always gets the last digit of the number and "removes" this digit from the number.
        //Then this digit is store in numberReversed string. And when number becomes 0 ( no more digits remain ), then it means numberReversed stores the reversed version of the number

        while(number != 0){

            //Getting the remainder and "last digit" on this iteration from the number
            numberReversed+=number%10;

            //Dividing by 10 to "remove" the digit from the number
            number/=10;
        }
        //Returning integer equivalent of the reversed number
        return Integer.parseInt(numberReversed);
    }
}
