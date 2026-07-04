package Exercise18_14;

public class Palindromes {
    public static boolean isPalindrome( String string ) {
        if( string.isEmpty() || string.length() == 1 ) {
            return true;
        }
        if( string.charAt(0) != string.charAt(string.length()-1) ) {
            return false;
        }else{
            return isPalindrome( string.substring(1, string.length()-1) );
        }
    }
    public static void main( String[] args ) {
        System.out.println(isPalindrome("ab"));
    }
}
