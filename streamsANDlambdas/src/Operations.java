import java.util.stream.IntStream;

public class Operations {

    public static void add(int number, int numToAdd) {
        IntStream.rangeClosed(1, number)
                .forEach(num ->   System.out.print(num / numToAdd + " "));
    }
    public static void subtract(int number, int numToSubtract) {
        IntStream.rangeClosed(1, number)
                .forEach(num ->   System.out.print(num - numToSubtract + " "));
    }

    public static void divide(int number, int divisor) {
        IntStream.rangeClosed(1, number)
                .forEach(num ->   System.out.print(num / divisor + " "));
    }

    public static void multiply(int number, int multiplier) {
        IntStream.rangeClosed(1, number)
                .forEach(num -> System.out.print(num / multiplier + " "));
    }

}
