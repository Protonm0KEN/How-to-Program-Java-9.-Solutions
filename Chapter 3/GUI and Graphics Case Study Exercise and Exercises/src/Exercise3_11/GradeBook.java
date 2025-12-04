package Exercise3_11; // Package declaration for organizing the class file

// Fig. 3.10: GradeBook.java
// GradeBook class with a constructor to initialize the course name and instructor name.

/*
* (Modified GradeBook Class) Modify class GradeBook (Fig. 3.10) as follows:
a) Include a String instance variable that represents the name of the course’s instructor.
b) Provide a set method to change the instructor’s name and a get method to retrieve it.
c) Modify the constructor to specify two parameters—one for the course name and one
for the instructor’s name.
d) Modify method displayMessage to output the welcome message and course name, followed by "This course is presented by: " and the instructor’s name.
Use your modified class in a test application that demonstrates the class’s new capabilities.
* */

public class GradeBook { // Beginning of class GradeBook body

    // (a) Instance variable: Name of the Instructor of the course
    private String instructorName;

    // Instance variable: course name for this GradeBook
    private String courseName;

    // (c) Modified constructor: Initializes both the course name and the instructor name
    public GradeBook(String courseName, String instructorName){ // Constructor header with two String parameters
        // Set the courseName instance variable using the parameter courseName
        this.courseName = courseName;
        // Set the instructorName instance variable using the parameter instructorName
        this.instructorName = instructorName;
    } // End of constructor body


    // Method to set the course name (Mutator/Setter)
    public void setCourseName( String name ){
        // Assigns the value of the 'name' parameter to the instance variable 'courseName'
        courseName = name;
    } // end method setCourseName

    // (b) Method to set the instructor name (Mutator/Setter)
    public void setInstructorName(String name){
        // Assigns the value of the 'name' parameter to the instance variable 'instructorName'
        this.instructorName = name;
    } // end method setInstructorName


    // Method to retrieve the course name (Accessor/Getter)
    public String getCourseName() {
        // Returns the current value stored in the instance variable 'courseName'
        return courseName;
    } // end method getCourseName

    // (b) Method to retrieve the instructor's name (Accessor/Getter)
    public String getInstructorName(){
        // Returns the current value stored in the instance variable 'instructorName'
        return instructorName;
    } // end method getInstructorName


    // (d) Modified method displayMessage: Outputs the welcome message, course name, and instructor name.
    public void displayMessage() {
        // Use printf for formatted output, incorporating both the course name and the instructor name
        System.out.printf( "Welcome to the grade book for\n%s!\nThis course is presented by: %s\n",
                getCourseName(), // Argument 1: retrieved using the getCourseName method
                getInstructorName() // Argument 2: retrieved using the getInstructorName method
        );
    } // end method displayMessage

} // end class GradeBook