package Exercise6_25;

public class PrimeNumbersTest {
    static void main() {
        System.out.println("Primes < 100000");
        for(int i = 1; i<100000; i++){
            if(PrimeNumbers.isPrime(i)){
                System.out.print(i+",");
            }
        }
    }
}
