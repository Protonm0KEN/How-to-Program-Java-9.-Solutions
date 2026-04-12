package Exercise7_18;

import java.util.Random;
import java.util.Scanner;

public class GameOfCraps {
    private static final Random randomNumbers = new Random();

    private enum Status { CONTINUE, WON, LOST};

    private static final int SNAKE_EYS = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    private static int bankBalance;

    public static String getRandomMessage(){
        String str1 = "Oh,you are going for broke, huh?";
        String str2 = "Aw, c'mon take a chance!";
        String str3 = "You are up a big. Now's the time to cash in your chips";

        int randomString = 1+randomNumbers.nextInt(3);

        if(randomString == 1){
            return str1;
        }else if(randomString == 2){
            return str2;
        }else{
            return str3;
        }
    }

    public static int rollDice(){

        int die1 = 1+randomNumbers.nextInt(6);
        int die2 = 1+randomNumbers.nextInt(6);

        int sum = die1+die2;

        System.out.println(getRandomMessage());
        System.out.printf("Player rolled %d+%d = %d\n", die1,die2,sum);

        return sum;
    }

    static void main() {

        Scanner input = new Scanner(System.in);
        int wager;
        do{
            System.out.print("Enter the wager: ");
            wager = input.nextInt();
            if(wager>bankBalance){
                System.out.printf("Enter wager less than %d\n", bankBalance);
            }
        }while(wager<=bankBalance);

        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();
        switch(sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYS:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d\n", myPoint);
                break;
        }

        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint){
                gameStatus = Status.WON;
            } else if (sumOfDice == SEVEN){
                gameStatus = Status.LOST;
            }
        }

        if(gameStatus == Status.WON){
            System.out.println("Player wins");
            bankBalance+=wager;
            System.out.println("New balance: " + bankBalance);
        }else{
            System.out.println("Player lost");
            bankBalance-=wager;
            if(bankBalance >0){
                System.out.println("New balance: " + bankBalance);
            }else{
                System.out.println("Sorry.You busted!");
            }
        }
    }
}
