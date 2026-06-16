package Exercise10_9.AbstractClassesAndIntefaces;

public abstract class ThreeDimensionalShape extends Shape {

    //This method is going to be implemented in concrete classes to getArea.
    // It is abstract here, since we can't call it from this class, and just ThreeDimensionalShape object may not have an area without more details

    //There could be an interface, like TwoDimensionable, or smth like that, to get this method, but it is easier to redeclare it here
    public abstract double getArea();


    //This method is going to be implemented in concrete classes to getVolume.
    // It is abstract here, since we can't call it from this class, and just ThreeDimensionalShape object may not have an area without more details
    public abstract double getVolume();
}
