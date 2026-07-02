package Exercise16_14;

import java.util.Scanner;

public class TokenizingAndComparingStrings {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        String sentence = scanner.nextLine().toLowerCase();

        String[] tokens = sentence.split( "\\s+" );

        StringBuilder outputString = new StringBuilder();
        for( String token : tokens ) {
            if( token.endsWith("ed") ) {
                outputString.append(token).append(" ");
            }
        }
        System.out.println(outputString.toString());
    }
}
