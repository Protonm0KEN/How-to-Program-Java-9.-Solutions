package Exercise7_25;

public class BoardTest {
    static void main() {
        Board chessBoard = new Board();
        int N = 1_000_000;
        int maxNumberOfTries = Integer.MIN_VALUE;
        int minNumberOfTries = Integer.MAX_VALUE;

        long startTime = System.currentTimeMillis();

        for(int i = 0; i<N; i++){
            int numberOfTries = chessBoard.solveBruteForce();
            if(numberOfTries > maxNumberOfTries){
                maxNumberOfTries = numberOfTries;
            }
            if(numberOfTries < minNumberOfTries){
                minNumberOfTries = numberOfTries;
            }
            chessBoard.resetBoard();

            if (i % 10000 == 0 && i > 0) {
                long currentTime = System.currentTimeMillis();
                long elapsed = currentTime - startTime;

                // Calculate average time per iteration
                double avgTimePerIteration = (double) elapsed / i;
                long remainingIterations = N - i;
                long estimatedRemainingTime = (long) (avgTimePerIteration * remainingIterations);

                double progress = (double) i / N * 100;

                System.out.printf("Progress: %.2f%% | Estimated time remaining: %d seconds%n",
                        progress, (estimatedRemainingTime / 1000));
            }

        }
        System.out.println("Max number of tries to get solved: " + maxNumberOfTries);
        System.out.println("Min number of tries to get solved: " + minNumberOfTries);
        chessBoard.resetBoard();
        chessBoard.solveExhaustive(0,0);
        chessBoard.displayBoard();

    }
}
