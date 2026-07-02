package Exercise16_12;

import java.util.Scanner;

public class SearchingStrings {
    public static int getNumberOfOccurrences(String string, char character) {
        int numberOfOccurrences = 0;

        int index = string.indexOf(character);

        while(index >= 0) {
            numberOfOccurrences++;
            index = string.indexOf(character, index+1);
        }
        return numberOfOccurrences;
    }
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        char[] letters = {
                'a', 'b', 'c',
                'd', 'e', 'f',
                'g', 'h', 'i',
                'j', 'k', 'l',
                'm', 'n', 'o',
                'p', 'q', 'r',
                's', 't', 'u',
                'v', 'w', 'x',
                'y', 'z'
        };

        int[] occurrences = new int[26];
        for( int i = 0; i < 26; i++ ) {
            occurrences[i] = getNumberOfOccurrences(sentence, letters[i]);
        }

        for( int i = 0; i<26; i++){
            System.out.printf("%-10s\t%d\n", letters[i], occurrences[i]);
        }
    }
}
