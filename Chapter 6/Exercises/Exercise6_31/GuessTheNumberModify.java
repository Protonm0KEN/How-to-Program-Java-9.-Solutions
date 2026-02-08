package Exercise6_31;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberModify {
    static void main() {
        Scanner input = new Scanner(System.in);

        int numberGenerated = 1+new Random().nextInt(1000);
        int guess;

        int numberOfTries = 0;
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
                    if(numberOfTries < 10){
                        System.out.println("Either you know the secret or you are lucky!");
                    }else if(numberOfTries == 10){
                        System.out.println("You know the secret!");
                    }else{
                        System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
                    }
                    System.out.println("Bye, thanks for guesses!");
                }
            }
            numberOfTries++;
        }while (!isFound);
    }
}
