package Exercise7_22;

public class Knight {
    int currentRow;
    int currentColumn;

    int numberOfMoves;

    int[] horizontal = {2,1,-1,-2,-2,-1,1,2};
    int[] vertical = {-1,-2,-2,-1,1,2,2,1};

    public void move(int moveNumber){
        currentRow += horizontal[moveNumber];
        currentColumn += vertical[moveNumber];
    }

    public int getCurrentRow() {return currentRow;}
    public int getCurrentColumn() {return currentColumn;}
    public int getNumberOfMoves() {return numberOfMoves;}

    public void setCurrentRow(int currentRow) {this.currentRow = currentRow;}
    public void setCurrentColumn(int currentColumn) {this.currentColumn = currentColumn;}
    public void setNumberOfMoves(int numberOfMoves) {this.numberOfMoves = numberOfMoves;}



}
