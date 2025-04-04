package assignments.tddSnacks;
public class AutomaticBike {
    private int accelerate;
    private final boolean gearOne;
    private final boolean gearTwo;
    private final boolean gearThree;
    private final boolean gearFour;
    private boolean startBike;

    public AutomaticBike() {
        this.accelerate = 0;
        this.gearOne = false;
        this.gearTwo = false;
        this.gearThree  = false;
        this.gearFour = false;
    }

    public boolean switchOnBike() {
        if (!startBike) {
            startBike = true;
        } return true;
    }
    public boolean switchOffBike() {
        startBike = false;
        return false;
    }

    public int accelerateBike() {
        if (startBike) {
            if (gearOne) {
            if (accelerate <= 20) accelerate++;
            } else if (gearTwo) {
                if (accelerate <= 30) accelerate += 2;
            } else if (gearThree) {
                if (accelerate <= 40) accelerate += 3;
            } else if (gearFour) {
                if (accelerate >= 41) accelerate += 4;
            }
        }
        return accelerate;
    }
    public int getSpeed() {return accelerate;}
}