package Exercise10_12;

public class PayableInterfaceTest {
    public static void main(String[] args){
        Payable[] payableObjects = {
                new Invoice(  "01234", "seat", 2, 375.00 ),
                new Invoice( "56789", "tire", 4, 79.95 ),
                new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00),
                new HourlyEmployee( "Akbarxoja", "Rixsixodjayev", "111-11-1111", 30, 70),
                new CommissionEmployee("Sarvar", "Abullayev", "222-22-2222", 500, 0.05),
                new BasePlusCommissionEmployee("Afzal", "Rixsixodjayev", "333-33-3333", 700, 0.05, 500),
        };

        System.out.println( "Invoices and Employees processed polymorphically:\n");

        for( Payable currentPayableObject : payableObjects ){
            System.out.printf( "%s \n%s: $%,.2f\n\n" , currentPayableObject.toString(), "payment due", currentPayableObject.getPaymentAmount());
            if( currentPayableObject instanceof BasePlusCommissionEmployee){
                ((BasePlusCommissionEmployee) currentPayableObject).setBaseSalary(((BasePlusCommissionEmployee) currentPayableObject).getBaseSalary() * 1.10);
                System.out.printf("Base salary of employee %s was increased  by 10%%, now it is: %f", ((BasePlusCommissionEmployee) currentPayableObject).getFirstName() + " " + ((BasePlusCommissionEmployee) currentPayableObject).getLastName(), currentPayableObject.getPaymentAmount());
            }
        }

    }
}
