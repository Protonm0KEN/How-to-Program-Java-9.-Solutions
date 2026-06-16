package Exercise10_9.AbstractClassesAndIntefaces;


//It is assumed that class TwoDimensionalShape itself should be abstract, since it makes no sense to have object, like TwoDimensionalShape!
public abstract class TwoDimensionalShape extends Shape {

    //This method is going to be implemented in concrete classes to getArea.
    // It is abstract here, since we can't call it from this class, and just TwoDimensionalShape object may not have an area without more details
    public abstract double getArea();
}
