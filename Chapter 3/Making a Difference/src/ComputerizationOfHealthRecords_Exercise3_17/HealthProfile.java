package ComputerizationOfHealthRecords_Exercise3_17;

import Exercise3_15.Date;

//Declaring class HealthProfile that represents the full information about the person's health
public class HealthProfile {

    //Declaring private instance variables that store personal information about the patient
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;

    private double height;
    private double weight;

    //No argument constructor that is used to initialize instance variables to default initial values
    public HealthProfile(){}

    //Parametrized constructor that is ued to initialize instance variables to proper values (passed date object )
    public HealthProfile(String firstName, String lastName, String gender, double height, double weight, Date dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }
    //Parametrized constructor that is ued to initialize instance variables to proper values ( + Details of object of date)
    public HealthProfile(String firstName, String lastName, String gender, double height, double weight, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;

        this.dateOfBirth = new Date(dayOfBirth, monthOfBirth, yearOfBirth);
    }

    //set methods
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setGender(String gender) {this.gender = gender;}
    public void setDateOfBirth(Date dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public void setHeight(double height) {this.height = height;}
    public void setWeight(double weight) {this.weight = weight;}

    //get methods

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getGender() {return gender;}
    public Date getDateOfBirth() {return dateOfBirth;}

    public double getHeight() {return height;}
    public double getWeight() {return weight;}



    //Method that calculates and returns person's age by using years
    public int getPersonAge(){
        Date currentDate = new Date(4,12,2025);
        int personAge;

        personAge = currentDate.getYear()-this.dateOfBirth.getYear();

        return personAge;
    };

    //Method that calculates and returns maximum heart rate
    public int getMaximumHeartRate(){
        return 220-getPersonAge();
    }


    //methods that calculate and return target rate min and max values
    public double getTargetRateMin(){
        return getMaximumHeartRate()*0.5;
    }
    public double getTargetRateMax(){
        return getMaximumHeartRate()*0.85;
    }


    //Getting body mass index
    public double getBodyMassIndex(){
        return weight /((height * height)/10000);
    }


    //Method to display chart of information about the user's health profile
    public void displayInfo(){
        System.out.println("Information table ");

        System.out.printf("First name: %s\n", this.getFirstName());
        System.out.printf("Last name: %s\n", this.getLastName());
        System.out.printf("Date of birth: %s\n", this.getDateOfBirth().getStringDate());

        System.out.printf("Height: %s\ncm", this.getHeight());
        System.out.printf("Weight: %s\nkg", this.getWeight());



        System.out.printf("Person age: %d\n", this.getPersonAge());
        System.out.printf("Maximum heart rate: %d\n", this.getMaximumHeartRate());
        System.out.printf("Minimum target heart rate: %f\n", this.getTargetRateMin());
        System.out.printf("Maximum target heart rate: %f\n", this.getTargetRateMax());

        System.out.printf("Yur BMI is: %f\n", this.getBodyMassIndex()); // Added newline character for cleaner output separation

        //Printing a header for the reference values
        System.out.println("BMI Values");
        //Displaying the Underweight category range
        System.out.println("Underweight: less than 18.5");
        //Displaying the Normal category range
        System.out.println("Normal between 18.5 and 24.9");
        //Displaying the Overweight category range
        System.out.println("Overweight: between 25 and 29.9");
        //Displaying the Obese category range
        System.out.println("Obese: 30 or greater");
    }
}
