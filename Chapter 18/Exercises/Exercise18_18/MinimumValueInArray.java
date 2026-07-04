package Exercise18_18;

public class MinimumValueInArray {
    public static int getMinimumValueFromArray(int[] array) {
        return getMinimumValueFromArray(array, array[0], 0);
    }
    private static int getMinimumValueFromArray( int[] array, int currentSmallest, int index ) {
        if( array.length == 1 ) {
            return array[0];
        }
        if( index == array.length ) {
            return currentSmallest;
        }
        if( currentSmallest > array[index] ) currentSmallest = array[index];
        return getMinimumValueFromArray(array, currentSmallest, index+1);
    }



    static void main() {
        int[] array = {1,-1,20,2000,-5000,999};
        System.out.println(getMinimumValueFromArray(array));
    }
}
