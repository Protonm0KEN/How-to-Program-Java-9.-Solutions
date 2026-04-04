package Exercise7_9;

public class Main {
    static void main() {
        int[][] t = new int[2][3];
        for(int i = 0; i<t.length; i++){
            for(int j = 0; j<t[i].length; j++){
                t[i][j] = i+j;
            }
        }
        for(int i = 0; i<t[0].length; i++){
            System.out.printf("\t\tColumn %d\t", i);
        }
        System.out.println();
        for(int i = 0; i<t.length; i++){
            System.out.printf("Row %d", i);
            for(int j = 0; j<t[i].length; j++){
                System.out.printf("\t\t%d\t\t\t", t[i][j]);
            }
            System.out.println();
        }
    }
}
