package Exercise7_23.a;

import java.util.Random;

public class KnightTourTest {
    static public void main(String[] args){
        Board chessBoard = new Board();
        Knight knight = new Knight(chessBoard.getBoard());

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
            while(knight.areTherePossibleMoves()){
                int randomMoveTypeNumber = randomObj.nextInt(8);
                while(!knight.isMoveTypeNumberValid(randomMoveTypeNumber)){
                    randomMoveTypeNumber = randomObj.nextInt(8);
                }
                knight.move(randomMoveTypeNumber);
                chessBoard.setCell(knight.getCurrentRow(), knight.getCurrentColumn(), knight.getNumberOfMovesMade());
            }
            chessBoard.displayBoard();
            chessBoard.resetBoard();
            knight.resetKnight();

    }
}
