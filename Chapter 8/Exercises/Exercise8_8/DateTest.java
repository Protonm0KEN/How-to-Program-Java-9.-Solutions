package Exercise8_8;

public class DateTest {
    public static void main(String[] args){
        Date date = new Date(6, 13, 26);

        for(int i = 0; i<1000000;i++){
            System.out.println(date);
            date.nextDay();
        }
    }
}
