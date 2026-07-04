package Exercise16_22;

import java.util.Objects;
import java.util.Scanner;

public class MorseCode {
    private static final String[] MorseLetters = {
            ".-",       //A
            "-...",     //B
            "-.-.",     //C
            "-..",      //D
            ".",        //E
            "..-.",     //F
            "--.",      //G
            "....",     //H
            "..",       //I
            ".---",     //J
            "-.-",      //K
            ".-..",     //L
            "--",       //M

            "-.",       //N
            "---",      //O
            ".--.",     //P
            "--.-",     //Q
            ".-.",      //R
            "...",      //S
            "-",        //T
            "..-",      //U
            "...-",     //V
            ".--",      //W
            "-..-",     //X
            "-.--",     //Y
            "--..",     //Z
    };
    private static final String[] MorseDigits = {
            "-----",    //0
            ".---",     //1
            "..---",    //2
            "...--",    //3
            "....-",    //4
            ".....",    //5
            "-....",    //6
            "--...",    //7
            "---..",    //8
            "----.",    //9
    };

    public static String getMorseFromEnglish( String EnglishWord ) {
        EnglishWord = EnglishWord.toLowerCase();
        StringBuilder newMorseCodeEnglishWord = new StringBuilder();
        for( int i = 0; i < EnglishWord.length(); i++ ) {
            Character character = EnglishWord.charAt(i);
            if(Character.isDigit(character)) {
                newMorseCodeEnglishWord.append(MorseDigits[character-48]);
            } else if (Character.isLetter(character)) {
                newMorseCodeEnglishWord.append(MorseLetters[character - 97]);
            }
            newMorseCodeEnglishWord.append(" ");
        }
        return newMorseCodeEnglishWord.toString();
    }

    public static String getEnglishFromMorse( String MorseWord ) {
        StringBuilder EnglishWord = new StringBuilder();
        String[] charactersInMorseWord = MorseWord.split( " " );
        for( int i = 0; i < charactersInMorseWord.length; i++ ) {
            for( int j = 0; j < MorseLetters.length; j++ ) {
                if(charactersInMorseWord[i].equals(MorseLetters[j])) {
                    EnglishWord.append((char) (j + 97));
                }
            }
            for( int j = 0; j < MorseDigits.length; j++ ) {
                if(charactersInMorseWord[i].equals(MorseDigits[j])) {
                    EnglishWord.append((char) (j + 48));
                }
            }
        }
        return EnglishWord.toString();
    }

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a phrase to convert to morse code: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        StringBuilder morseCodedSentence = new StringBuilder();
        for( int i = 0; i < words.length; i++ ) {
            morseCodedSentence.append(getMorseFromEnglish(words[i])).append("   ");
        }
        System.out.println(morseCodedSentence.toString().trim());
    }
}
