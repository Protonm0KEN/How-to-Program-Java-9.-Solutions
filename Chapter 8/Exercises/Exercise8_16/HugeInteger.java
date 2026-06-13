package Exercise8_16;

import java.util.Arrays;

public class HugeInteger {
    private int[] digits;

    public HugeInteger(){
        this.digits = new int[40];
    }

    public HugeInteger(HugeInteger hugeInteger){
        this();
        System.arraycopy(hugeInteger.digits, 0, this.digits, 0, 40);
    }

    public HugeInteger(int[] digits){
        this();
        System.arraycopy(digits, 0, this.digits, 0, 40);
    }


    public void parse(String hugeNumber){
        if(hugeNumber.length() < 40){
            while(hugeNumber.length()<40){
                hugeNumber = "0"+hugeNumber;
            }
        }
        for(int i = 0; i<40; i++){
            int digit = Integer.parseInt(String.valueOf(hugeNumber.charAt(i)));
            if(digit >=0){
                this.digits[i] = digit;
            }else throw new IllegalArgumentException("Digit can not be less than zero, check the input string!");
        }
    }

    //predicate methods
    public static boolean isEqualTo(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        for(int i = 0; i<40; i++){
            if(hugeInteger1.digits[i] != hugeInteger2.digits[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean isNotEqualTo(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        return !isEqualTo(hugeInteger1, hugeInteger2);
    }

    public static boolean isGreaterThan(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        for(int i = 0; i<40; i++) {
            if (hugeInteger1.digits[i] > hugeInteger2.digits[i]) return true;
            if (hugeInteger1.digits[i] < hugeInteger2.digits[i]) return false;
        }
        return false;
    }
    public static boolean isLessThan(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        return isGreaterThan(hugeInteger2, hugeInteger1);
    }
    
    public static boolean isGreaterThanOrEqualTo(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        return isGreaterThan(hugeInteger1, hugeInteger2) || isEqualTo(hugeInteger1, hugeInteger2);
    }
    public static boolean isLessThanOrEqualTo(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        return isLessThan(hugeInteger1, hugeInteger2) || isEqualTo(hugeInteger1, hugeInteger2);
    }

    public static boolean isZero(HugeInteger hugeInteger){
        for(int i = 0; i<40; i++){
            if(hugeInteger.digits[i] != 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "HugeInteger{" +
                "digits=" + Arrays.toString(digits) +
                '}';
    }
    public static HugeInteger add(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        HugeInteger resultHugerInteger = new HugeInteger();
        int carry = 0;
        for(int i = 39; i>=0; i--){
            if(hugeInteger1.digits[i] + hugeInteger2.digits[i] + carry < 10){
                resultHugerInteger.digits[i] = hugeInteger1.digits[i] + hugeInteger2.digits[i] + carry;
                carry = 0;
            }else{
                resultHugerInteger.digits[i] = (hugeInteger1.digits[i] + hugeInteger2.digits[i]+carry)%10;
                carry = (hugeInteger1.digits[i] + hugeInteger2.digits[i]+carry)/10;
            }
        }
        if (carry > 0) {
            throw new ArithmeticException("Overflow: Sum exceeds 40 digits!");
        }
        return resultHugerInteger;
    }

    public static HugeInteger subtract(HugeInteger hugeInteger1, HugeInteger hugeInteger2){
        if (isLessThan(hugeInteger1, hugeInteger2)) {
            throw new ArithmeticException("Negative results are not supported.");
        }

        HugeInteger resultHugeInteger = new HugeInteger();
        int borrow = 0;

        for (int i = 39; i >= 0; i--) {
            int diff = hugeInteger1.digits[i] - hugeInteger2.digits[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultHugeInteger.digits[i] = diff;
        }

        return resultHugeInteger;
    }
}
