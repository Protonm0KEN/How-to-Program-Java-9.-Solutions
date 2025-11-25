package Exercise2_27; //package declaration of package Exercise2_27

//(Checkerboard Pattern of Asterisks) Write an application that displays a checkerboard pattern, as follows:
//This program uses a series of System.out.println statements to display an 8x8 checkerboard pattern
//composed of asterisks and spaces, achieving the checkerboard effect by alternating a leading space.

//class declaration statement to declare class Main
public class Main {//Beginning of class Main body
    // Method main definition (Note: The standard signature required by the JVM is 'public static void main(String[] args)')
    static void main() {//Beginning of method main body
        //First row: starts with an asterisk
        System.out.println("* * * * * * * *");
        //Second row: starts with a space to offset the pattern
        System.out.println(" * * * * * * * *");
        //Third row: starts with an asterisk (repeats row 1)
        System.out.println("* * * * * * * *");
        //Fourth row: starts with a space (repeats row 2)
        System.out.println(" * * * * * * * *");
        //Fifth row: starts with an asterisk (repeats row 1)
        System.out.println("* * * * * * * *");
        //Sixth row: starts with a space (repeats row 2)
        System.out.println(" * * * * * * * *");
        //Seventh row: starts with an asterisk (repeats row 1)
        System.out.println("* * * * * * * *");
        //Eighth row: starts with a space (repeats row 2)
        System.out.println(" * * * * * * * *");
    }//End of method main body
}//End of class Main body