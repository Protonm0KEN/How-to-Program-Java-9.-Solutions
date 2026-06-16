package Exercise10_9.ConreteShapeClasses.TwoDimensionalShapes;

import Exercise10_9.AbstractClassesAndIntefaces.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle( double radius ){
        setRadius(radius);
    }

    public void setRadius( double radius ){
        if( radius >= 0.0 ){
            this.radius = radius;
        }else throw new IllegalArgumentException( "Radius can be >= 0.0" );
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow( getRadius(), 2 ); //Legendary pi*r^2;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle";
    }
}
