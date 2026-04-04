package Exercise7_11;

public class Main {
    static void main() {
        int[] counts = new int[10]; //a) Set the 10 elements of integer array counts to zero.
        int[] bonus = new int[15];
        for(int i = 0; i<bonus.length; i++) bonus[i]++; //b) Add one to each of the 15 elements of integer array bonus.
        int[] bestScores = new int[5];
        for(int i = 0; i<bestScores.length; i++){
            System.out.println(bestScores[i]);//c) Display the five values of integer array bestScores in column format.
        }
    }
}
