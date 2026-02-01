package Exercise6_21;

import java.util.Scanner;

public class SeparatingDigitsTest {
    public static void displayDigits(int number){
        String numberAsString = "";
        while(number != 0){
            numberAsString += SeparatingDigits.remainderInt(number, 10);
            number = SeparatingDigits.divideInt(number, 10);
        }
        //Now we should reverse the string version of the number
        for(int i = numberAsString.length()-1; i>=0; i--){
            System.out.print(numberAsString.charAt(i)+" ");
        }

        System.out.println();
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number that is to be displayed: ");
        int number = input.nextInt();

        displayDigits(number);
    }
}
