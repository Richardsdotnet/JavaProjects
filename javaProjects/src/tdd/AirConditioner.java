package tdd;

public class AirConditioner {
    private boolean isOn;
    private String name;
    private int temperature;

    public void setOn(boolean power ) {
        temperature = 16;
        if(power == true) isOn = true;
    }

    public boolean getPower() {
        return isOn;
    }

    public void setProductName(String samsung) {
        name = samsung;
    }

    public String getProductName() {
        return name;
    }



    public void increaseTemperature() {
        if(temperature >= 16) {

        temperature = temperature + 1;
        }
    }

    public int getTemperature() {
        return temperature;
     }

    public void decreaseTemperature( int degree) {
        if (temperature <=17){
            temperature = temperature - degree;
        }
    }

    public void setTemperature(int temperatureDegree) {
        if(temperatureDegree > 30){
            temperature = 30;
        }
        else if (temperatureDegree < 16) {
            temperature = 16;
        }
        else{
            temperature = temperatureDegree;
        }

    }

}
