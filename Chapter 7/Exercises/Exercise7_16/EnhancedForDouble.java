package Exercise7_16;

public class EnhancedForDouble {
    public static void main(String[] args) {
        double total = 0;
        for(String number : args){
            total+=Double.parseDouble(number);
        }
        System.out.println(total);

    }
}
