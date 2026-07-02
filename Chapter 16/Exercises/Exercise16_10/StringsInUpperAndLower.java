package Exercise16_10;

import java.util.Scanner;

public class StringsInUpperAndLower {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("All uppercase: " + sentence.toUpperCase());
        System.out.println("All lowercase: " + sentence.toLowerCase());
    }
}
