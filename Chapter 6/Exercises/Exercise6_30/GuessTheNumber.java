package Exercise6_30;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static void main() {
        Scanner input = new Scanner(System.in);

        int numberGenerated = 1+new Random().nextInt(1000);
        int guess;

        boolean isFound = false;
        do{
            System.out.print("Enter the number (guess) in 1 to 1000: ");
            guess = input.nextInt();
            if(guess > numberGenerated){
                System.out.println("Too high");
                System.out.println("Try again");
            }else if(guess < numberGenerated ){
                System.out.println("Too low");
                System.out.println("Try again");
            }else{
                System.out.println("Congratulations!. You guessed the number!");
                System.out.print("Do you want to play again? (1 - yes, any other number no):");
                int choice = input.nextInt();
                if(choice == 1){
                    numberGenerated = 1+new Random().nextInt(1000);
                }else{
                    isFound = true;
                    System.out.println("Bye, thanks for guesses!");
                }
            }
        }while (!isFound);
    }
}
