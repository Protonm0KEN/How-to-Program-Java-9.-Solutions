package Exercise3_13; // Package declaration for the test application

// Access modifier: public. Declaring driver class InvoiceTest
// This class is responsible for creating Invoice objects and testing their functionality.
public class InvoiceTest { // Beginning of class InvoiceTest body

    // Special method: main. JVM uses this method to execute Java application. ( Starting point of every Java application )
    // Correcting signature to public static void main(String[] args) for standard execution
    public static void main(String[] args) { // Beginning of method main body

        // --- Test Case 1: Testing the four-argument constructor and getInvoiceAmount ---

        // Declaring and initializing object of class Invoice using the four-argument constructor
        // Initializing with Part Number, Description, Quantity (10000), and Price (920.00)
        Invoice invoice = new Invoice("012430918247", "Circuit", 10000, 920.00);

        // Displaying invoice information: Part Number, Description, and the calculated total amount
        System.out.printf("The Invoice Amount for Part %s (%s) is: $%.2f\n",
                invoice.getPartNumber(), // Retrieving the part number using the getter method
                invoice.getPartDescription(), // Retrieving the part description using the getter method
                invoice.getInvoiceAmount() // Calling the method to calculate and return the total invoice amount
        );

        // --- Test Case 2: Testing the no-argument constructor ---

        // Creating an invoice and initializing it to default initial values (null, 0, 0.0)
        // to showcase capability of no-arg constructor
        Invoice invoice1 = new Invoice();

        // Displaying invoice information for the default-initialized object. Amount should be $0.00
        System.out.printf("The Invoice Amount for Part %s (%s) is: $%.2f\n",
                invoice1.getPartNumber(), // Retrieving the part number (should be null)
                invoice1.getPartDescription(), // Retrieving the part description (should be null)
                invoice1.getInvoiceAmount() // Calling the method to calculate the total amount (should be 0.0)
        );

    } //End of main method body
} //End of class InvoiceTest body