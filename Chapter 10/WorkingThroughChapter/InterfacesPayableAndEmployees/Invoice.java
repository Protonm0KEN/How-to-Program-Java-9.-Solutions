package InterfacesPayableAndEmployees;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice( String partNumber, String partDescription, int quantity, double pricePerItem ){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }


    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity) {
        if( quantity >= 0 ){
            this.quantity = quantity;
        }else throw new IllegalArgumentException( "Quantity must be >=0" );
    }
    public void setPricePerItem(double pricePerItem) {
        if( pricePerItem >= 0.0 ){
            this.pricePerItem = pricePerItem;
        }else throw new IllegalArgumentException( "Price per item must be >= 0.0 " );
    }

    public String getPartNumber() {
        return partNumber;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString(){
        return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "Invoice", "Part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
}

