public class StringMiscellaneous {
    public static void main( String[] args ) {
        String s1 = "Hello world";
        char[] charArray = new char[5];

        System.out.printf( "s1: %s", s1);


        //Method length is used to get length of contents inside String object
        System.out.printf( "\nLength of s1: %d", s1.length() );

        //This won't work, since length is not an attribute, but rather a method
//        System.out.println(s1.length);

        System.out.print( "\nThe string is reversed is: " );

        for( int count = s1.length()-1; count >= 0; count--) {
            System.out.printf( "%c", s1.charAt( count ));
        }

        s1.getChars( 0, 5, charArray, 0);
        System.out.print( "\nThe character array is: ");

        for ( char character : charArray ) {
            System.out.print( character );
        }
        System.out.println();
    }
}
