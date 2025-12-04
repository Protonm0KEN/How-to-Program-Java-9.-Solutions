package Exercise3_13; // Package declaration for organizing this class file

/*
*
* (Invoice Class) Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four pieces of information as
instance variables—a part number (type String), a part description (type String), a quantity of the
item being purchased (type int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities
* */


// Declaring class Invoice
public class Invoice {// Beginning of class Invoice body

    // Declaring private instance variables ( Practice of doing Information Hiding/Encapsulation )
    private String partNumber; // The unique identifier for the item (String)
    private String partDescription; // A brief description of the item (String)
    private int purchasedQuantity; // The number of items purchased (int)
    private double pricePerItem; // The price of a single item (double)

    // No-arg constructor to initialize the values of object to default initial values
    public Invoice() {
        // Initializes String variables to null, int to 0, and double to 0.0 by default
    }

    // Declaring the constructor to initialize object of class Invoice with four parameters
    public Invoice(String partNumber, String partDescription, int purchasedQuantity, double pricePerItem){

        // Assignment statements to use arguments from parameters and assign them to instance variables respectively
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        // Use set methods to apply initial validation logic upon object creation
        setPurchasedQuantity(purchasedQuantity);
        setPricePerItem(pricePerItem);

    }

    // --- Mutator (Set) Methods ---

    // Set method for the partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber; // Assigns new value to partNumber
    }

    // Set method for the partDescription
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription; // Assigns new value to partDescription
    }

    // Set method for the purchasedQuantity (Includes validation for positive quantity)
    public void setPurchasedQuantity(int purchasedQuantity) {
        // If quantity is not positive (<= 0), set it to 0; otherwise, set it to the provided value
        this.purchasedQuantity = (purchasedQuantity > 0) ? purchasedQuantity : 0;
    }

    // Set method for the pricePerItem (Includes validation for positive price)
    public void setPricePerItem(double pricePerItem) {
        // If price is not positive (<= 0.0), set it to 0.0; otherwise, set it to the provided value
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }


    // --- Accessor (Get) Methods ---

    // Get method to retrieve the partNumber
    public String getPartNumber() {
        return partNumber; // Returns the partNumber
    }

    // Get method to retrieve the partDescription
    public String getPartDescription() {
        return partDescription; // Returns the partDescription
    }

    // Get method to retrieve the purchasedQuantity
    public int getPurchasedQuantity() {
        return purchasedQuantity; // Returns the purchasedQuantity
    }

    // Get method to retrieve the pricePerItem
    public double getPricePerItem() {
        return pricePerItem; // Returns the pricePerItem
    }

    // Method getInvoiceAmount that calculates total Invoice amount of the product ( object )
    public double getInvoiceAmount(){

        // Note: Validation is now primarily done in the setters/constructor,
        // but the calculation logic remains simple multiplication.

        // Check if quantity is not positive and if so, effectively treat it as 0 for calculation
        // The logic here ensures that even if the setters were bypassed, the calculation uses safe values.
        int finalQuantity = (this.purchasedQuantity > 0) ? this.purchasedQuantity : 0;

        // Check if price per item is not positive and if so, effectively treat it as 0.0 for calculation
        double finalPrice = (this.pricePerItem > 0.0) ? this.pricePerItem : 0.0;

        // Return the product of quantity and price per item
        return finalQuantity * finalPrice;
    }
} //End of class Invoice body