package Exercise18_9;

public class RecursiveMethodPower {
    public static double power( double base, int exponent ) {
        if( exponent == 0) {
            return 1;
        } else{
            return base * power( base , exponent-1 ) ;
        }
    }
    public static void main( String[] args ) {
        System.out.println(power(5,2));
    }
}
