package Exercise11_18;


import java.io.IOException;

class ExceptionA extends Exception {
    ExceptionA( String exceptionMessage ){
        super(exceptionMessage);
    }
}
class ExceptionB extends ExceptionA {
    ExceptionB( String exceptionMessage ){
        super(exceptionMessage);
    }
}


public class Exceptions {
    static void main() {
        try{
            throw new ExceptionA( "Exception of type ExceptionA" );
        } catch (Exception exception) {
            System.out.printf( "Exception is: %s\n", exception.getMessage() );
        }
        try{
            throw new ExceptionB( "Exception of type ExceptionB" );
        } catch (Exception exception) {
            System.out.printf( "Exception is: %s\n", exception.getMessage() );
        }
        try{
            throw new NullPointerException( "Exception of type NullPointerException" );
        } catch (Exception exception) {
            System.out.printf( "Exception is: %s\n", exception.getMessage() );
        }
        try{
            throw new IOException( "Exception of type IOException" );
        } catch (Exception exception) {
            System.out.printf( "Exception is: %s\n", exception.getMessage() );
        }
    }
}
