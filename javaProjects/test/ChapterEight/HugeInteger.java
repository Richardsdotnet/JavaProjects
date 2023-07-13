package ChapterEight;

import java.math.BigInteger;
import java.util.Arrays;

public class HugeInteger {

        private final int[] elements;
        private String digits;

        public HugeInteger(int size) {
            elements = new int[size];
        }


        public void parse(String num) {
            for (int i = 0; i < num.length(); i++) {
                char toConvert = num.charAt(i);
                if (!Character.isDigit(toConvert)) {
                    continue;
                }
                elements[i] = Character.getNumericValue(toConvert);

            }
        }
        public void valueOf(String number){
            this.digits = number;
        }

    public BigInteger add(HugeInteger integer){
        BigInteger first = new BigInteger(this.digits);
        BigInteger second = new BigInteger(integer.digits);
        return first.add(second);
    }
    public BigInteger subtract(HugeInteger integer){
        BigInteger first = new BigInteger(this.digits);
        BigInteger second = new BigInteger(integer.digits);
        return first.subtract(second);
    }
    public BigInteger multiply(HugeInteger integer){
        BigInteger first = new BigInteger(this.digits);
        BigInteger second = new BigInteger(integer.digits);
        return first.multiply(second);
    }

    public BigInteger divide(HugeInteger integer){
        BigInteger integer1 = new BigInteger(this.digits);
        BigInteger integer2 = new BigInteger(integer.digits);
        return integer1.divide(integer2);
    }
    public void addToArray(int[] firstElement, int[] secondElement){
        for (int i = 0; i < firstElement.length; i++) {
            elements[i] = firstElement[i] + secondElement[i];
        }
    }
    public void subtractArrays(int[] firstElement, int[] secondElement){
        for (int i = 0; i < firstElement.length; i++) {
            if(firstElement[i] > secondElement[i]){
                elements[i] = firstElement[i] - secondElement[i];
            }else {
                elements[i] = secondElement[i] - firstElement[i];
            }

        }
    }
    public int[] returnArray(){
        return elements ;
    }

    public boolean isEqualTo(HugeInteger integer) {
        return Arrays.equals(elements, integer.elements);
    }

    public boolean isNotEqualTo(HugeInteger integer) {
        return !isEqualTo(integer);
    }
    public boolean isGreaterThan(HugeInteger integer) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > integer.elements[i]) {
                return true;
            } else if (elements[i] < integer.elements[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger integer) {
        return !isGreaterThan(integer) && !isEqualTo(integer);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger integer) {
        return !isLessThan(integer);
    }
    public boolean isLessThanOrEqualTo(HugeInteger integer) {
        return !isGreaterThan(integer);
    }


    public String toString(long value){
        return Long.toString(value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(elements));

        return sb.toString();
}

}





