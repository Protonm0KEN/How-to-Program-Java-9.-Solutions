package Exercise8_4;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle(){
        this.length = 1;
        this.width = 1;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


    public double getPerimeter(){
        return 2*(length+width);
    }
    public double getArea(){
        return length*width;
    }


    public void setWidth(double width) {
        try{
            if(width >= 0.0 && width <= 20.0){
                this.width = width;
            }else {
                throw new IllegalArgumentException(String.format("\nWidth should be in range from 0.0 to 20.0, value %f is not in this range\n", width));
            }
        }catch (IllegalArgumentException exceptionObject){
            System.out.printf(exceptionObject.getMessage());
        }
    }
    public void setLength(double length) {
        try{
            if(length >= 0.0 && length <= 20.0){
                this.length = length;
            }else {
                throw new IllegalArgumentException(String.format("\nLength should be in range from 0.0 to 20.0, value %f is not in this range\n", width));
            }
        }catch (IllegalArgumentException exceptionObject){
            System.out.printf(exceptionObject.getMessage());
        }
    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
}
