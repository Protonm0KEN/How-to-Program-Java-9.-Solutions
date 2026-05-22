package Exercise7_23.a;

import java.util.Arrays;

public class Board {
    int board[][] = new int[8][8];
    Board(){
        for (int[] ints : board) {
            Arrays.fill(ints, -1);
        }
    }
    public void setCell(int row, int column, int number){board[row][column] = number;}
    public int[][] getBoard(){
        return board;
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
        for (int[] ints : board) {
            Arrays.fill(ints, -1);
        }
    }
}
