import java.util.stream.IntStream;

public class FactorialMethods {

    public static double calculateFactorial(int number) {
        if(number < 1) throw new IllegalArgumentException(":(");
        return IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);
    }

    public static double calculateFactorial2(int number) {
        if(number < 1) throw new IllegalArgumentException(":(");
        int factorial = 1;
        for(int counter = number; counter > 0; counter--) {
            factorial *= counter;
        }
        return factorial;
    }
}
