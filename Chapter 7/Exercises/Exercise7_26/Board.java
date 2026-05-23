package Exercise7_26;

import java.util.Arrays;

public class Board {

    //Board that will store all accessibility of all knights
    int[][] board = new int[8][8];

    //Accessibility template to revert the board back
    private static final int[][] ACCESSIBILITY_TEMPLATE = {
            {2, 3, 4, 4, 4, 4, 3, 2},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {4, 6, 8, 8, 8, 8, 6, 4},
            {3, 4, 6, 6, 6, 6, 4, 3},
            {2, 3, 4, 4, 4, 4, 3, 2}
    };


    int[][] accessibilityOfBoard = {
            {2,3,4,4,4,4,3,2},
            {3,4,6,6,6,6,4,3},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {4,6,8,8,8,8,6,4},
            {3,4,6,6,6,6,4,3},
            {2,3,4,4,4,4,3,2},
    };

    //Initially the board should be not filled
    Board(){
        for (int[] row : board) {
            Arrays.fill(row, -1);
        }
    }

    //Display the board to see the moves made:
    public void displayBoard(){
        for(int i = 0; i<=7; i++){
            for(int j = 0; j<=7; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

    //Reset the board
    public void resetBoard(){
        for (int[] row : board) {
            Arrays.fill(row, -1);
        }
    }
    public void resetAccessibility() {
        for (int i = 0; i < 8; i++) {
            System.arraycopy(ACCESSIBILITY_TEMPLATE[i], 0, accessibilityOfBoard[i], 0, 8);
        }
    }


    public void setCell(int row, int column, int number){
        board[row][column] = number;
    }
    public int[][] getBoard(){
        return board;
    }
    public int[][] getAccessibilityOfBoard() {
        return accessibilityOfBoard;
    }
}
