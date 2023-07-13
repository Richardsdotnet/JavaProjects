package ChapterSevenArrays;

import static ChapterSevenArrays.LowestCommonMultiple.returnLcmOfInteger;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LowestCommonMultipleTest {

        @Test
        public void TestThatTheLcmOfAnIntegerCanBeFound(){
            int number = 8;
            assertArrayEquals(new int[] {2,2,2},returnLcmOfInteger(number));
}

    }


