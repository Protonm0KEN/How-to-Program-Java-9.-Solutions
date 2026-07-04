package Exercise16_19;

import java.util.Scanner;

public class DatePrinting {
    public static void main( String[] args ) {
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        Scanner scanner = new Scanner( System.in );
        
        System.out.println("Enter a date in format (mm/dd/yyyy): ");
        String dateFirstFormat = scanner.nextLine();

        String[] splitDate = dateFirstFormat.split( "/" );

        String textualDate = "";
        textualDate += months[Integer.parseInt(splitDate[0])-1] + " ";
        textualDate += splitDate[1] + ", ";
        textualDate += splitDate[2];
        System.out.println(textualDate);
    }
}
