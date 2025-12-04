package Exercise3_11;

//Access modifier public, class name GradeBookTest, driver class to demonstrate capabilities of GradeBook
public class GradeBookTest {//Beginning of class body

    //Special method main with which JVM runs application
    static void main() {//Beginning of main's body ( And also main method's header)
        //Use your modified class in a test application that demonstrates the class’s new capabilities.
        GradeBook gradeBook1 = new GradeBook("Computer Science 101", "Akbarxoja"); //Declaring and initializing an object with constructor

        //Calling method displayMessage from object gradeBook1
        gradeBook1.displayMessage();
    }//End of main's body
}//End of class body
