package Exercise7_21;


import java.util.Objects;

class Turtle{
    String faceDirection;
    boolean isMoving;

    int x;
    int y;

    Turtle(){
        faceDirection = "RIGHT";
    }
    Turtle(String initialDirection, int x, int y){
        faceDirection = initialDirection;
        this.x = x;
        this.y = y;
    }

    public String getFaceDirection() {
        return faceDirection;
    }
    public void setFaceDirection(String faceDirection) {
        this.faceDirection = faceDirection;
    }

    public void setIsMoving(boolean moving) {
        isMoving = moving;
    }
    public boolean getIsMoving(){
        return isMoving;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnRight(){
        switch (faceDirection) {
            case "RIGHT" -> faceDirection = "DOWN";
            case "LEFT" -> faceDirection = "UP";
            case "UP" -> faceDirection = "RIGHT";
            case null, default -> faceDirection = "LEFT";
        }
    }
    public void turnLeft(){
        switch (faceDirection) {
            case "RIGHT" -> faceDirection = "UP";
            case "LEFT" -> faceDirection = "DOWN";
            case "UP" -> faceDirection = "LEFT";
            case null, default -> faceDirection = "RIGHT";
        }
    }
}

public class TurtleGraphics {
    boolean[][] board = new boolean[20][20]; //20 by 20 board, where false means not drawn cell
    private Turtle turtle = new Turtle();
    public TurtleGraphics(String initialDirection, int x, int y){
        turtle = new Turtle(initialDirection, x, y);
    }
    public void displayBoard() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] ? "* " : "  ");
            }
            System.out.println();
        }
    }
    public void drawBoard(int numberOfCellsToMove){
        switch(turtle.getFaceDirection()){
            case "UP":
                for(int i = 0; i<numberOfCellsToMove; i++){
                    if( turtle.getY()-1 >= 0  ){
                        board[turtle.getY()][turtle.getX()] = true;
                        turtle.setY(turtle.getY()-1);
                    }
                }
                break;
            case "DOWN":
                for(int i = 0; i<numberOfCellsToMove; i++){
                    if( turtle.getY()+1 < board.length  ){
                        board[turtle.getY()][turtle.getX()] = true;
                        turtle.setY(turtle.getY()+1);
                    }
                }
                break;
            case "LEFT":
                for(int i = 0; i<numberOfCellsToMove; i++){
                    if( turtle.getX()-1 >=0  ){
                        board[turtle.getY()][turtle.getX()] = true;
                        turtle.setX(turtle.getX()-1);
                    }
                }
                break;
            case "RIGHT":
                for(int i = 0; i<numberOfCellsToMove; i++){
                    if( turtle.getX()+1 <board[0].length  ){
                        board[turtle.getY()][turtle.getX()] = true;
                        turtle.setX(turtle.getX()+1);
                    }
                }
                break;
        }
        board[turtle.getY()][turtle.getX()] = true;
    }
    public void processCommands(int[] commands){
        for(int i = 0; i<commands.length; i++){
            switch(commands[i]){
                case 1:
                    turtle.setFaceDirection("UP");
                    break;
                case 2:
                    turtle.setFaceDirection("DOWN");
                    break;
                case 3:
                    turtle.turnRight();
                    break;
                case 4:
                    turtle.turnLeft();
                    break;
                case 5:
                    if (i + 1 < commands.length) {
                        drawBoard(commands[++i]);
                    }
                    break;
                case 6:
                    displayBoard();
                    break;
                case 9:
                    break;
                default:
                    break;

            }
        }
    }
    static public void main(String[] args) {
        // Start at (5, 5) and face RIGHT to ensure we have room to draw
        TurtleGraphics turtleGraphics = new TurtleGraphics("RIGHT", 5, 5);

        int[] commands = {
                5, 9, // Move Right 9 cells (reaches col 14)
                3,    // Turn Right (now facing DOWN)
                5, 9, // Move Down 9 cells (reaches row 14)
                3,    // Turn Right (now facing LEFT)
                5, 9, // Move Left 9 cells (reaches col 5)
                3,    // Turn Right (now facing UP)
                5, 9, // Move Up 9 cells (returns to row 5)
                6,    // Display the board
                9     // End of data
        };

        turtleGraphics.processCommands(commands);
    }
}
