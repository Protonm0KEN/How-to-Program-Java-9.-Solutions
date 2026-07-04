package Exercise18_11;

public class GreatestCommonDivisors {
    public static int gcd( int m, int n ) {
        if( n == 0 ) {
            return m;
        }
        if( m == 0 ){
            return n;
        }
        return gcd( n, m % n );
    }
    public static void main( String[] args ) {
        System.out.println(gcd(32, 64));
    }
}
