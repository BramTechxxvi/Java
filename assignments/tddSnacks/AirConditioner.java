package assignments.tddSnacks;
public class AirConditioner {
    private boolean onAc = false;
    private int temperature = 16;

    public boolean switchOnAc() {
        onAc = true;
        return true;
    }
    public boolean switchOffAc() {
        onAc = false;
        return false;
    }
    public int increaseTemp() {
        if (onAc) temperature++;
        if (temperature >= 30) temperature = 30;
        return temperature;
    }
    public int decreaseTemp() {
        if (onAc) temperature--;
        if (temperature <= 16) temperature = 16;
        return temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
