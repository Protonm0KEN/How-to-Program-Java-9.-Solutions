public class CashDispenser {
    //2. Declare all instance variables
    private final static int INITIAL_COUNT = 500;
    private int count;


    //1. Declare constructor
    public CashDispenser() {
        count = INITIAL_COUNT;
    }

    public void dispenseCash( int amount ) {
        int billsRequired = amount / 20;
        count -= billsRequired;
    }

    public boolean isSufficientCashAvailable( int amount ) {
        int billsRequired = amount / 20;
        return count >= billsRequired;
    }
}
