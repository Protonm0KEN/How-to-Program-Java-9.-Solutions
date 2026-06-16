package Exercise10_10;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    private Date birthDate;

    public Employee( String firstName, String lastName, String socialSecurityNumber, Date birthDate ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
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
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
    public Date getBirthDateObject() {
        return birthDate;
    }
    public String getBirthDateString(){
        return birthDate.getDateString();
    }

    @Override
    public String toString(){
        return String.format( "%s %s\nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();
}
