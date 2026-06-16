package Exercise10_9.ConreteShapeClasses.ThreeDimensionalShapes;

import Exercise10_9.AbstractClassesAndIntefaces.ThreeDimensionalShape;

public class Sphere extends ThreeDimensionalShape {
    private double radius;

    public Sphere( double radius ){
        setRadius( radius );
    }

    public void setRadius( double radius ){
        if( radius >= 0.0 ){
            this.radius = radius;
        }else throw new IllegalArgumentException( "Radius must be >= 0.0" );
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow( getRadius(), 2 );
    }

    @Override
    public double getVolume() {
        return (double) 4 /3 * Math.PI * Math.pow( getRadius(), 3);
    }

    @Override
    public String toString() {
        return super.toString() + "Sphere";
    }
}
