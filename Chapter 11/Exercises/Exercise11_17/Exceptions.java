package Exercise11_17;

class ExceptionA extends Throwable{
    ExceptionA( String exceptionMessage ){
        super(exceptionMessage);
    }
}

class ExceptionB extends ExceptionA {
    ExceptionB( String exceptionMessage ){
        super(exceptionMessage);
    }
}

class ExceptionC extends ExceptionB {
    ExceptionC( String exceptionMessage ){
        super(exceptionMessage);
    }
}


public class Exceptions {
    public static void main( String[] args ){
        try{
            methodThrowsExceptionB();
        } catch (ExceptionA exceptionA) {
            System.out.println("Catch block A");
            System.err.printf( "Exception is: %s\n", exceptionA.getMessage() );
        }
        try{
            methodThrowsExceptionC();
        } catch (ExceptionA exceptionA) {
            System.out.println("Catch block A");
            System.err.printf( "Exception is: %s\n", exceptionA.getMessage() );
        }
    }
    public static void methodThrowsExceptionB() throws ExceptionB {
        throw new ExceptionB( "Exception of type ExceptionB was thrown" );
    }
    public static void methodThrowsExceptionC() throws ExceptionC {
        throw new ExceptionC( "Exception of type ExceptionC was thrown" );
    }
}
