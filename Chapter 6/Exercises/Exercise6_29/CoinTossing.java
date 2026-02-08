package Exercise6_29;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    public static Random random = new Random();
    public  enum Coin {HEADS, TAILS};
    public static Coin flip(){
        Coin side;

        int number = random.nextInt(2);

        if(number==0){
            side = Coin.HEADS;
        }else side = Coin.TAILS;
        return side;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choiceOfUser;

        int counterHeads = 0, counterTails = 0;
//        do{
//            System.out.print("Write 1 to toss the coin and any other number to exit: ");
//
//            choiceOfUser = input.nextInt();
//
//            if(choiceOfUser == 1){
//                Coin sideOfCoin = CoinTossing.flip();
//
//                if(sideOfCoin == Coin.HEADS){
//                    counterHeads++;
//                }else{
//                    counterTails++;
//                }
//            }
//        }while (choiceOfUser == 1);
        for(int j = 1; j<=10; j++){
            for(int i = 1; i<=1000000000; i++){
                Coin sideOfCoin = CoinTossing.flip();

                if(sideOfCoin == Coin.HEADS){
                    counterHeads++;
                }else{
                    counterTails++;
                }
            }
        }

        System.out.println("Heads: " + counterHeads + " Tails: " + counterTails);
    }
}
