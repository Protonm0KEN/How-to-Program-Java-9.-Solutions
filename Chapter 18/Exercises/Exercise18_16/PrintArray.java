package Exercise18_16;

public class PrintArray {
    public static void printArray( int[] array, int index ) {
        if( index == array.length ) {
            return;
        }
        System.out.printf("%d ", array[index]);
        printArray( array, index+1);
    }

    static void main() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        printArray(array, 0);
    }
}
