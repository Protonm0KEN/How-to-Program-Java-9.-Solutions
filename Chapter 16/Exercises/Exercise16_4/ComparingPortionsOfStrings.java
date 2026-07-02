package Exercise16_4;

import java.util.Scanner;

public class ComparingPortionsOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        System.out.print("Enter starting index: ");
        int index = input.nextInt();
        System.out.println();
        System.out.print("Enter number of characters: ");
        int numberOfCharacters = input.nextInt();
        System.out.println();

        if (s1.regionMatches(true, index, s2, index, numberOfCharacters))
            System.out.println("Portion of s1 == s2");
        else
            System.out.println("Portion of s1!=s2");


    }
}
