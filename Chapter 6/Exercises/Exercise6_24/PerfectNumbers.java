package Exercise6_24;

public class PerfectNumbers {
    public static boolean isPerfect(int number){
        int sumOfDivisors  = 0;

        int i = 1;
        String divisorsList = "[";
        while(i<number){
            if(number%i == 0){
                sumOfDivisors += i;
                divisorsList += i+",";
            }
            i++;
        }
        divisorsList+="]";
//        System.out.println("Divisors of: " + number + " are: \n"+divisorsList);
        return sumOfDivisors == number;
    }
    public static void displayPerfectNumbersInRange(int a, int b){
        String allPerfectNumbersInRange = "Perfect numbers in range: ";
        for(int i = a; i<=b; i++){
            if(isPerfect(i)) allPerfectNumbersInRange+=i+",";
        }
        System.out.println(allPerfectNumbersInRange);
    }
}
