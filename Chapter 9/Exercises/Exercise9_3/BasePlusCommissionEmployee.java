package Exercise9_3;

// Fig. 9.11: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class inherits from CommissionEmployee
// and accesses the superclass’s private data via inherited
// public methods.
public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee;
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary ) {
        commissionEmployee = new CommissionEmployee( first, last, ssn, sales, rate );
        setBaseSalary( salary ); // validate and store base salary
    } // end six-argument BasePlusCommissionEmployee constructor

    public void setFirstName( String firstName ){
        commissionEmployee.setFirstName(firstName);
    }
    public void setLastName(String lastName) {
        commissionEmployee.setLastName(lastName);
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        commissionEmployee.setSocialSecurityNumber(socialSecurityNumber);
    }
    public void setGrossSales(double grossSales) {
        if( grossSales >= 0.0 ){
            commissionEmployee.setGrossSales(grossSales);
        }else{
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
    }
    public void setCommissionRate(double commissionRate) {
        if( commissionRate > 0.0 && commissionRate < 1.0 ){
            commissionEmployee.setCommissionRate(commissionRate);
        }else {
            throw new IllegalArgumentException("Commission rate must be > 0.0 to < 1.0");
        }
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }
    public String getLastName() {
        return commissionEmployee.getLastName();
    }
    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }
    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }
    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }



    // set base salary
    public void setBaseSalary( double salary ) {
        if ( salary >= 0.0 )
            baseSalary = salary;
        else
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0" );
    } // end method setBaseSalary
    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary
    // calculate earnings
    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    } // end method earnings
    // return String representation of BasePlusCommissionEmployee
    @Override // indicates that this method overrides a superclass method
    public String toString() {
        return String.format( "%s %s\n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary() );
    } // end method toString
} // end class BasePlusCommissionEmployee