package Exercise10_9.ConreteShapeClasses.TwoDimensionalShapes;

import Exercise10_9.AbstractClassesAndIntefaces.TwoDimensionalShape;

public class Triangle extends TwoDimensionalShape {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle( double firstSide, double secondSide, double thirdSide ){
        if( isTriangleValid( firstSide, secondSide, thirdSide ) ){
            setSide( firstSide, 1 );
            setSide( secondSide, 2 );
            setSide( thirdSide, 3 );
        }else throw new IllegalArgumentException( "The chosen sides are not sides of the triangle" );
    }
    private boolean isTriangleValid( double firstSide, double secondSide, double thirdSide ){
        return (firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide) && (secondSide + thirdSide > firstSide);
    }
    public void setSide( double sideLength, int sideNumber ){
        if( sideLength >= 0.0){
            switch( sideNumber ){
                case 1:
                    this.firstSide = sideLength;
                    break;
                case 2:
                    this.secondSide = sideLength;
                    break;
                case 3:
                    this.thirdSide = sideLength;
                    break;
                default:
                    throw new IllegalArgumentException( "Incorrect side choice, it can be 1, 2 or 3" );
            }
        }else throw new IllegalArgumentException( "Incorrect side length, it can be only >=0.0" );
    }

    private double getSemiPerimeter(){
        return ( firstSide + secondSide + thirdSide ) / 2.0;
    }


    @Override
    public double getArea() {
        double semiPerimeter = getSemiPerimeter();
        return Math.sqrt( semiPerimeter * ( semiPerimeter - firstSide ) * ( semiPerimeter - secondSide ) * ( semiPerimeter - thirdSide ) );
    }

    @Override
    public String toString() {
        return super.toString() + "Triangle";
    }
}
