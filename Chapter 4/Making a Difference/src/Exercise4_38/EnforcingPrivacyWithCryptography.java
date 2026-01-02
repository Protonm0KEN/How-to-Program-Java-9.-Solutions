package Exercise4_38;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {

    //Beginning of method encrypt body
    static int encrypt(int number) {
        StringBuilder newNumber = new StringBuilder();

        //Extracting digits right-to-left
        while(number != 0) {
            int digit = number % 10;
            digit += 7;
            newNumber.append(digit % 10);
            number /= 10;
        }
        while(newNumber.length() < 4) {
            newNumber.append("7");
        }

        //Swapping logic
        char digit1 = newNumber.charAt(0);
        newNumber.setCharAt(0, newNumber.charAt(2));
        newNumber.setCharAt(2, digit1);

        char digit2 = newNumber.charAt(1);
        newNumber.setCharAt(1, newNumber.charAt(3));
        newNumber.setCharAt(3, digit2);

        //Returning as integer (Leading zeros will be lost here, handled in main)
        return Integer.parseInt(newNumber.toString());
    }

    //Beginning of method decrypt body
    static int decrypt(int encryptedNumber) {
        StringBuilder newNumber = new StringBuilder();

        //Decrypting math logic
        while(encryptedNumber != 0) {
            if(encryptedNumber % 10 - 7 >= 0) {
                newNumber.append((encryptedNumber % 10 - 7) % 10);
            } else {
                newNumber.append((encryptedNumber % 10 + 3) % 10);
            }
            encryptedNumber /= 10;
        }
        while(newNumber.length() < 4) {
            newNumber.append("0");
        }

        //Swapping logic back to original
        char digit1 = newNumber.charAt(0);
        newNumber.setCharAt(0, newNumber.charAt(2));
        newNumber.setCharAt(2, digit1);

        char digit2 = newNumber.charAt(1);
        newNumber.setCharAt(1, newNumber.charAt(3));
        newNumber.setCharAt(3, digit2);

        return Integer.parseInt(newNumber.toString());
    }

    //Entry point of application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = input.nextInt();

        int encryptedNumber = EnforcingPrivacyWithCryptography.encrypt(number);
        int decryptedNumber = EnforcingPrivacyWithCryptography.decrypt(encryptedNumber);
        System.out.printf("Encrypted: %04d\n", encryptedNumber);
        System.out.printf("Decrypted: %04d\n", decryptedNumber);

        input.close();
    }
}