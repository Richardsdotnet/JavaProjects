import chapter17.streams.StreamAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamAlgorithmTest {

    @Test
    public void testCountSpecialCharacters(){
        String [] strings = {"911@aab23", "wc4%@123-", "AHc@123+", "653ttd<_#"};
        long numberOfSpecialCharacters = StreamAlgorithm.countSpecialCharacters(strings);
        assertEquals(9L, numberOfSpecialCharacters);

    }
}
