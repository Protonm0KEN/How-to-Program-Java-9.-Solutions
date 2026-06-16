package Exercise10_9.ConreteShapeClasses.ThreeDimensionalShapes;

import Exercise10_9.AbstractClassesAndIntefaces.ThreeDimensionalShape;

public class Cube extends ThreeDimensionalShape {
    private double sideLength;

    public Cube( double sideLength ){
        setSideLength( sideLength );
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
        return 6 * Math.pow( getSideLength(), 2);
    }

    @Override
    public double getVolume() {
        return Math.pow( getSideLength(), 3);
    }

    @Override
    public String toString() {
        return super.toString() + "Cube";
    }
}
