public class Car implements Movable{

    @Override
    public void move(int distance) {
        System.out.println("Bicycle moved: " + distance + " miles");
    }
}
