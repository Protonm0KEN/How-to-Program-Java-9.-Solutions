package Exercise3_15;

//Declaring class Date that represents real date object
public class Date {

    //Declaring private instance variables ( Encapsulation )
    private int month;
    private int day;
    private int year;

    //No-argument constructor used to initialize object to default initial values
    public Date(){}

    //Parametrized constructor used to initialize object ( give initial values to private instance variables )  properly
    public Date(int day, int month, int year){

        //Validation of correct day passed to parameters
        if(day >=1 || day <= 31) this.day = day;
        else System.out.printf("Incorrect day, day should be in range of: [%s,%s]", 1, 31);


        //Validation of correct month passed to parameters
        if(month > 12 || month<=0) System.out.printf("Incorrect month, month should be in range of: [%s,%s]", 1, 12);
        else this.month = month;


        //Validation of correct year passed to parameters
        if(this.year < 0) System.out.println("Year can not be negative");
        else this.year = year;;
    }

    //Setters ( Mutators )
    public void setDay(int day) {this.day = day;}
    public void setMonth(int month) {this.month = month;}
    public void setYear(int year) {this.year = year;}

    //Getters ( Accessors )
    public int getDay() {return day;}
    public int getMonth() {return month;}
    public int getYear() {return year;}

    //Method displayDate that will show user formatted date, returns no information after completing the task
    public void displayDate(){System.out.printf("%s/%s/%s\n", this.getDay(), this.getMonth(), this.getYear());}

    //Returning date in string format by method ( just in case for reusability in future )
    public String getStringDate(){return String.format("%s/%s/%s\n", this.getDay(), this.getMonth(), this.getYear());}
}
