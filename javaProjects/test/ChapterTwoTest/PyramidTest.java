package ChapterTwoTest;

import chapterTwo.Pyramid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest {
    @Test
    void eachYear(){
        Pyramid pyramid = new Pyramid();
        int firstYear = pyramid.firstYearWeight(2, 500);
        assertEquals(1000,firstYear);
    }
    @Test
    void eachHour(){
        Pyramid pyramid = new Pyramid();
        double weightPerHour = pyramid.weightPerHour(20000,8760);
        assertEquals(2.0, weightPerHour);
    }
    @Test
    void weightPerMinute(){
        Pyramid pyramid = new Pyramid();
        double weight = pyramid.weightPerMinute(20000,525600);
        assertEquals(0.03805175038051750380517503805175,weight);
    }
}
