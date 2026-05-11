package Exercise7_22.c_AccessibilityHeuristic;

import java.util.Arrays;

public class Knight {

    Knight(int currentRow, int currentColumn, int[][] board, int[][] accessibilityOfBoard){
        this.currentRow = currentRow;
        this.currentColumn = currentColumn;
        referenceToBoard = board;
        referenceToAccessibilityOfBoard = accessibilityOfBoard;

        updatePossibleMoveTypes();
        updateAccessibilityOfPotentialCellsToMove();
    }
    // currentRow and currentColumn represents current position of knight on the board
    int currentRow;
    int currentColumn;

    int numberOfMovesMade = 1; //Variable to track number of moves made by knight

    //Components with which knight can move
    int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    //Possible move types stored in array
    boolean[] possibleMoveTypes = new boolean[8];

    //Knight should now information about the board, to know whether the cell is occupied
    int[][] referenceToBoard;
    int[][] referenceToAccessibilityOfBoard;


    //Cell 0(Type 0 move), Cell 1(Type 1 move) ....
    int[] accessibilityOfPotentialCellsToMove = new int[8];








    public void reduceNeighborhoodAccessibility() {
        for(int i = 0; i < 8; i++) {
            int targetR = currentRow + horizontal[i];
            int targetC = currentColumn + vertical[i];
            if(isNewRowPositionValid(targetR) && isNewColumnPositionValid(targetC)) {
                referenceToAccessibilityOfBoard[targetR][targetC]--;
            }
        }
    }

    public void updateAccessibilityOfPotentialCellsToMove(){
        for(int i = 0; i<8; i++){
            if(possibleMoveTypes[i]){
                accessibilityOfPotentialCellsToMove[i] = referenceToAccessibilityOfBoard[currentRow+horizontal[i]][currentColumn+vertical[i]];
            }else{
                accessibilityOfPotentialCellsToMove[i] = 10;
            }
        }
    }
    public int getBestMoveTypeByAccessibility(){
        int smallestAccessibilityCellMoveType = 10;
        int index = 0;
        for(int i =0; i<8; i++){
            if(accessibilityOfPotentialCellsToMove[i] < smallestAccessibilityCellMoveType){
                smallestAccessibilityCellMoveType = accessibilityOfPotentialCellsToMove[i];
                index = i;
            }
        }
        return index;
    }
    private void updatePossibleMoveTypes(){
        for(int i = 0; i<8; i++){
            int newPotentialRow = currentRow + horizontal[i];
            int newPotentialColumn = currentColumn + vertical[i];
            if(isNewRowPositionValid(newPotentialRow) && isNewColumnPositionValid(newPotentialColumn) && !isCellVisited(newPotentialRow, newPotentialColumn, referenceToBoard) ){
                possibleMoveTypes[i] = true;
            }else{
                possibleMoveTypes[i] = false;
            }
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
    public boolean isNewRowPositionValid(int newRowProposed){
        return newRowProposed >= 0 && newRowProposed <= 7;
    }
    public boolean isNewColumnPositionValid(int newColumnProposed){
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
    public boolean isCellVisited(int row, int column, int[][] board){
        return board[row][column] != -1;
    }
    public boolean isMoveTypeNumberValid(int moveTypeNumber){
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


}
