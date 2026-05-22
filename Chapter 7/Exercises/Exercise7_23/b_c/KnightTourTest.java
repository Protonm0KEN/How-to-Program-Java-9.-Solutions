package Exercise7_23.b_c;

import java.util.Random;

public class KnightTourTest {
    static public void main(String[] args){
        Board chessBoard = new Board();
        Knight knight = new Knight(chessBoard.getBoard());

        int[] frequencies = new int[64];

        /*
        *
        * Write an application to move the knight around the chessboard.
        * Keep a counter that varies from 1 to 64.
        * Record the latest count in each square the knight moves to.
        * Test each potential move to see if the knight has already visited that square.
        * Test every potential move to ensure that the knight does not land off the chessboard.
        * Run the application. How many moves did the knight make?*/

        //I think good idea for knight to move is to make some randomizer to choose the "moveType"
        Random randomObj = new Random();
        int maxNumberOfMoves = 0;
        int count = 0;
        while(maxNumberOfMoves != 64){
            while(knight.areTherePossibleMoves()){
                int randomMoveTypeNumber = randomObj.nextInt(8);
                while(!knight.isMoveTypeNumberValid(randomMoveTypeNumber)){
                    randomMoveTypeNumber = randomObj.nextInt(8);
                }
                knight.move(randomMoveTypeNumber);
                chessBoard.setCell(knight.getCurrentRow(), knight.getCurrentColumn(), knight.getNumberOfMovesMade());
            }
            if(knight.getNumberOfMovesMade() < 64){
                frequencies[knight.getNumberOfMovesMade()]++;
            }else{
                frequencies[63]++;
            }
            if(knight.getNumberOfMovesMade() > maxNumberOfMoves){
                maxNumberOfMoves = knight.getNumberOfMovesMade();
            }
//            if(maxNumberOfMoves == 64){
//                chessBoard.displayBoard();
//                System.out.println();
//                System.out.println("Number of runs to get perfect all cells: " + count);
//                break;
//            }
            System.out.println("Number of moves made: " + knight.getNumberOfMovesMade());
            chessBoard.resetBoard();
            knight.resetKnight();
            count++;
        }
        System.out.println("Number of tours made: " + count);

        for(int i = 0; i<frequencies.length; i++){
            System.out.printf("Number of moves: %d, frequency: %d\n", i, frequencies[i]);
        }

        System.out.println("Max number of moves made:" + maxNumberOfMoves);

    }
}
