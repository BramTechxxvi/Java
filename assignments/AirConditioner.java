package assignments;
public class AirConditioner {
    private boolean onAc;
    private int temperature = 16;
    /*
    public AirConditioner() {
        this.onAc = onAc;
        this.temperature = temperature;

    }
    */
    public boolean switchOnAc() {
        if(!onAc) {
            onAc = true;
            return true;
        }return false;
    }
    public boolean switchOffAc(){
        if(onAc) {
            onAc = false;
            return false;
        }return false;
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
    }}
