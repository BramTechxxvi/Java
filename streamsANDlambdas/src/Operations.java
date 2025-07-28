import java.util.stream.IntStream;

public class Operations {

    public static int addNumbers() {
        return 0;

    }
    public static int subtract() {
        return 0;
    }

    public static void divide(int number, int divisor) {
        IntStream.rangeClosed(1, number)
                .forEach(num ->   System.out.println(num / divisor + " "));
    }

    public static void multiply(int number, int multiplier) {
        IntStream.rangeClosed(1, number)
                .forEach(num ->   System.out.println(num / multiplier + " "));
    }

    public static int evenNumbers() {
        return 0;
    }

    public static int oddNumbers() {
        return 0;
    }


}
