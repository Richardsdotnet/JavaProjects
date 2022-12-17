package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {
    @Test
    public void powerOnTest(){
        //given that i have an airConditioner
        AirConditioner myAirConditioner = new AirConditioner();
        //my airConditioner is on
        myAirConditioner.setOn(true);
        // check if my airConditioner is on when i power on
        assertTrue(myAirConditioner.getPower());

    }

    @Test
    public void productNameTest(){
        //given i have an airConditioner
        AirConditioner myAirConditioner = new AirConditioner();
        // I want  to name my airConditioner
        myAirConditioner.setProductName("samsung");
        // get myAirConditioner name;
        assertEquals("samsung", myAirConditioner.getProductName());
    }
    @Test
    public void increaseTemperature(){
        //given i have an airConditioner
        AirConditioner myAirConditioner = new AirConditioner();
        // power on the airConditioner
        myAirConditioner.setOn(true);
        // when you increase temperature of airConditioner
        myAirConditioner.increaseTemperature();
        //check if temperature increases
        assertEquals(17, myAirConditioner.getTemperature());
    }

    @Test
    public void decreaseTemperature(){
        //given i have an airConditioner;
        AirConditioner myAirConditioner = new AirConditioner();
        // i power on my airConditioner;
        myAirConditioner.setOn(true);
        // when you decrease temperature of airConditioner;
        myAirConditioner.decreaseTemperature(1);
        //check if temperature decreases;
        assertEquals(15, myAirConditioner.getTemperature());

    }

    @Test
    public void temperatureAbove30(){
        //given i have an airConditioner
        AirConditioner myAirConditioner = new AirConditioner();
        //i power my airConditioner on
        myAirConditioner.setOn(true);
        //when i set temperature beyond 30, temperature remains 30
        myAirConditioner.setTemperature(30);
        // check that temperature does not exceed 30
        assertEquals(30, myAirConditioner.getTemperature());
    }

    @Test
    public void temperatureBelow16(){
        //given i have an airConditioner;
        AirConditioner myAirconditioner = new AirConditioner();
        // i power on my airConditioner;
        myAirconditioner.setOn(true);
        // when i set temperature below 16 degree
        myAirconditioner.setTemperature(16);
        //check that temperature is still 16
        assertEquals(16, myAirconditioner.getTemperature());

    }
}
