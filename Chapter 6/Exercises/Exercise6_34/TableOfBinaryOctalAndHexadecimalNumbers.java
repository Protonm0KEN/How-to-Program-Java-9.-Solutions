package Exercise6_34;

public class TableOfBinaryOctalAndHexadecimalNumbers {
    public static String getHex(int number){
        return Integer.toHexString(number);
    }
    public static String getOctal(int number){
        return Integer.toOctalString(number);
    }
    public static String getBinary(int number){
        return Integer.toBinaryString(number);
    }
    static void main() {
        System.out.printf("%-10s %20s %20s %20s\n", "Number", "Binary", "Hexadecimal", "Octal");
        for(int i = 1; i<=256; i++){
            System.out.printf("%-10d %20s %20s %20s\n", i, getBinary(i), getHex(i), getOctal(i));
        }
    }
}
