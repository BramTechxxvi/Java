package assignments.tddSnacks;
public class AutomaticBike {
    private int counter;
    private boolean startBike;


    public boolean switchOnBike() {
        if (!startBike) {
            startBike = true;
        } return true;
    }

    public boolean switchOffBike() {
        if (startBike) {
            startBike = false;
        } return false;
    }

}