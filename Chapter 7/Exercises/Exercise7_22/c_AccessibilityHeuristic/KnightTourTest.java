package Exercise7_22.c_AccessibilityHeuristic;

import java.util.Random;

public class KnightTourTest {
    static public void main(String[] args){
        Board chessBoard = new Board();
        Knight knight = new Knight(0, 0, chessBoard.getBoard(), chessBoard.getAccessibilityOfBoard());

        /*
        *
        * Write an application to move the knight around the chessboard.
        * Keep a counter that varies from 1 to 64.
        * Record the latest count in each square the knight moves to.
        * Test each potential move to see if the knight has already visited that square.
        * Test every potential move to ensure that the knight does not land off the chessboard.
        * Run the application. How many moves did the knight make?*/
        int count = 1;
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                chessBoard.resetBoard();
                chessBoard.resetAccessibility();

                knight.resetKnight(i, j);
                chessBoard.setCell(i, j, knight.getNumberOfMovesMade());
                knight.reduceNeighborhoodAccessibility();
                while(knight.areTherePossibleMoves()){
                    knight.move(knight.getBestMoveTypeByAccessibility());
                    chessBoard.setCell(knight.getCurrentRow(), knight.getCurrentColumn(), knight.getNumberOfMovesMade());
                }
                System.out.println("Try: " + count);
                chessBoard.displayBoard();
                count++;
            }
        }

    }
}
