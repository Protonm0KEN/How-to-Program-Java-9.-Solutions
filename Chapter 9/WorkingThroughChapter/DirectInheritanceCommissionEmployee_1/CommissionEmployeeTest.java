package DirectInheritanceCommissionEmployee_1;

public class CommissionEmployeeTest {
    public static void main(String[] args){
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06
        );

        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is: ", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is: ", employee.getLastName());
        System.out.printf("%s %s\n", "Social Security Number is: ", employee.getSocialSecurityNumber());
        System.out.printf("%s %s\n", "Gross Sales: ", employee.getGrossSales());
        System.out.printf("%s %s\n", "Commission rates: ", employee.getCommissionRate());

        employee.setGrossSales( 500 );
        employee.setCommissionRate( 0.1 );

        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString method: ", employee);
    }
}
