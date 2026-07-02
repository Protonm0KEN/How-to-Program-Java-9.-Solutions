public class StringValueOf {
    public static void main(String[] args){
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        boolean booleanValue = true;
        char characterValue = 'i';
        int integerValue = -20;
        long longValue = 10000000000L;
        float floatValue = (float) Math.PI;
        double doubleValue = Math.E;
        Object objectRef = "Akbar";

        System.out.printf( "char array = %s\n", String.valueOf(charArray) );
        System.out.printf( "booleanValue  = %s\n", String.valueOf(booleanValue) );
        System.out.printf( "characterValue  = %s\n", String.valueOf(characterValue) );
        System.out.printf( "integerValue  = %s\n", String.valueOf(integerValue) );
        System.out.printf( "longValue  = %s\n", String.valueOf(longValue) );
        System.out.printf( "floatValue  = %s\n", String.valueOf(floatValue) );
        System.out.printf( "doubleValue  = %s\n", String.valueOf(doubleValue) );
        System.out.printf( "objectRef  = %s\n", String.valueOf(objectRef) );
    }
}
