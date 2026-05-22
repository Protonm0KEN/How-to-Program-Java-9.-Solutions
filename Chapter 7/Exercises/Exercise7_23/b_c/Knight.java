package Exercise7_23.b_c;

public class Knight {

    Knight(int[][] board){
        referrenceToBoard = board;
        updatePossibleMoveTypes();
    }
    // currentRow and currentColumn represents current position of knight on the board
    int currentRow;
    int currentColumn;

    int numberOfMovesMade = 0; //Variable to track number of moves made by knight

    //Components with which knight can move
    int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    //Possible move types stored in array
    boolean[] possibleMoveTypes = new boolean[8];

    //Knight should now information about the board, to know whether the cell is occupied
    int[][] referrenceToBoard;




    public void move(int moveTypeNumber){
        if(isMoveTypeNumberValid(moveTypeNumber)) {
            currentRow += horizontal[moveTypeNumber];
            currentColumn += vertical[moveTypeNumber];

            updatePossibleMoveTypes();

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

    public int getCurrentRow() {return currentRow;}
    public int getCurrentColumn() {return currentColumn;}
    public int getNumberOfMovesMade() {return numberOfMovesMade;}

    public void setCurrentRow(int currentRow) {this.currentRow = currentRow;}
    public void setCurrentColumn(int currentColumn) {this.currentColumn = currentColumn;}
    public void setNumberOfMovesMade(int numberOfMovesMade) {this.numberOfMovesMade = numberOfMovesMade;}

    private void updatePossibleMoveTypes(){
        for(int i = 0; i<8; i++){
            int newPotentialRow = currentRow + horizontal[i];
            int newPotentialColumn = currentColumn + vertical[i];
            if(isNewRowPositionValid(newPotentialRow) && isNewColumnPositionValid(newPotentialColumn) && !isCellVisited(newPotentialRow, newPotentialColumn, referrenceToBoard) ){
                possibleMoveTypes[i] = true;
            }else{
                possibleMoveTypes[i] = false;
            }
        }
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

    public void resetKnight(){
        currentColumn = 0;
        currentRow = 0;
        numberOfMovesMade = 0;
        possibleMoveTypes = new boolean[8];
        updatePossibleMoveTypes();
    }


}
