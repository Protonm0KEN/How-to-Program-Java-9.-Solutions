package Exercise7_25;

import java.util.ArrayList;
//This class shows the board where queens would be placed

public class Board {
    //Initial elimination board, such that when the board is blank, where the queen is placed, shows eliminated number of cells
    private final int[][] ELIMINATION_TEMPLATE = {

            {22, 22, 22, 22, 22, 22, 22, 22},

            {22, 24, 24, 24, 24, 24, 24, 22},

            {22, 24, 26, 26, 26, 26, 24, 22},

            {22, 24, 26, 28, 28, 26, 24, 22},

            {22, 24, 26, 28, 28, 26, 24, 22},

            {22, 24, 26, 26, 26, 26, 24, 22},

            {22, 24, 24, 24, 24, 24, 24, 22},

            {22, 22, 22, 22, 22, 22, 22, 22}

    };
    private int numberOfQueensSet = 0;
    private final int EliminationNumberOfFilledCell = 30;
    //Elimination board that will be filled by queens
    private int[][] currentEliminationBoard = new int[8][8];

    Board(){
        //Copy ELIMINATION_TEMPLATE to currentEliminationBoard
        for (int i = 0; i < 8; i++) {currentEliminationBoard[i] = ELIMINATION_TEMPLATE[i].clone();}
    }
    //Choosing the best cell to place the queen by the eliminationNumber
    private int getBestEliminationNumber(){
        /*
            1. We set the best elimination number initially to arbitrarily big number, since we need to choose the cell with minimal elimination number
            2. We traverse the elimination board and set the bestEliminationNumber to cell with least eliminationNumber
        */
        int bestEliminationNumber = Integer.MAX_VALUE;
        for (int[] eliminationNumbers : currentEliminationBoard) {
            for (int eliminationNumber : eliminationNumbers) {
                if (bestEliminationNumber > eliminationNumber) {bestEliminationNumber = eliminationNumber;}
            }
        }
        /*
         * Since even in the template we have max elimination number as 30, so if it is not occupied and tie occurred then we will return the first one
         * TODO: The heurisitic approach should be applied here too, to lookup to next cell after having a tie, choosing recursively the best one
        */
        return bestEliminationNumber != EliminationNumberOfFilledCell ? bestEliminationNumber : 100000;
    }
    //We should get coordinates of cell by elimination number
    private int[] getCoordinatesByEliminationNumber(int bestEliminationNumber) {
        /*
         * We create array candidates to take into account cells with same elimination number
         * Candidate - cell with the elimination number same as bestEliminationNumber
         * We traverse through all the board and find cells with same elimination number as bestEliminationNumber and store them in candidates
        */
        ArrayList<int[]> candidates = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (currentEliminationBoard[i][j] == bestEliminationNumber) {candidates.add(new int[]{i, j});}
            }
        }
        if (candidates.isEmpty()) return null;
        // Pick a random one from the best candidates
        return candidates.get((int) (Math.random() * candidates.size()));
    }
    //Method sets queen at best position
    public void setQueenAtBestPosition(){
        /*We may set the queen only if the board is not filled, so this check is necessary.*/
        if(!checkIfBoardIsFilled()){
            //We get coordinates where we could set the queen.
            int[] coordinatesWhereToSet = getCoordinatesByEliminationNumber(getBestEliminationNumber());
            //In case if there still exists a cell where queen could be set. null - no cell is available.
            // coordinatesWhereToSet represents array with 0 element representing x coordinate and 1 element as y coordinate, like [x,y]
            if(coordinatesWhereToSet !=  null) {
                //setQueen(x,y), where x - x coordinate of new queen to be set, and y - y coordinate of queen to be set
                setQueen(coordinatesWhereToSet[0], coordinatesWhereToSet[1]);
                //After setting the queen we should update the board
                updateBoardAfterQueenWasSet();
                numberOfQueensSet++;
            }
            else {System.out.println("Error occurred when setting the queen");}
        }else{System.out.println("Board is already filled");}
    }
    //Method to set the queen and updating the board, eliminating other cells
    public void setQueen(int queenRow, int queenColumn){
        if(checkPosition(queenRow,queenColumn)){
            //Those statements eliminate cells under a "scope" of the queen that was set
            emptyCellsRow(queenRow);
            emptyCellsColumn(queenColumn);
            emptyCellsMainDiagonal(queenRow, queenColumn);
            emptyCellsSecondaryDiagonal(queenRow, queenColumn);

//            displayBoard();
        }else {System.out.println("Incorrect position of queen");}
    }
    private boolean checkPosition(int row, int column){
        //Checking the position means that row & column of queen to be set should be in range of board, namely in 0-8
        return (row >= 0 && row <= 7) && (column >= 0 && column <= 7);
    }
    private void emptyCellsMainDiagonal(int queenRow, int queenColumn){
        //Emptying main diagonal where queen is located (NW)
        int counterDiagonal = 0;
        while(checkPosition(queenRow - counterDiagonal , queenColumn-counterDiagonal)){
            currentEliminationBoard[queenRow - counterDiagonal][queenColumn-counterDiagonal] = EliminationNumberOfFilledCell;
            counterDiagonal++;
        }
        //Emptying main diagonal where queen is located (SE)
        counterDiagonal = 0;
        while(checkPosition(queenRow + counterDiagonal , queenColumn + counterDiagonal)){
            currentEliminationBoard[queenRow + counterDiagonal][queenColumn+counterDiagonal] = EliminationNumberOfFilledCell;
            counterDiagonal++;
        }
    }
    private void emptyCellsSecondaryDiagonal(int queenRow, int queenColumn){
        int counterDiagonal = 0;
        //Emptying secondary diagonal where queen is located (NE)
        while(checkPosition(queenRow - counterDiagonal , queenColumn+counterDiagonal)){
            currentEliminationBoard[queenRow - counterDiagonal][queenColumn+counterDiagonal] = EliminationNumberOfFilledCell;
            counterDiagonal++;
        }
        counterDiagonal = 0;
        //Emptying secondary diagonal where queen is located (SW)
        while(checkPosition(queenRow + counterDiagonal, queenColumn-counterDiagonal)){
            currentEliminationBoard[queenRow + counterDiagonal][queenColumn-counterDiagonal] = EliminationNumberOfFilledCell;
            counterDiagonal++;
        }
    }

    private void emptyCellsRow(int queenRow){
        //Emptying row where queen is located:
        for(int column = 0; column<8; column++){
            currentEliminationBoard[queenRow][column] = EliminationNumberOfFilledCell; //Value is higher than max elimination number ( 28)
        }
    }
    private void emptyCellsColumn(int queenColumn){
        //Emptying column where queen is located:
        for(int row = 0; row<8; row++){
            currentEliminationBoard[row][queenColumn] = EliminationNumberOfFilledCell; //Value is higher than max elimination number ( 28)
        }
    }
    //Method that updates board after the queen was set, by updating all the other cell's elimination numbers
    private void updateBoardAfterQueenWasSet(){
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(currentEliminationBoard[i][j] != EliminationNumberOfFilledCell){
                    int seenDeadCells = getDeadCellsNumberFromBoardFromUndeadCellsPerspective(i,j);
                    currentEliminationBoard[i][j] = ELIMINATION_TEMPLATE[i][j]-seenDeadCells;
                }
            }
        }
    }
    public boolean checkIfBoardIsFilled(){
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(currentEliminationBoard[i][j] != EliminationNumberOfFilledCell){return false;}
            }
        }
        return true;
    }
    private int getDeadCellsNumberFromBoardFromUndeadCellsPerspective(int cellRow, int cellColumn){
        return getDeadCellsNumberFromCellsPerspectiveByRow(cellRow, cellColumn) +
                getDeadCellsNumberFromCellsPerspectiveByColumn(cellRow, cellColumn)+
                getDeadCellsNumberFromCellsPerspectiveByMainDiagonal(cellRow, cellColumn)+
                getDeadCellsNumberFromCellsPerspectiveBySecondaryDiagonal(cellRow, cellColumn);
    }
    private int getDeadCellsNumberFromCellsPerspectiveByRow(int cellRow, int cellColumn){
        int deadCellsSeenFromPerspective = 0;
        //Check row:
        for(int column = 0; column<8; column++){
            if(column != cellColumn && currentEliminationBoard[cellRow][column] == EliminationNumberOfFilledCell){deadCellsSeenFromPerspective++;}
        }
        return deadCellsSeenFromPerspective;
    }
    private int getDeadCellsNumberFromCellsPerspectiveByColumn(int cellRow, int cellColumn){
        int deadCellsSeenFromPerspective = 0;
        //Check the column:
        for(int row = 0; row<8; row++){
            if(row != cellRow && currentEliminationBoard[row][cellColumn] == EliminationNumberOfFilledCell){deadCellsSeenFromPerspective++;}
        }
        return deadCellsSeenFromPerspective;
    }
    private int getDeadCellsNumberFromCellsPerspectiveByMainDiagonal(int cellRow, int cellColumn){
        int deadCellsSeenFromPerspective = 0;
        int counterDiagonal = 0;
        while(checkPosition(cellRow - counterDiagonal , cellColumn-counterDiagonal)){
            if(currentEliminationBoard[cellRow - counterDiagonal][cellColumn-counterDiagonal] == EliminationNumberOfFilledCell){deadCellsSeenFromPerspective++;}
            counterDiagonal++;
        }
        //Emptying main diagonal where queen is located (SE)
        counterDiagonal = 0;
        while(checkPosition(cellRow + counterDiagonal , cellColumn + counterDiagonal)){
            if(currentEliminationBoard[cellRow + counterDiagonal][cellColumn + counterDiagonal] == EliminationNumberOfFilledCell){deadCellsSeenFromPerspective++;}
            counterDiagonal++;
        }
        return deadCellsSeenFromPerspective;
    }
    private int getDeadCellsNumberFromCellsPerspectiveBySecondaryDiagonal(int cellRow, int cellColumn){
        int deadCellsSeenFromPerspective = 0;
        int counterDiagonal = 0;
        while(checkPosition(cellRow - counterDiagonal , cellColumn + counterDiagonal)){
            if(currentEliminationBoard[cellRow - counterDiagonal][cellColumn + counterDiagonal] == EliminationNumberOfFilledCell){deadCellsSeenFromPerspective++;}
            counterDiagonal++;
        }
        //Emptying main diagonal where queen is located (SE)
        counterDiagonal = 0;
        while(checkPosition(cellRow + counterDiagonal , cellColumn - counterDiagonal)){
            if(currentEliminationBoard[cellRow + counterDiagonal][cellColumn - counterDiagonal] == EliminationNumberOfFilledCell){
                deadCellsSeenFromPerspective++;
            }
            counterDiagonal++;
        }
        return deadCellsSeenFromPerspective;
    }
    //Display the board:
    public void displayBoard(){
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                System.out.print(currentEliminationBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void resetBoard(){
        for(int i = 0; i<8; i++){
            currentEliminationBoard[i] = ELIMINATION_TEMPLATE[i].clone();
        }
        numberOfQueensSet = 0;
    }
    public boolean isBoardFilledWithQueens(){
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(currentEliminationBoard[i][j] != 30){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean canPlaceQueen() {
        // Return true only if there is at least one non-filled square left
        return !checkIfBoardIsFilled();
    }
    private boolean isBoardSolved(){
        return numberOfQueensSet == 8;
    }

    //Solve brute force
    public int solveBruteForce() {
        int numberOfRetries = 0;
        while (!isBoardSolved()) {
            for (int i = 0; i < 8; i++) {
                if (!canPlaceQueen()) {
                    resetBoard();
                    numberOfRetries++;
                    i = -1;
                } else {
                    setQueenAtBestPosition();
                }
            }
        }
        return numberOfRetries;
    }


    //Solve exhaustively
    public boolean solveExhaustive(int row, int numberOfTries){
        /*
        * After placing first queen, we will take first squre that is appropriate for a queen to be placed to,
        * If it is approriate we place the queen, and then go to next queen and so on
        * If the numebr of queens set is not 8 ( board is not solved), we return to the second queen ( first will always be placed on the upper left corner), and place it to next most available cell
        * And try again, if again not solved by the end, put to next cell and so on, and thus we try all combinations and go to the end
        *
        * */
        if(row == 8) {
            System.out.println("Number of tries: " + numberOfTries);
            return true;
        }

        for(int col = 0; col<8; col++){
            if(checkPosition(row, col)){
                int[][] copyOfBoard = copyBoard(currentEliminationBoard);
                setQueen(row,col);
                if(solveExhaustive(row + 1, numberOfTries+1)){
                    System.out.println("Number of tries: " + numberOfTries);
                    return true;
                }
                currentEliminationBoard = copyOfBoard;
            }
        }
        return false;

    }
    private int[][] copyBoard(int[][] board) {
        int[][] copy = new int[board.length][];
        for (int i = 0; i < board.length; i++) {
            copy[i] = board[i].clone();
        }
        return copy;
    }

//    boolean solveQueensRecursive(int queensPlaced){
//        //Success check
//        if (queensPlaced == 8) return true;
//        //Identify candidates (Best elimination number)
//        ArrayList<int[]> candidatePath = new ArrayList<int[]>();
//        int bestEliminationNumber = getBestEliminationNumber();
//        for(int i = 0; i<8; i++){
//            for(int j = 0; j<8; j++){
//                if(currentEliminationBoard[i][j] == bestEliminationNumber){
//                    candidatePath.add(new int[]{i,j});
//                }
//            }
//        }
//        if (candidatePath.isEmpty()) return false;
//        //Loop through candidates to test them
//        for (int[] candidate : candidatePath) {
//            //Snapshot the current board state
//            int[][] backupBoard = copyBoard(currentEliminationBoard);
//            //Apply move (Pseudo-place queen)
//            setQueen(candidate[0], candidate[1]);
//            updateBoardAfterQueenWasSet();
//            //Recursive Leap
//            if (solveQueensRecursive(queensPlaced + 1)) {return true; //Found a winning path!
//            }
//            //Backtrack (The "Undo" button)
//            currentEliminationBoard = backupBoard;
//        }
//        // 4. If all candidates failed
//        return false;
//    }
//    private int[][] copyBoard(int[][] board) {
//        int[][] copy = new int[board.length][];
//        for (int i = 0; i < board.length; i++) {
//            copy[i] = board[i].clone();
//        }
//        return copy;
//    }
}