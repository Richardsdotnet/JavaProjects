package ChapterEight;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntegerTest {
    private final int size = 10;
    HugeInteger hugeInteger = new HugeInteger(size);

    @Test
    void parse(){
        String number = "1928374650";
        hugeInteger.parse(number);
        int[] expected = {1,9,2,8,3,7,4,6,5,0};
        assertArrayEquals(expected,hugeInteger.returnArray());
    }

    @Test
    void integersCanBeAdded(){
        HugeInteger firstHugeInteger = new HugeInteger(5);
        HugeInteger secondHugeInteger = new HugeInteger(5);

        firstHugeInteger.valueOf("12345");
        secondHugeInteger.valueOf("12345");

        BigInteger sum = firstHugeInteger.add(secondHugeInteger);
        long result = sum.longValue();

        assertEquals(24690,result);
    }
    @Test
    void integersCanBeSubtracted(){
        HugeInteger firstHugeInteger = new HugeInteger(8);
        HugeInteger secondHugeInteger = new HugeInteger(8);

        firstHugeInteger.valueOf("9876543210");
        secondHugeInteger.valueOf("1234567890");

        BigInteger answer = firstHugeInteger.subtract(secondHugeInteger);
        long newAnswer = answer.longValue();

        assertEquals(8641975320L,newAnswer);
    }

    @Test
    void intergersCanBeMultiplied(){
        HugeInteger firstHugeInteger = new HugeInteger(5);
        HugeInteger secondHugeInteger = new HugeInteger(5);

        firstHugeInteger.valueOf("1234567");
        secondHugeInteger.valueOf("987654");

        BigInteger answer = firstHugeInteger.multiply(secondHugeInteger);
        long newAnswer = answer.longValue();

        assertEquals(1219325035818L,newAnswer);
    }
    @Test
    void integersCanBeDivided(){
        HugeInteger firstHugeInteger = new HugeInteger(5);
        HugeInteger secondHugeInteger = new HugeInteger(5);

        firstHugeInteger.valueOf("987654321098");
        secondHugeInteger.valueOf("12345678");

        BigInteger answer = firstHugeInteger.divide(secondHugeInteger);
        long newAnswer = answer.longValue();

        assertEquals(80000,newAnswer);
    }
    @Test
    void arrayCanBeAddedTo(){
        int[] firstArray = {2,4,6,8,10};
        int[] secondArray = {1,3,5,7,9};
        hugeInteger.addToArray(firstArray,secondArray);

        int[] expected = {3,7,11,15,19,0,0,0,0,0};
        assertArrayEquals(expected,hugeInteger.returnArray());
    }
    @Test
    void arrayCanBeSubtractedFrom(){
        int[] firstArray = {10,5,9,7,3,20,30,12,10,60};
        int[] secondArray = {3,3,5,7,1,11,15,8,5,20};
        hugeInteger.subtractArrays(firstArray,secondArray);

        int[] expected = {7,2,4,0,2,9,15,4,5,40};
        assertArrayEquals(expected,hugeInteger.returnArray());
    }
    @Test
    void isGreaterThan(){
            HugeInteger firstHugeInteger = new HugeInteger(6);
            HugeInteger secondHugeInteger = new HugeInteger(6);

            int[] firstArray = {50,40,60,80,100,55};
            int[] secondArray = {1,3,5,7,9,7,12};
            firstHugeInteger.addToArray(firstArray,secondArray);

            int[] thirdArray = {4,6,7,8,10};
            int[] fourthArray = {1,3,5,7,9};
            secondHugeInteger.addToArray(thirdArray,fourthArray);
            assertTrue(firstHugeInteger.isGreaterThan(secondHugeInteger));
        }
    @Test
    void isLessThan(){
        HugeInteger firstHugeInteger = new HugeInteger(6);
        HugeInteger secondHugeInteger = new HugeInteger(6);

        int[] thirdArray = {4,6,7,8,10};
        int[] fourthArray = {1,3,5,7,9};
        firstHugeInteger.addToArray(thirdArray,fourthArray);

        int[] firstArray = {50,40,60,80,100,55};
        int[] secondArray = {1,3,5,7,9,7,12};
        secondHugeInteger.addToArray(firstArray,secondArray);
        assertTrue(firstHugeInteger.isLessThan(secondHugeInteger));
    }
    @Test
    void isEqual(){
        HugeInteger firstHugeInteger = new HugeInteger(5);
        HugeInteger secondHugeInteger = new HugeInteger(5);

        assertTrue(firstHugeInteger.isEqualTo(secondHugeInteger));
        assertFalse(firstHugeInteger.isNotEqualTo(secondHugeInteger));
    }
    @Test
    void isNotEqual(){
        HugeInteger firstHugeInteger = new HugeInteger(6);
        HugeInteger secondHugeInteger = new HugeInteger(5);
        assertTrue(firstHugeInteger.isNotEqualTo(secondHugeInteger));
        assertFalse(firstHugeInteger.isEqualTo(secondHugeInteger));
    }
    @Test
    void greaterThanOrEqualTo(){
        HugeInteger firstHugeInteger = new HugeInteger(6);
        HugeInteger secondHugeInteger = new HugeInteger(6);

        int[] firstArray = {50,40,60,80,100,55};
        int[] secondArray = {1,3,5,7,9,7,12};
        firstHugeInteger.addToArray(firstArray,secondArray);

        int[] thirdArray = {4,6,7,8,10};
        int[] fourthArray = {1,3,5,7,9};
        secondHugeInteger.addToArray(thirdArray,fourthArray);

        assertTrue(firstHugeInteger.isGreaterThanOrEqualTo(secondHugeInteger));
        assertFalse(secondHugeInteger.isGreaterThanOrEqualTo(firstHugeInteger));
    }
    @Test
    void lessThanOrEqualTo(){
        HugeInteger firstHugeInteger = new HugeInteger(6);
        HugeInteger secondHugeInteger = new HugeInteger(6);

        int[] firstArray = {4,6,7,8,10};
        int[] secondArray = {1,3,5,7,9};
        firstHugeInteger.addToArray(firstArray,secondArray);

        int[] thirdArray = {50,40,60,80,100,55};
        int[] fourthArray = {1,3,5,7,9,7,12};
        secondHugeInteger.addToArray(thirdArray,fourthArray);

        assertTrue(firstHugeInteger.isLessThanOrEqualTo(secondHugeInteger));
        assertFalse(secondHugeInteger.isLessThanOrEqualTo(firstHugeInteger));
}


}







