import java.util.stream.IntStream;

public class FactorialMethods {

    public static double calculateFactorial(int number) {
        if(number < 1) throw new IllegalArgumentException(":(");
        return IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }
}
