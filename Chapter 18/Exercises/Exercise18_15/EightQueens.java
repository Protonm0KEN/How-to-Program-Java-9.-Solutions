package Exercise18_15;

import java.util.Arrays;

public class EightQueens {
    private static final int[][] initialChessBoard = {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
    };
    private static void setQueen( int[][] chessBoard, int xCoordinate, int yCoordinate ) {
        if( isQueenSettable(chessBoard,xCoordinate,yCoordinate) ) {
            chessBoard[xCoordinate][yCoordinate] = 1;
        }
    }
    private static boolean isQueenSettable( int[][] chessBoard, int xCoordinate, int yCoordinate ) {
        for( int column = yCoordinate-1; column>= 0; column--){
            if(chessBoard[xCoordinate][column] != 0) {
                return false;
            }
        }
        for( int row = xCoordinate - 1, column = yCoordinate-1; row >= 0 && column >= 0; row--, column-- ) {
            if( chessBoard[row][column] == 1 ) {
                return false;
            }
        }
        for( int row = xCoordinate + 1, column = yCoordinate -1; row < 8 && column >= 0; row++, column-- ) {
            if( chessBoard[row][column] == 1 ) {
                return false;
            }
        }
        return true;
    }
    private static int doesColumnHavePlace( int[][] chessBoard, int column ) {
        for( int row = 0; row < chessBoard.length; row++ ) {
            if( chessBoard[row][column] == 0 ){
                return row;
            }
        }
        return -1;
    }
    public static boolean solveEightQueens( int[][] chessBoard, int column ) {
        if( column == 8 ) {
            return true;
        }
            for( int newRow = 0; newRow < 8; newRow++ ) {
                if( isQueenSettable( chessBoard, newRow, column ) ) {
                    chessBoard[newRow][column] = 1;
                    if(solveEightQueens(chessBoard, column + 1)) {
                        return true;
                    }
                    chessBoard[newRow][column] = 0;
                }
            }

        return false;
    }
    public static void main( String[] args ) {
        if (solveEightQueens(initialChessBoard, 0)) {
            System.out.println("Solution found:");
            for (int[] row : initialChessBoard) {
                for (int cell : row) {
                    System.out.print(cell == 1 ? "Q " : ". ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists.");
        }
    }
}
