package Exercise10_9.ConreteShapeClasses.TwoDimensionalShapes;

import Exercise10_9.AbstractClassesAndIntefaces.TwoDimensionalShape;

public class Square extends TwoDimensionalShape {

    private double sideLength;

    public Square( double sideLength ){
        setSideLength(sideLength);
    }
    public void setSideLength(double sideLength) {
        if( sideLength >= 0.0 ){
            this.sideLength = sideLength;
        }else throw new IllegalArgumentException( "Side length must be >= 0.0" );
    }
    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return getSideLength() * getSideLength();
    }
    @Override
    public String toString() {
        return super.toString() + "Square";
    }
}
