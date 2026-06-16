package Exercise10_9.AbstractClassesAndIntefaces;


//It is assumed that class Shape itself should be abstract, since it makes no sense to have object, like Shape!
public abstract class Shape {
    @Override
    public String toString() {
        return "This shape is: ";
    }
}
