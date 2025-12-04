package Exercise3_14;
/*
* (Employee Class) Create a class called Employee that includes three instance variables—a first
name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
that initializes the three instance variables. Provide a set and a get method for each instance variable. If
the monthly salary is not positive, do not set its value. Write a test application named EmployeeTest
that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s
yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/


//Access modifier public. Class declaration with class name Employee
public class Employee {//Beginning of class Employee's body

    //Declaration of private instance variables ( Encapsulation )
    private String firstName; //Declaring the variable with reference type String to store user's first name
    private String lastName; //Declaring the variable with reference type String to store user's last name
    private double monthlySalary; //Declaring the variable with reference type String to store user's  monthly salary

    //Declaring the no-arg constructor for safety in case if object is initialized improperly
    public Employee(){}

    //Declaring parametrized constructor that assigns values from parameters to instance variables in repstive order
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;//Assigning value from parameter firstName to instance variable firstName using assignment operator
        this.lastName = lastName;//Assigning value from parameter lastName to instance variable lastName using assignment operator
        this.monthlySalary = monthlySalary;//Assigning value from parameter monthlySalary to instance variable monthlySalary using assignment operator
    }


    //Setters ( Mutators)
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setMonthlySalary(double monthlySalary) {if(this.monthlySalary >= 0) this.monthlySalary = monthlySalary;}

    //Getters ( Accessors )
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public double getMonthlySalary() {return monthlySalary;}
}//End of class Employee's body
