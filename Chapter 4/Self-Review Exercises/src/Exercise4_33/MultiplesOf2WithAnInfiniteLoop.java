package Exercise4_33;
/*
* (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
should not terminate (i.e., it should create an infinite loop). What happens when you run this program?*/
//public class declaration with the same file name
public class MultiplesOf2WithAnInfiniteLoop { //Beginning of class MultiplesOf2WithAnInfiniteLoop body

    /*Starting point of the Java application.
     Added 'public' and 'String[] args' for proper JVM execution.
     Included 'throws InterruptedException' to handle the checked exception from Thread.sleep.
     */
    public static void main(String[] args) throws InterruptedException { //Beginning of method main body

        //Declaring and initializing an integer variable to the base value of 2
        int number = 2;



        /* * Infinite while loop: Using 'true' as the condition to ensure
         * the block of code executes indefinitely until manually terminated.
         */
        while(true) {

            //Displaying the result of the current value multiplied by 2 to the console
            System.out.println(number * 2);

            /* * Update logic: Assigning the result of (number * 2) back to 'number'.
             * This effectively calculates consecutive powers of 2 in each iteration.
             */
            number *= 2;

            /* * Execution control: Pausing the thread for 100 milliseconds.
             * This prevents the console from being overwhelmed and allows for observable output.
             */
            Thread.sleep(100);

        } //End of infinite while loop body

    } //End of method main body
} //End of class MultiplesOf2WithAnInfiniteLoop body