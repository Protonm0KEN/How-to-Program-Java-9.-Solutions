package Exercise16_17;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThreeLetterStringsFromFiveLetter {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter a string with 5 letters: ");
        char[] letters = scanner.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char character : letters) {
            if (sb.indexOf(String.valueOf(character)) == -1) {
                sb.append(character);
            }
        }

        char[] uniqueLetters = sb.toString().toCharArray();

        ArrayList<String> threeLetterWords = new ArrayList<String>();

        for (char uniqueLetter : uniqueLetters) {
            for (char letter : uniqueLetters) {
                for (char c : uniqueLetters) {
                    if (uniqueLetter != letter && uniqueLetter != c && letter != c) {
                        threeLetterWords.add("" + uniqueLetter + letter + c);
                    }
                }
            }
        }


        for( String word : threeLetterWords) {
            System.out.println(word);
        }


    }
}
