package Exercise10_10;

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(
            String firstName,
            String lastName,
            String socialSecurityNumber,
            double wage,
            int pieces,
            Date birthDate
    ){
        super( firstName, lastName, socialSecurityNumber, birthDate );
        setWage( wage );
        setPieces( pieces );
    }

    public void setWage(double wage) {
        if( wage >= 0.0 ){
            this.wage = wage;
        }else throw new IllegalArgumentException( "Wage should be >= 0.0");
    }
    public void setPieces( int pieces ) {
        if( pieces >= 0 ){
            this.pieces = pieces;
        }else throw new IllegalArgumentException( "# of pieces be >= 0");
    }

    public double getWage() {
        return wage;
    }
    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getPieces() * getWage();
    }

    @Override
    public String toString(){
        return String.format( "piece paid  employee: %s\n%s: $%,.2f", super.toString(), "Earn: ", earnings());
    }
}
