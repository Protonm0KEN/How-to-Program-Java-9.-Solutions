package Exercise16_15;

import java.util.Scanner;

public class ConvertIntegerValueToCharacter {
    public static char getCharacter( int value ) {
        return (char) value;
    }

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        for(int i = 0; i <= 255; i++) {
            System.out.printf("Integer value %03d is characterized to: %c\n", i, getCharacter(i));
        }
    }
}
