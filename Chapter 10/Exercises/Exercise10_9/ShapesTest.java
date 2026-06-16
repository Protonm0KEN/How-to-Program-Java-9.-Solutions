package Exercise10_9;

import Exercise10_9.AbstractClassesAndIntefaces.Shape;
import Exercise10_9.AbstractClassesAndIntefaces.ThreeDimensionalShape;
import Exercise10_9.AbstractClassesAndIntefaces.TwoDimensionalShape;
import Exercise10_9.ConreteShapeClasses.ThreeDimensionalShapes.Cube;
import Exercise10_9.ConreteShapeClasses.ThreeDimensionalShapes.Sphere;
import Exercise10_9.ConreteShapeClasses.ThreeDimensionalShapes.Tetrahedron;
import Exercise10_9.ConreteShapeClasses.TwoDimensionalShapes.Circle;
import Exercise10_9.ConreteShapeClasses.TwoDimensionalShapes.Square;
import Exercise10_9.ConreteShapeClasses.TwoDimensionalShapes.Triangle;

public class ShapesTest {
    public static void main(String[] args){
        Shape[] shapes = {

                //TwoDimensional shape objects (From concrete classes)
                new Circle(12.5),
                new Square(15.7),
                new Triangle(3, 4, 5),

                //ThreeDimensional shape objects ( From concrete classes )
                new Sphere(12.5),
                new Cube(15.7),
                new Tetrahedron(18),

        };

        for( Shape shapeReferenceVariable : shapes ){
            System.out.println( shapeReferenceVariable );
            if( shapeReferenceVariable instanceof TwoDimensionalShape ){
                System.out.printf("Area is: %,.2f\n", ((TwoDimensionalShape) shapeReferenceVariable).getArea());
            }
            if( shapeReferenceVariable instanceof ThreeDimensionalShape ){
                System.out.printf("Area is: %,.2f\n", ((ThreeDimensionalShape) shapeReferenceVariable).getArea());
                System.out.printf("Volume is: %,.2f\n", ((ThreeDimensionalShape) shapeReferenceVariable).getVolume());
            }
            System.out.println();
        }


    }
}
