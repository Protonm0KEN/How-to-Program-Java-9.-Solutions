package Exercise7_13;

public class LabelingTheNullification {
    static void main() {
//        for(int row = 0; row < sales.length; row++){
//            for( int col = 0; col < sales[row].length; col++){
//                sales[row][col] = 0;
//            }
//        }
        /*
            We assume that sales is the 3 by 5 two dimensional array
            So sales has 3 rows and 5 columns

            We have rows 0, 1, 2
            We have columns 0,1,2,3,4

            So the internal for loop executes for each row, so for each fixed row, sales[row][0...4] are set to 0
            row = 0 : 1. sales[0][0] = 0; 2. sales[0][1] = 0; 3. sales[0][2] = 0; 4. sales[0][3]=0; 5. sales[0][4] = 0;
            row = 1 : 6. sales[0][0] = 0; 7. sales[0][1] = 0; 8. sales[0][2] = 0; 9. sales[0][3]=0; 10. sales[0][4] = 0;
            row = 2 : 11. sales[0][0] = 0; 12. sales[0][1] = 0; 13. sales[0][2] = 0; 14. sales[0][3]=0; 15. sales[0][4] = 0;
        *
        * */

        int[][] sales = new int[3][5];

        int count = 1;
        for(int row = 0; row < sales.length; row++){
            for(int col = 0; col < sales[row].length; col++){
                sales[row][col] = 0;
                System.out.printf("\nThe sales[%d][%d] is set to 0\nStatement number is: %d\n", row,col, count);
                count++;
            }
        }
    }
}
