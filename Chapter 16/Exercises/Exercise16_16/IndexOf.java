package Exercise16_16;

public class IndexOf {
    public static int getNumberOfOccurrences( char character, String string, int startingIndex, int endIndex ) {
        int numberOfOccurrences = 0;
        for( int i = startingIndex; i < endIndex; i++ ) {
            if(string.charAt(i) == character){
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    public static int indexOf( char character, String string, int startingIndex, int endIndex ) {
        for( int i = startingIndex; i <= endIndex; i++) {
            if( string.charAt(i) == character ) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf( char character, String string ) {
        int index = -1;

        for( int i = 0; i < string.length(); i++) {
            if( string.charAt(i) == character ) {
                index = i;
            }
        }
        return index;
    }
}
