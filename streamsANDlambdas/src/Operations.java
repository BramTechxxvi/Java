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
                .forEach(num ->   System.out.print(num / divisor + " "));
    }

    public static int multiply() {
        return 0;
    }

    public static int evenNumbers() {
        return 0;
    }

    public static int oddNumbers() {
        return 0;
    }


}
