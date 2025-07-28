import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.move(10);

//        Movable movableCar = (distance) -> {
//            System.out.println("Car moved: " + distance);
//        }; movableCar.move(10);
//
//        Movable movableBicycle = (distance) -> {
//            System.out.println("Bicycle moved: " + distance);
//        }; movableBicycle.move(10);

        PasswordEncoder checker = (password, reversed) -> {
            return password.equals(reversePass(reversed));
        };

        PasswordEncoder check = (password, reversed) -> {
            return password.length() == reversed.length();
        };

        String password = "lola";
        String reversed = "alol";
        System.out.println(checker.isReversePassword(password, reversed));
        System.out.println(check.isReversePassword(password, reversed));
    }

    private static String reversePass(String password) {
        String result = "";
        for (int counter = password.length() - 1; counter >= 0; counter--) {
            result += password.charAt(counter);
        }
        return result;
    }


}