package Exercise6_28;

/*
Problem statement:
Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
that reads a value from the user and displays the result.
* */
//This application chooses the "grade" in range of given grade passed as an argument and assigned to parameter int grade

//grade/10 will perform the integer division and will successfully implement range logic of grade choosing
public class QualityPoints {
    public static int qualityPoints(int grade){
        switch(grade/10){
            //This case is for 90-100
            case 10:
            case 9:
                return 4;
            //This case is for 80-89
            case 8:
                return 3;
            //This case is for 70-79
            case 7:
                return 2;
            //This case is for 60-69
            case 6:
                return 1;
            default:
                //This case is for any case that is not specified in the range
                return 0;
        }
    }
}
