public class StringConstructors {
    public static void main( String[] args ){
        char[] charsArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        int[] intsArray = {1,2,3,4,5,6,7};
        String s = new String( "hello" );

        String s1 = new String(); //Empty string, has length of 0, no contents
        String s2 = new String( s ); //
        System.out.printf("Is s2 == s: %s\n", s2 == s ?  "Yes" : "No");
        System.out.printf("Is contents of s2 == s: %s\n", s.equals(s2) ? "Yes" : "No");

        //    public String(char[] value) {
        //        this(value, 0, value.length, null);
        //    }
        String s3 = new String( charsArray ); //creating a String object using a charArray
        String s4 = new String(charsArray, 6, 3 ); //More general form

        //Not possible, only charArray as an argument
//        String s5 = new String(intsArray);

        System.out.printf("\ns1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1,s2,s3,s4);
    }
}
