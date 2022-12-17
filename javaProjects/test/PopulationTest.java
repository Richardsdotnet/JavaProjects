import chapterTwo.Population;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopulationTest {
    @Test
    void firstYearPopulation() {
        Population population = new Population();
        int firstYear = population.firstYearIncrement(3000,60000);
        assertEquals(63000,firstYear);

    }
    @Test
    void secondYearPopulation(){
        Population population = new Population();
        double secondYear = population.secondYearIncrement(3332.5,63000);
        assertEquals(66332.5, secondYear);
    }
    @Test
    void thirdYearPopulation(){
        Population population = new Population();
        double thirdYear = population.thirdYearIncrement(3332.5,66650 );
        assertEquals(69982.5,thirdYear);
    }
    @Test
    void forthYearPopulation(){
        Population population = new Population();
        double forthYear = population.forthYearIncrement(3499.125,69982.5);
        assertEquals(73481.625,forthYear);

    }
}
