package Exercise16_7;

import java.util.Scanner;

public class PigLatin {
    public static void printPigLatinWord( String word ) {
        String pigWord = word.substring(1) + word.charAt(0) + "ay";
        System.out.print(pigWord);
    }
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a phrase: ");
        String[] wordsTokenized = scanner.nextLine().split( "\\s+" );
        for( int i = 0; i<wordsTokenized.length; i++ ) {
            printPigLatinWord(wordsTokenized[i]);
            System.out.print(" ");
        }


    }
}
