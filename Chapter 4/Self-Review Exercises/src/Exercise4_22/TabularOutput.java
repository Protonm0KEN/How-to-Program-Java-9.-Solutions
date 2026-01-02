package Exercise4_22;
/*
*  Write a Java application that uses looping to print the following table of
values:
*
* N 10*N 100*N 1000*N
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000*/
//public class declaration with the same file name
public class TabularOutput { //Beginning of class TabularOutput body

    //Starting point of the Java application. JVM executes this method to run Java application
    //Added 'public' and 'String[] args' for proper method entry
    public static void main(String[] args) { //Beginning of method main body

        //Declaring and initializing the control variable N for the loop
        int n = 1;

        //Displaying the table header to describe the data columns
        //Using tab characters (\t) to ensure horizontal alignment between headers
        System.out.println("N\t10*N\t100*N\t1000*N");
        System.out.println(); //Printing an empty line for visual separation

        /* * Beginning of while loop to generate table rows.
         * The loop will iterate 5 times, processing values for N = 1 through 5.
         */
        while (n <= 5) {
            System.out.printf("%d\t%d\t%d\t%d%n", n, (n * 10), (n * 100), (n * 1000));

            //Incrementing the control variable to proceed to the next integer
            n++;

        } //End of while loop

    } //End of method main body
} //End of class TabularOutput body