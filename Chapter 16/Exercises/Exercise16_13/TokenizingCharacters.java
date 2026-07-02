package Exercise16_13;

import java.util.Scanner;

public class TokenizingCharacters {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        String[] tokens = sentence.split( "\\s+" );

        StringBuilder newSentence = new StringBuilder();
        for( String token : tokens ) {
            if( token.charAt(0) == 'b' ) {
                newSentence.append(token);
                newSentence.append(" ");
            }
        }
        System.out.println(newSentence);
    }
}
