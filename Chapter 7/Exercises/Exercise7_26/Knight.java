package Exercise7_26;

import java.util.Arrays;
import java.util.Random;

public class Knight {


    //This constructor will put the first knight onto the board and update it
    Knight(int initialStartRow, int initialStartColumn, int[][] board, int[][] accessibilityOfBoard){
        this.initialStartRow = initialStartRow;
        this.initialStartColumn = initialStartColumn;
        this.currentRow = initialStartRow;
        this.currentColumn = initialStartColumn;

        referenceToBoard = board;
        referenceToAccessibilityOfBoard = accessibilityOfBoard;
        numberOfMovesMade = 1;

        updatePossibleMoveTypes();
        updateAccessibilityOfPotentialCellsToMove();
    }
    private int initialStartRow;
    private int initialStartColumn;
    // currentRow and currentColumn represents current position of knight on the board
    private int currentRow;
    private int currentColumn;

    private int numberOfMovesMade; //Variable to track number of moves made by knight

    //Components with which knight can move
    private final int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    private final int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    //Possible move types stored in array
    private final boolean[] possibleMoveTypes = new boolean[8];

    //Knight should now information about the board, to know whether the cell is occupied
    private final int[][] referenceToBoard;
    private final int[][] referenceToAccessibilityOfBoard;


    //Cell 0(Type 0 move), Cell 1(Type 1 move) ....
    private final int[] accessibilityOfPotentialCellsToMove = new int[8];


    //This will reduce accessibility of all the cells, after placing the knight
    public void reduceNeighborhoodAccessibility() {
        for(int i = 0; i < 8; i++) {
            //The knight will lookup to cells that is under it's "scope" and will reduce their accessibility ( if the position of the looked up cell is valid ofc)
            int targetRow = currentRow + horizontal[i];
            int targetColumn = currentColumn + vertical[i];
            if(isNewRowPositionValid(targetRow) && isNewColumnPositionValid(targetColumn)) {
                referenceToAccessibilityOfBoard[targetRow][targetColumn]--;
            }
        }
    }


    //Updating the board
    private void updateAccessibilityOfPotentialCellsToMove(){
        for(int i = 0; i<8; i++){
            //After updating accessibility we will update current's knight possible move types
            if(possibleMoveTypes[i]){
                accessibilityOfPotentialCellsToMove[i] = referenceToAccessibilityOfBoard[currentRow+horizontal[i]][currentColumn+vertical[i]];
            }else{
                accessibilityOfPotentialCellsToMove[i] = 10;
            }
        }
    }

    public int getBestMoveTypeByAccessibility(){
        int smallestValue = 11;
        int bestMoveIndexType = -1;

        int tieCount = 0;//How many candidates during the tie
        Random random = new Random();

        for (int i = 0; i < 8; i++) {

            //If Move is even possible, then we work further.
            if (possibleMoveTypes[i]) {

                //Cell under scope of knight and it's accessibility
                int accessibilityOfPotentialCell = accessibilityOfPotentialCellsToMove[i];

                //If accessibilityOfPotentialCell to move is less than smallest value we found, then we can should focus more on this new cell
                if (accessibilityOfPotentialCell < smallestValue) {
                    // New clear winner
                    smallestValue = accessibilityOfPotentialCell;
                    bestMoveIndexType = i;
                    tieCount = 1;
                } else if (accessibilityOfPotentialCell == smallestValue) {
                    tieCount++;
                    if (random.nextInt(tieCount) == 0) {
                        bestMoveIndexType = i;
                    }
                }
            }
        }
        return bestMoveIndexType;
    }

    private void updatePossibleMoveTypes(){
        for(int i = 0; i<8; i++){
            int newPotentialRow = currentRow + horizontal[i];
            int newPotentialColumn = currentColumn + vertical[i];
            possibleMoveTypes[i] = isNewRowPositionValid(newPotentialRow) && isNewColumnPositionValid(newPotentialColumn) && !isCellVisited(newPotentialRow, newPotentialColumn, referenceToBoard);
        }
    }
    public void move(int moveTypeNumber){
        if(isMoveTypeNumberValid(moveTypeNumber)) {
            currentRow += horizontal[moveTypeNumber];
            currentColumn += vertical[moveTypeNumber];

            updatePossibleMoveTypes();
            updateAccessibilityOfPotentialCellsToMove();
            reduceNeighborhoodAccessibility();
            numberOfMovesMade++;
//            System.out.printf("\nCurrent position of knight: \n Row: %d \n Column: %d\n Move: %d\n", getCurrentRow(), getCurrentColumn(), numberOfMovesMade);
        }else{
            System.out.println("This type of move is not possible");
        }
    }
    private boolean isNewRowPositionValid(int newRowProposed){
        return newRowProposed >= 0 && newRowProposed <= 7;
    }
    private boolean isNewColumnPositionValid(int newColumnProposed){
        return newColumnProposed >= 0 && newColumnProposed <=7;
    }
    public boolean areTherePossibleMoves(){
        for(boolean possibleMoveType : possibleMoveTypes){
            if(possibleMoveType){
                return true;
            }
        }
        return false;
    }
    private boolean isCellVisited(int row, int column, int[][] board){
        return board[row][column] != -1;
    }
    private boolean isMoveTypeNumberValid(int moveTypeNumber){
        return possibleMoveTypes[moveTypeNumber];
    }


    public int getCurrentRow() {return currentRow;}
    public int getCurrentColumn() {return currentColumn;}
    public int getNumberOfMovesMade() {return numberOfMovesMade;}

    public void setCurrentRow(int currentRow) {this.currentRow = currentRow;}
    public void setCurrentColumn(int currentColumn) {this.currentColumn = currentColumn;}
    public void setNumberOfMovesMade(int numberOfMovesMade) {this.numberOfMovesMade = numberOfMovesMade;}

    public void resetKnight(int startRow, int startCol) {
        this.currentRow = startRow;
        this.currentColumn = startCol;
        this.numberOfMovesMade = 1;

        // Clear the internal decision arrays
        Arrays.fill(possibleMoveTypes, false);
        Arrays.fill(accessibilityOfPotentialCellsToMove, 0);

        // Very Important: Now that the board is reset,
        // the knight needs to "look around" again.
        updatePossibleMoveTypes();
        updateAccessibilityOfPotentialCellsToMove();
    }

    public boolean isClosedTour(int startRow, int startCol) {
        for (int i = 0; i < 8; i++) {
            int targetRow = this.currentRow + horizontal[i];
            int targetCol = this.currentColumn + vertical[i];

            // If one of these moves matches the start position, it's a closed tour
            if (targetRow == startRow && targetCol == startCol) {
                System.out.println("Yes it is closed tour");
                return true;
            }
        }
        System.out.println("No it is not a closed tour");
        return false;
    }
}
