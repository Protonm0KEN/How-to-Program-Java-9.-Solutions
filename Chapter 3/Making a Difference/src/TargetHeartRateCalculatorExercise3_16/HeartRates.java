package TargetHeartRateCalculatorExercise3_16; // Package declaration for the HeartRates class

import Exercise3_15.Date; // Importing the Date class (presumably from Exercise 3.15)

/*
 * 3.16 (Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
 * that your heart rate stays within a safe range suggested by your trainers and doctors.
 *
 * According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736),
 * the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in
 * years.
 * Your target heart rate is a range that’s 50–85% of your maximum heart rate.
 *
 * [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the
 * health, fitness and gender of the individual. Always consult a physician or qualified health care professional before beginning or modifying an exercise program.]
 *
 * Create a class called HeartRates.
 *
 * The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth).
 * Your class should have a constructor that receives this data as parameters.
 * For each attribute provide set and get methods.
 * The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and
 * returns the person’s maximum heart rate and a method that calculates and returns the person’s target
 * heart rate.
 *
 * Write a Java application that prompts for the person’s information, instantiates an object
 * of class HeartRates and prints the information from that object—including the person’s first name,
 * last name and date of birth—then calculates and prints the person’s age in (years), maximum heart
 * rate and target-heart-rate range.
 *
 * */
public class HeartRates { // Beginning of class HeartRates body

    // Private instance variable for the person's first name
    private String firstName;
    // Private instance variable for the person's last name
    private String lastName;
    // Private instance variable for the person's date of birth (uses the imported Date class)
    private Date dateOfBirth;

    // No-arg constructor: initializes object with default values (useful for later setting via mutators)
    public HeartRates(){}

    // Constructor: receives first name, last name, and separate day, month, year integers
    public HeartRates(String firstName, String lastName, int day, int month, int year){
        this.firstName = firstName; // Assigns the first name parameter to the instance variable
        this.lastName = lastName; // Assigns the last name parameter to the instance variable
        // Initializes the Date instance variable by creating a new Date object
        dateOfBirth = new Date(day, month, year);
    }

    // Constructor: receives first name, last name, and an already-created Date object
    public HeartRates(String firstName, String lastName, Date dateOfBirth){
        this.firstName = firstName; // Assigns the first name parameter
        this.lastName = lastName; // Assigns the last name parameter
        this.dateOfBirth = dateOfBirth; // Assigns the provided Date object
    }


    // --- Mutator (Set) Methods ---

    // Sets the person's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Sets the person's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Sets the person's date of birth using a Date object
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // --- Accessor (Get) Methods ---

    // Gets the person's first name
    public String getFirstName() {
        return firstName;
    }

    // Gets the person's last name
    public String getLastName() {
        return lastName;
    }

    // Gets the person's date of birth (Date object)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Method to calculate and return the person's age in years
    public int getPersonAge(){
        // Define the current date for calculation (using the date from the problem description)
        Date currentDate = new Date(4, 12, 2025);
        int personAge; // Local variable to store the calculated age

        // Simple calculation of age based only on the difference in years
        personAge = currentDate.getYear() - this.dateOfBirth.getYear();

        // Note: For a precise age check, month and day would need to be compared.
        // We use the simplified calculation as implied by the structure.
        return personAge; // Returns the calculated age
    }

    // Method to calculate and return the person's maximum heart rate
    // Formula: 220 - age in years
    public int getMaximumHeartRate(){
        return 220 - getPersonAge();
    }

    // Method to calculate and return the minimum target heart rate (50% of maximum)
    public double getTargetRateMin(){
        // Multiplies the maximum heart rate by the lower range factor (0.50)
        return getMaximumHeartRate() * 0.5;
    }

    // Method to calculate and return the maximum target heart rate (85% of maximum)
    public double getTargetRateMax(){
        // Multiplies the maximum heart rate by the upper range factor (0.85)
        return getMaximumHeartRate() * 0.85;
    }


    // Method to neatly display all calculated and stored information
    public void displayInfo(){
        System.out.println("--- Target Heart Rate Information ---");

        System.out.printf("First Name: %s\n", this.getFirstName());
        System.out.printf("Last Name: %s\n", this.getLastName());
        // Assumes Date class has a getStringDate() method
        System.out.printf("Date of Birth: %s\n", this.getDateOfBirth().getStringDate());

        // Displaying calculated values
        System.out.printf("Age: %d years\n", this.getPersonAge());
        System.out.printf("Maximum Heart Rate: %d bpm\n", this.getMaximumHeartRate());
        // Displaying the target range, formatted to one decimal place for clarity
        System.out.printf("Target Heart Rate Range: %.1f - %.1f bpm\n", this.getTargetRateMin(), this.getTargetRateMax());
    }

} // End of class HeartRates body