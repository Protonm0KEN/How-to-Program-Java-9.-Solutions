package Exercise7_17;

public class DiceRollingTest {
    static void main() {
        DiceRolling diceRollingObj = new DiceRolling();
        int N = 36_000_000;
        diceRollingObj.rollNTimes(N);
        for(int i = 2; i<=12; i++){
            double chance = (double) diceRollingObj.frequencies[i] /N * 100;
            System.out.println("----------------------------------");
            System.out.printf("Frequency of %d: %d\n", i, diceRollingObj.frequencies[i]);
            System.out.printf("Chance of dropping %f %% \n", chance);
            System.out.println("----------------------------------\n");
        }
    }
}
