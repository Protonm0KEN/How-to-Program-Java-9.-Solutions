package InterfacesPayableAndEmployees;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary ){
        super( firstName, lastName, socialSecurityNumber );
        setWeeklySalary( weeklySalary );

    }

    public void setWeeklySalary(double weeklySalary) {
        if( weeklySalary >= 0.0 ){
            this.weeklySalary = weeklySalary;
        }else throw new IllegalArgumentException( "Weekly salary must be >= 0.0" );
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }

    //Example of code reuse, where we first use superclass's method of toString and then add additional information to the string representation of this class, SalariedEmployee
    @Override
    public String toString(){
        return String.format( "salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}
