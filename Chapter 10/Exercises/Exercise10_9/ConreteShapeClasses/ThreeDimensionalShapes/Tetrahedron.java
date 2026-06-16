package Exercise10_9.ConreteShapeClasses.ThreeDimensionalShapes;

import Exercise10_9.AbstractClassesAndIntefaces.ThreeDimensionalShape;

public class Tetrahedron extends ThreeDimensionalShape {
    private double sideLength;

    public Tetrahedron( double sideLength ){
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
        return Math.pow( getSideLength(), 2 ) * Math.sqrt(3);
    }

    @Override
    public double getVolume() {
        return Math.pow( getSideLength(), 3 ) * Math.sqrt(2) / 12.0;
    }

    @Override
    public String toString() {
        return super.toString() + "Tetrahedron";
    }
}
