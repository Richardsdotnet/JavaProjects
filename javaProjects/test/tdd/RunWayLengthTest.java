package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunWayLengthTest {
    @Test
    void runWayLength(){
        //given
        RunWayLength length = new RunWayLength();
        //when
        length.CalculateRunwayLength(60,3.5);
        double total = length.getAnswer();
        assertEquals(514.2857142857143, total);
    }
}
