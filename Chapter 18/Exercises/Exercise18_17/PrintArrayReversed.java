package Exercise18_17;

public class PrintArrayReversed {
    public static void stringReverse( String string ) {
        characterArrayReverse( string.toCharArray(), string.length()-1 );
    }
    private static void characterArrayReverse( char[] characterArray, int index ) {
        if( index < 0 ) {
            return;
        }
        System.out.printf("%c ", characterArray[index]);
        characterArrayReverse( characterArray, index-1);
    }

    static void main() {
        String string = "Minecraft";
        stringReverse(string);
    }
}
