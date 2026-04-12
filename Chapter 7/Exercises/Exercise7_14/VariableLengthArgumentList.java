package Exercise7_14;

import java.util.Scanner;

public class VariableLengthArgumentList {
    static int product(int...numbers){
        int total = 1;
        if(numbers.length == 0) return 0;
        for(int number : numbers){
            total = total * number;
        }
        return total;
    }

    static void main() {
        System.out.println(product(1,2,3));
        System.out.println(product(1,2,3,4));
        System.out.println(product(1,2,3,4,5));
        System.out.println(product());
        System.out.println(product(1,2,3,4,5,6,7,8,9,10,11,12));
    }
}
