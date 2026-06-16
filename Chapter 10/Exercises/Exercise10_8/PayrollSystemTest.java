package Exercise10_8;

public class PayrollSystemTest {
    public static void main( String[] args ){
        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Akbarxoja",
                "Rixsixodjayev",
                "111-11-1111",
                800.00,
                new Date( 10, 03, 2006 )
        );
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Afzal",
                "Rixsixodjayev",
                "222-22-2222",
                16.75,
                40,
                new Date( 1, 10, 2008 )
        );
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue",
                "Jones",
                "333-33-3333",
                10000,
                0.06,
                new Date( 5, 10, 2008 )
        );
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Sarvar",
                "Shukurullayev",
                "444-44-4444",
                5000,
                0.04,
                300,
                new Date( 2, 13, 2007 )
        );
        System.out.println( "Employees processed individually:\n" );
        System.out.printf("%s\n%s: $%,.2f\n\n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        //Polymorphism
        //Array of objects of type of superclass, due to the is-a relationship
        //Here it is the array of references of type Employee, that refer to subclasses, since here each subclass object is an Employee object
        Employee[] employees = {
                salariedEmployee,
                hourlyEmployee,
                commissionEmployee,
                basePlusCommissionEmployee,
        };

        System.out.println( "Employees processed polymorphically:\n");
//        //We use enhanced for to display earnings of each employee
//        for ( Employee currentEmployee : employees ){
//            System.out.println( currentEmployee );
//
//            //Since we need to add additional raise of salary of BasePlusCommissionEmployee by Exercise's definition, by 10% (line 75)
//            if( currentEmployee instanceof BasePlusCommissionEmployee){
//                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
//                employee.setBaseSalary( 1.10 * employee.getBaseSalary() );
//                System.out.printf( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary() );
//            }
//            System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings() );
//        }


        //Polymorphically add 100$ bonus to payroll amount if the current month is the one in which the Employee's birthday occurs


        for(int currentMonth = 1; currentMonth <= 12; currentMonth++){
            for( Employee employeeReferenceVariable : employees ){
                System.out.println("Month: " + currentMonth);
                System.out.println( employeeReferenceVariable );
                if( currentMonth == employeeReferenceVariable.getBirthDateObject().getMonth() ){
                    System.out.printf( "earned $%,.2f\n\n", employeeReferenceVariable.earnings()+100 );
                }else{
                    System.out.printf( "earned $%,.2f\n\n", employeeReferenceVariable.earnings() );
                }
            }
        }
        for( int j = 0; j < employees.length; j++ ){
            //Here we get actually the names of objects they are in is=a relationship to and also a package name, like packagename.classname form
            System.out.printf( "Employee %d is a %s\n", j, employees[j].getClass().getName() );
        }
    }
}
