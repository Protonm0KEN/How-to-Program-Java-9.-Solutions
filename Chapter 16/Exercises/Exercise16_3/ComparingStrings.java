package Exercise16_3;

import java.util.Scanner;

public class ComparingStrings {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter please string 1: ");
        String s1 = input.nextLine();
        System.out.print("Enter please string 2: ");
        String s2 = input.nextLine();


        int result = s1.compareTo(s2);
        if(result > 0) {
            System.out.println("First string is greater than second one");
        } else if ( result == 0) {
            System.out.println("Both strings are equal lexicographically");
        } else{
            System.out.println("Second string is greater than first one");
        }
    }
}
