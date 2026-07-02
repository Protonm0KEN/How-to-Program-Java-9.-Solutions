class TestObject {
    private int testVariable;

    public TestObject() {}
    public TestObject( int testVariable ) {
        this.testVariable = testVariable;
    }


}

public class StringComparison {
    public void main( String[] args ) {
        TestObject object1 = new TestObject(10);
        TestObject object2 = new TestObject(10);
        TestObject object3 = object2;
        String s1 = new String( "hello" );
        String s2 = "goodbye";
        String s3 = "Happy birthday";
        String s4 = "happy birthday";

        String s5 = "hello";

        System.out.printf( "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4 );


        // What Java is doing behind the scenes when you don't override it:
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }

        if ( object1.equals(object2) ) {
            System.out.println( "object1 equals object2 (Checking contents)");
        }else{
            System.out.println( "object1 does not equal object2 (Checking contents)");
        }

        if ( object1 == object2 ) {
            System.out.println("object1 equals object2 (Checking referrences)");
        }else{
            System.out.println("object1 does not equal object2 (Checking referrences)");
        }
        if ( object2 == object3 ) {
            System.out.println("object3 equals object2 (Checking referrences)\n\n");
        }else{
            System.out.println("object3 does not equal object2 (Checking referrences)\n\n");
        }


        /*
        *
        * The only reason .equals() works on Strings out-of-the-box is because the engineers who created the Java language
        * went inside the built-in String class and overrode the default method, rewriting it to compare characters one-by-one.
        *
        *     public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof String aString)
                && (!COMPACT_STRINGS || this.coder == aString.coder)
                && StringLatin1.equals(value, aString.value);
        }
        *
        * So in case of Strings, it compares contents, but in case of other objects ( unless method was overwritten ) it checks references on equality
        * */

        //Check and test method .equals(). This tests only contents of strings
        if ( s1.equals("hello") ){
            System.out.println( "s1 equals \"hello\"  (Checking contents)");
        }else{
            System.out.println("s1 does not equal \"hello\"  (Checking contents)");
        }

        //This tests references and referrences with string literals
        if ( s1 == "hello" ) {
            System.out.println( "s1 is the same object as \"hello\" (Checking referrences)" );
        }else{
            System.out.println( "s1 is not the same object as \"hello\" (Checking referrences)" );
        }

        if ( s1 == s5 ) {
            System.out.println( "s1 is the same object as s5" );
        }else{
            System.out.println( "s1 is not the same object as s5" );
        }

        if ( s3.equalsIgnoreCase( s4 ) ) {
            System.out.printf( "%s equals %s with case ignored\n", s3, s4);
        }else{
            System.out.println( "s3 is not equal s4" );
        }


        // method .compareTo()

        System.out.printf( "\ns1.compareTo(s2) is %d", s1.compareTo(s2));
        System.out.printf( "\ns2.compareTo(s1) is %d", s2.compareTo(s1));
        System.out.printf( "\ns1.compareTo(s1) is %d", s1.compareTo(s1));
        System.out.printf( "\ns3.compareTo(s4) is %d", s3.compareTo(s4));
        System.out.printf( "\ns4.compareTo(s3) is %d\n\n", s4.compareTo(s3));


        if ( s3.regionMatches( 0, s4, 0, 5) ) {
            System.out.println( "First 5 characters of s3 and s4 match" );
        }else{
            System.out.println( "First 5 characters of s3 and s4 do not match" );
        }

        if( s3.regionMatches(true, 0,s4,0,5) ) {
            System.out.println("First 5 characters of s3 and s4 match with case ignored");
        }else{
            System.out.println("First 5 characters of s3 and s4 do not match with case ignored");
        }


    }
}
