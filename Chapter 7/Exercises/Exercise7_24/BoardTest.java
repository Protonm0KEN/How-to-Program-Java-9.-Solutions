package Exercise7_24;

public class BoardTest {
    static void main() {
        Board chessBoard = new Board();
        if (chessBoard.solveQueensRecursive(0)) {
            System.out.println("Solution found!");
            chessBoard.displayBoard();
        } else {
            System.out.println("No solution exists.");
        }

    }
}
