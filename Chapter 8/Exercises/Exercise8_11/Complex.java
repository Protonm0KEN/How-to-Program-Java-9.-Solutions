package Exercise8_11;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public static Complex addComplexNumbers(Complex firstComplexNumber, Complex secondComplexNumber){
        Complex resultComplexNumber = new Complex(0,0);
        resultComplexNumber.setRealPart(firstComplexNumber.getRealPart()+secondComplexNumber.getRealPart());
        resultComplexNumber.setImaginaryPart(firstComplexNumber.getImaginaryPart()+secondComplexNumber.getImaginaryPart());
        return resultComplexNumber;
    }

    public static Complex subtractComplexNumbers(Complex firstComplexNumber, Complex secondComplexNumber){
        Complex resultComplexNumber = new Complex(0,0);
        resultComplexNumber.setRealPart(firstComplexNumber.getRealPart()-secondComplexNumber.getRealPart());
        resultComplexNumber.setImaginaryPart(firstComplexNumber.getImaginaryPart()-secondComplexNumber.getImaginaryPart());
        return resultComplexNumber;
    }

    public String toString(){
        return String.format("\nComplex number is: %f + %fi, (%f, %f)\n", this.realPart, this.imaginaryPart, this.realPart, this.imaginaryPart);
    }
}
