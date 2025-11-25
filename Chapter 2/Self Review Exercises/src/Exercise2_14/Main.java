package Exercise2_14;

public class Main {
    static void main() {
        /*
        * Write an application that displays the numbers 1 to 4 on the same line, with each pair of
        * adjacent numbers separated by one space. Use the following techniques:
            a) Use one System.out.println statement.
            b) Use four System.out.print statements.
            c) Use one System.out.printf statement.
        *
        * */

        //a) Use one System.out.println statement.
        System.out.println("1 2 3 4");

        //b) Use one System.out.print statements.
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4");
        System.out.print("\n");

        //c) Use one System.out.printf statement.
        System.out.printf("%d %d %d %d", 1,2,3,4);
    }
}
