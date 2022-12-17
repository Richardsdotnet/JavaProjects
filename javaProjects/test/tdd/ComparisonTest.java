package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Comparison;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {
    //instance variable
    Comparison comparison;

    @BeforeEach
    //annotation
    void startAllTestWith(){
    // instantiation
        comparison = new Comparison();
    }
    @Test
    void addThreeInteger(){
        assertEquals(10,comparison.addThreeIntegers(2,3,5));
    }
    @Test
    void averageThreeIntegers(){
        int average = comparison.averageThreeIntegers(5,5,20);
        assertEquals(10, average);
    }
    @Test
    void productOfThreeIntegers(){
        int product = comparison.productOfThreeIntegers(2,2,2);
        assertEquals(8, product);
    }

    @Test
    void findMinimumOfThreeInteger(){
        int minimum = comparison.findMinimumOfThreeIntegers(2,4,5);
        assertEquals(2, minimum);
    }
    @Test
    void findMaximumOfThreeIntegers(){
        int maximum = comparison.maximumInteger(3,4,8);
        assertEquals(8,maximum);
    }
    @Test
    void squareOfSumOfThreeIntegers(){
        int sum = comparison.squareOfSumOfThreeIntegers(2,2,2);
        int square = sum * sum;
        assertEquals(36, square);
    }

}

