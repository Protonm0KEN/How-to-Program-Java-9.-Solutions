package Exercise10_11;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double grossSales,
            double commissionRate,
            double baseSalary,
            Date birthDate
    ) {
        super( firstName, lastName, socialSecurityNumber, grossSales, commissionRate, birthDate );
        setBaseSalary( baseSalary );
    }

    public void setBaseSalary(double baseSalary) {
        if( baseSalary >= 0.0 ){
            this.baseSalary = baseSalary;
        }else throw new IllegalArgumentException( "Base salary must be >= 0.0" );
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    //Note that since we don't inherit directly from abstract class, we actually don't have to implement method earnings!

    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }

    @Override
    public String toString() {
        return String.format( "%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }

}
