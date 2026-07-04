package Exercise18_10;

public class VisualizingRecursion {
    private static int indentLevel = 0;
    public static int factorial( int n ) {

        String indent = "  ".repeat( indentLevel );
        System.out.printf("%s→ Entering factorial(%d)\n", indent, n);

        if( n == 1 ){
            System.out.printf("%s← Base case reached! Returning 1\n", indent);
            return n;
        }

        indentLevel++;
        int result = n * factorial(n - 1);
        indentLevel--;

        System.out.printf("%s← Exiting factorial(%d) = %d\n", indent, n, result);

        return result;

    }
    public static void main( String[] args ) {
        System.out.println("Result is: " + factorial(15));
    }
}
