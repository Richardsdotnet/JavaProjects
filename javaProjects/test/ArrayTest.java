import ChapterSevenArrays.ArrayMultiply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {

    ArrayMultiply arrayMultiply;

    @BeforeEach
    void checkAll(){
        arrayMultiply = new ArrayMultiply();
        Assertions.assertNotNull(arrayMultiply);
    }
    @Test
    void checkMultiply(){
        int [] array = {2, 4, 6, 3, 5, 1};
        int [] real = {4, 16, 36, 9, 25, 1};
        assertArrayEquals(real, arrayMultiply.multiplyIndex(array));
    }
    @Test
    void checkAscend(){
        int [] array = {2, 4, 6, 3, 5, 1};
        int [] real = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(real, arrayMultiply.ascendingSort(array));
    }
    @Test
    void checkDescend(){
        int [] array = {2, 4, 6, 3, 5, 1};
        int [] real = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(real, arrayMultiply.descendingSort(array));
    }
}
