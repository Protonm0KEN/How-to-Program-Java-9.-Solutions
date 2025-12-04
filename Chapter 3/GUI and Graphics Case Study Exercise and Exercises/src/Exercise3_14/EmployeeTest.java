package Exercise3_14;


//Declaring the driver class Employee Test that executes the application to showcase class Employee capabilities
public class EmployeeTest {//Beginning of class EmployeeTest's body

    //Declaring method main ( Starting point of every java application ) that JVM will execute to run the application. On line 8 is main header
    static void main() {//Beginning of main method's body

        //Declaring and initializing Employee object's with different arguments passed to constructors
        Employee employee1 = new Employee("Sanji", "Ijnas", 100.0);
        Employee employee2 = new Employee("Akbar", "Rabka", -100);

        //Displaying yearly salary:
        System.out.printf("employee1 yearly salary: %s\n", employee1.getMonthlySalary()*12);
        System.out.printf("employee2 yearly salary: %s\n", employee2.getMonthlySalary()*12);
    }//End of main method's body

}//End of class EmployeeTest's body
