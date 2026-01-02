package Exercise4_32;
/*
* Write an application that uses only the output statements
System.out.print( "* " );
System.out.print( " " );
System.out.println();
to display the checkerboard pattern that follows. A System.out.println method call with no arguments causes the program to output a single newline character. [Hint: Repetition statements are
required.]*/

/*
* ********
 ********
 ********
 ********
 ********
 ********
 ********
 *********/
//public class declaration with the same file name
public class CheckerBoardPatternOfAsterisks { //Beginning of class CheckerBoardPatternOfAsterisks body

    //Starting point of the Java application. JVM executes this method to run Java application
    public static void main(String[] args) { //Beginning of method main body



        /* * Outer for loop: Controls the rows of the checkerboard.
         * The loop iterates 8 times to create an 8-row pattern.
         */
        for(int i = 0; i < 8; i++) {

            /* * Inner for loop: Controls the columns (horizontal characters) within each row.
             * This loop also iterates 8 times to complete the square-like structure.
             */
            for(int j = 0; j < 8; j++) {

                /* * Decision structure: Determining the alignment of the current row.
                 * If the row index 'i' is even (0, 2, 4, 6), the row starts with an asterisk.
                 */
                if(i % 2 == 0) {
                    System.out.print("*"); //Printing asterisk first for even rows
                    System.out.print(" "); //Following with a space
                }
                /* * Else condition: Logic for odd-indexed rows (1, 3, 5, 7).
                 * The row is shifted to the right by starting with a space.
                 */
                else {
                    System.out.print(" "); //Printing space first for odd rows
                    System.out.print("*"); //Following with an asterisk
                }

            } //End of inner column loop

            //Moving the cursor to the next line after finishing all columns in the current row
            System.out.println();

        } //End of outer row loop

    } //End of method main body
} //End of class CheckerBoardPatternOfAsterisks body