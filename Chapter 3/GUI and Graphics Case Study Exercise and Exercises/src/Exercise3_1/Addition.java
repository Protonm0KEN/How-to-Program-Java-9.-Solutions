package Exercise3_1;

//Importing everything from java class library javax.swing, * means importing every element
import javax.swing.*;

/*
* Modify the addition program in Fig. 2.7 to use dialog-based input and output with the
methods of class JOptionPane. Since method showInputDialog returns a String, you must convert
the String the user enters to an int for use in calculations. The Integer class’s static method
parseInt takes a String argument representing an integer (e.g., the result of JOptionPane.showInputDialog) and returns the value as an int. Method parseInt is a static method of class Integer
(from package java.lang). If the String does not contain a valid integer, the program will terminate
with an error.
*
*
* */


public class Addition {//Access modifier: public. Class declaration. Beginning of class declaration's body\

    static void main() {//Main mehtod's header. Takes no argument ( command line arguments ), used for JVM to execute Java this application. Beginning of main method body

        //Declaring variable of type integer with variable name number1
        int number1;
        //initializing it to value that was returnt from input dialog and converted by parseInt


        /*
        It is written in that way because JOptionPane.showInputDialog("Enter first integer: ") would return the number in String type and we should convert it
        To convert it we can use Integer.parseInt static method that return an integer, so it's argument will be JOptionPane.showInputDialog("Enter first integer: ") (String)
        and return type is integer ( parameter of this method is String)
        * */
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer: "));


        //Declaring variable of type integer with variable name number2
        int number2;
        //initializing it to value that was returnt from input dialog and converted by parseInt.


        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer: "));

        //Showing the message dialog that is centered in it's own window ( due to the parentComponent: null ) and showMessageDialog method is static, thus no object is needed to call it
        JOptionPane.showMessageDialog(null, "The sum is: "+(number1+number2));
    }//End of main method body
}//End of class declaration's body
