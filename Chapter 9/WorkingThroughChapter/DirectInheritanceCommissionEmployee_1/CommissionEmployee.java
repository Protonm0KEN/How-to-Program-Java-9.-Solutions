package DirectInheritanceCommissionEmployee_1;

public class CommissionEmployee extends Object {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee( String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setFirstName( String firstName ){
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setGrossSales(double grossSales) {
        if( grossSales >= 0.0 ){
            this.grossSales = grossSales;
        }else{
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        }
    }
    public void setCommissionRate(double commissionRate) {
        if( commissionRate > 0.0 && commissionRate < 1.0 ){
            this.commissionRate=commissionRate;
        }else {
            throw new IllegalArgumentException("Commission rate must be > 0.0 to < 1.0");
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }


    public double earnings(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    }
}

