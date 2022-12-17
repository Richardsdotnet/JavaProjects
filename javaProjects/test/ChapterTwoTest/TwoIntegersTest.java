package ChapterTwoTest;

import chapterTwo.TwoIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoIntegersTest {
    @Test

    void squareOfFirstInteger() {
        TwoIntegers twoIntegers = new TwoIntegers();
        int square = twoIntegers.squareOfFirstIntegers(3);
        assertEquals(9,square);
    }
    @Test

    void squareOfSecondInteger(){
        TwoIntegers twoIntegers = new TwoIntegers();
        int square = twoIntegers.squareOfSecondIntegers(2);
        assertEquals(4,square);
    }
    @Test
    void sumOfSquares(){
        TwoIntegers twoIntegers = new TwoIntegers();
        int sumOfSquares = twoIntegers.sumOfSquareOfTwoIntegers(2,4);
        assertEquals(20,sumOfSquares);
    }
    @Test
    void differenceOfSquare(){
        TwoIntegers twoIntegers = new TwoIntegers();
        int squareDifference = twoIntegers.sumOfSquareDifference(5,3);
        assertEquals(16,squareDifference);
    }
}

