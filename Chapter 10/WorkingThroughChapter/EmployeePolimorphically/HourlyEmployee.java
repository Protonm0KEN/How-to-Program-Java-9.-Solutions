package EmployeePolimorphically;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee( String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked ){
        super( firstName, lastName, socialSecurityNumber );
        this.hours = hoursWorked;
        this.wage = hourlyWage;
    }

    public void setWage( double hourlyWage ){
        if( hourlyWage >= 0.0 ){
            this.wage = hourlyWage;
        }else throw new IllegalArgumentException( "Hourly wage must be >=0.0" );
    }
    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if( hours >= 0.0 ){
            this.hours = hours;
        }else throw new IllegalArgumentException( "Hours worked must be >= 0.0" );
    }
    public double getHours() {
        return hours;
    }



    @Override
    public double earnings() {
        if( getHours() <= 40 ){
            return getWage() * getHours();
        }else return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}
