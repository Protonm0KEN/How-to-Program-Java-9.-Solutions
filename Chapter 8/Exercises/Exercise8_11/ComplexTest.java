package Exercise8_11;

public class ComplexTest {
    public void main(String[] args){
        Complex complexNumber1 = new Complex(10, 15);
        Complex complexNumber2 = new Complex(5, 3);
        Complex additionResult = Complex.addComplexNumbers(complexNumber1, complexNumber2);
        Complex subtractionResult = Complex.subtractComplexNumbers(complexNumber1, complexNumber2);
        System.out.println(additionResult+"\n"+subtractionResult);
    }
}
