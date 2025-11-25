package Exercise2_29;

// INteger value of a character

/*
 * Application that displays the integer (Unicode) equivalents of specific
 * uppercase letters, lowercase letters, digits, and special symbols.
 */
public class Main {

    // Standard entry point for a Java application
    public static void main(String[] args) {

        // 'A' is cast to an integer (65), %c displays the character, %d displays the integer value.
        System.out.printf("The character %c has a value %d%n", 'A', (int) 'A');
        System.out.printf("The character %c has a value %d%n", 'B', (int) 'B');
        System.out.printf("The character %c has a value %d%n", 'C', (int) 'C');

        // A blank line for better output readability
        System.out.println();

        // Notice the difference in values between uppercase and lowercase letters.
        System.out.printf("The character %c has a value %d%n", 'a', (int) 'a');
        System.out.printf("The character %c has a value %d%n", 'b', (int) 'b');
        System.out.printf("The character %c has a value %d%n", 'c', (int) 'c');

        System.out.println();

        // These values are different from the integer value 0, 1, or 2.
        System.out.printf("The character %c has a value %d%n", '0', (int) '0');
        System.out.printf("The character %c has a value %d%n", '1', (int) '1');
        System.out.printf("The character %c has a value %d%n", '2', (int) '2');

        System.out.println();

        // Correcting the list to include '*' as requested in the problem text.
        System.out.printf("The character %c has a value %d%n", '$', (int) '$');
        System.out.printf("The character %c has a value %d%n", '*', (int) '*');
        System.out.printf("The character %c has a value %d%n", '+', (int) '+');
        System.out.printf("The character %c has a value %d%n", '/', (int) '/');

        System.out.println();

        System.out.printf("The character '%c' has a value %d%n", ' ', (int) ' ');
    }
}