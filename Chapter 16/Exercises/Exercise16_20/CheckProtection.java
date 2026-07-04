package Exercise16_20;

import java.util.Scanner;

public class CheckProtection {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter amount: ");
        StringBuilder amountString = new StringBuilder(String.valueOf(scanner.nextLine()));

        int asterisksNeeded = 9 - amountString.length();
        for( int i = 0; i < asterisksNeeded; i++) {
            amountString.insert(0, "*");
        }
        System.out.println(amountString);

    }
}
