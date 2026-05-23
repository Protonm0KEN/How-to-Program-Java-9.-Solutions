package Exercise7_29;

public class Fibonacci {
    //(a)
    static public int getFibonacciInt(int n) {
        if (n == 0) return 0;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    static public double getFibonacciDouble(int n) {
        if (n == 0) return 0;
        double a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            double sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    static void main() {
        int n = 0;
        while(true){
            int fib = getFibonacciInt(n);
            if(fib >= 0){
                System.out.printf("Current fibonacci: %d and getFibonacci(n) = %d\n", n, fib);
                n++;
            } else {
                break;
            }
        }
        System.out.println(getFibonacciDouble(n-1));
        System.out.println("Max n: " + (n-1));
        System.out.println(getFibonacciInt(n-1));
    }
}
