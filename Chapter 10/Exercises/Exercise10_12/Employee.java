package Exercise10_12;

public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee( String firstName, String lastName, String socialSecurityNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
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

    @Override
    public String toString(){
        return String.format( "%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();


    //This method will be inherited by other subclasses, it allows to not change all subclasses


    /*
    We did that because, since Invoice also is Payable, it has a different getPaymentAmount, but
    in this payroll system the payment amount is represented as a result of function earnings,
    thus it's implementation could be written ahead in superclass Employee as downward, and not writing same thing
    in all subclasses!
    *
    * */
    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
