//package Exercise11_19;
//
//class ExceptionA extends Throwable {
//    ExceptionA( String exceptionMessage ){
//        super(exceptionMessage);
//    }
//}
//
//class ExceptionB extends ExceptionA {
//    ExceptionB( String exceptionMessage ){
//        super(exceptionMessage);
//    }
//}
//
//
//
//public class OrderOfCatchBlocks {
//    public static void main( String[] args ){
//        try{
//            methodThrowsSubclassTypeException();
//        }catch (ExceptionA exception) {
//            System.out.println("Caught by ExceptionA superclass block");
//        }
//        catch (ExceptionB exception) {
//            System.out.println("Caught by ExceptionB subclass block");
//        }
//    }
//
//    public static void methodThrowsSubclassTypeException() throws ExceptionB {
//        throw new ExceptionB( "ExceptionB type of exception ( subclass of Exception A)" );
//    }
//}
