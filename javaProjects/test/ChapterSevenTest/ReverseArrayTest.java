package ChapterSevenTest;


import ChapterSevenArrays.ReversedArray;
import org.junit.jupiter.api.Test;

import static ChapterSevenArrays.ReversedArray.arrayReverse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTest {
    @Test
    public void reversedArrayTest(){
        int [] numbers = {2,3,4,5};
        assertArrayEquals(new int[]{5,4,3,2}, arrayReverse(numbers));
    }

}
