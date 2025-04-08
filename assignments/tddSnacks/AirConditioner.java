package assignments.tddSnacks;
public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 16;
    }
    public boolean switchOnAc() {
        if (!isOn) {
            isOn = true;
            return true;
        } return false;
    }
    public boolean switchOffAc() {
            isOn = false;
            temperature = 0;
            return false;
    }
    public int increaseTemperature() {
        if (isOn) {
            temperature++;
            if (temperature >= 30) temperature = 30;
        } return temperature;
    }
    public int decreaseTemperature() {
        if (isOn) {
            temperature--;
            if (temperature <= 16) temperature = 16;
        } return temperature;
    }
    public int getTemperature() {return temperature;}
}
