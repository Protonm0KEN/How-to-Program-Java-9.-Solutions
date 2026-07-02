package Exercise16_11;

import java.util.Scanner;

public class SearchingStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter a search character: ");
        char character = scanner.next().charAt(0);

        int numberOfOccurrences = 0;

        int index = sentence.indexOf(character);

        while(index >= 0) {
            numberOfOccurrences++;
            index = sentence.indexOf(character, index+1);
        }
        System.out.println("Number of occurrences of the character: " + numberOfOccurrences);
    }
}
