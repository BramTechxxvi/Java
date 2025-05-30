package assignments.tddSnacks;
public class AutomaticBike {
    private int accelerate;
    private int currentGear;
    private boolean startBike;

    public AutomaticBike() {
        accelerate = 0;
        currentGear = 0;
    }
    public boolean switchOnBike() {
        startBike = true;
        return true;
    }
    public boolean switchOffBike() {
        startBike = false;
        accelerate = 0;
        return false;
    }
    public void setGear(int gear) {
        if (gear>=1 && gear <=4) currentGear = gear;
    }
    public int accelerateBike() {
        if (startBike) {
        switch (currentGear) {
            case 1: if (accelerate <= 20) accelerate++; break;
            case 2: if (accelerate <= 30) accelerate+=2; break;
            case 3: if (accelerate <= 40) accelerate+=3; break;
            case 4: accelerate+=4; break;
            }} return accelerate;
    }
    public int decelerateBike() {
        if (startBike) {
        switch (currentGear) {
            case 1: if (accelerate <= 20) accelerate--; break;
            case 2: if (accelerate <= 30) accelerate-=2; break;
            case 3: if (accelerate <= 40) accelerate-=3; break;
            case 4: accelerate-=4; break;
            }} return accelerate;
    }
    public int getSpeed() {return accelerate;}}