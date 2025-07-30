public class Car implements Movable{

    @Override
    public void move(int distance) {
        System.out.println("Car moved: " + distance + " miles");
    }
}