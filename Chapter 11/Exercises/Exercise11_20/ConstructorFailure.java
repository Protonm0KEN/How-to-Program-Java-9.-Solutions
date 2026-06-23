package Exercise11_20;

class SomeClass{
    private int instanceIntVariable;
    SomeClass(int instanceIntVariable) throws Exception {
        if(instanceIntVariable >= 0){
            this.instanceIntVariable = instanceIntVariable;
        }else throw new Exception( "Incorrect argument, must be >= 0" );
    }
}


public class ConstructorFailure {

    public static void main( String[] args ) {
        SomeClass obj1;
        SomeClass obj2;
        try {
            obj1 = new SomeClass(1);
            obj2 = new SomeClass(-20);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            obj1 = null;
            obj2 = null;
        }
    }
}
