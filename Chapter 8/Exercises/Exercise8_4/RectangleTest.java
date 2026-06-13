package Exercise8_4;

public class RectangleTest {
    public static void main(String[] args){
        Rectangle rectangleObj = new Rectangle(20,10);
        System.out.printf("Perimeter is: %f\nArea is: %f\n", rectangleObj.getPerimeter(), rectangleObj.getArea());
    }
}
