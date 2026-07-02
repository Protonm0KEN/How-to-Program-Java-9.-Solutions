package RegularExpressionsWorkingThrough;

import java.util.Scanner;

public class ValidateTest {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        System.out.println("Enter city: ");
        String city = scanner.nextLine();

        System.out.println("Enter zip: ");
        String zip = scanner.nextLine();

        System.out.println("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.println("\nValidateResult");

        if( !ValidateInput.validateFirstName(firstName) ) {
            System.out.println("Invalid first name");
        } else if( !ValidateInput.validateLastName(lastName)){
            System.out.println("Invalid last name");
        } else if( !ValidateInput.validateAddress(address)){
            System.out.println("Invalid address");
        } else if( !ValidateInput.validateCity(city)){
            System.out.println("Invalid city");
        } else if( !ValidateInput.validateZip(zip)){
            System.out.println("Invalid zip");
        } else if( !ValidateInput.validatePhone(phone)){
            System.out.println("Invalid phone");
        }else{
            System.out.println("Valid input.Thank you");
        }
    }
}
