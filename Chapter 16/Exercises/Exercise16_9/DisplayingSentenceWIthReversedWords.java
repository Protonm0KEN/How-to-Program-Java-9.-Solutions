package Exercise16_9;

import java.util.Scanner;

public class DisplayingSentenceWIthReversedWords {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split( "\\s+" );
        for( int i = words.length - 1; i >= 0; i-- ){
            System.out.println(words[i]);
        }

    }
}
