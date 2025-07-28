public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.move(10);
//        Movable movable = new Car();
//        movable.move(100);

        Movable movableCar = (distance)-> {
            System.out.println("Car moved: " + distance);
        };
        movableCar.move(10);
        Movable movableBicycle = (distance)-> {
            System.out.println("Bicycle moved: " + distance);
        };
        movableBicycle.move(10);

    }
}