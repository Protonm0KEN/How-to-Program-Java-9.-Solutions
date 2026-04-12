package Exercise7_17;

import java.util.Random;

public class DiceRolling {
    public Random random = new Random();
    int die1Value;
    int die2Value;
    int sumOfDices;

    int[] frequencies = new int[13];
    DiceRolling(){
        rollDice();
    }
    public void rollDice(){
        die1Value = 1+random.nextInt(6);
        die2Value = 1+random.nextInt(6);
        sumOfDices = die1Value+die2Value;
    }
    public void rollNTimes(int N){
        for(int i = 1; i<=N; i++){
            rollDice();
            frequencies[sumOfDices]++;
        }
    }


}

