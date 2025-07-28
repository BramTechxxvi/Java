import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(num -> System.out.print(num + " "));
        System.out.println();
        IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
        System.out.println();

        List<String> words = Arrays.asList("apple", "app", "applet", "Banana");
        words.forEach(word -> System.out.print(word + " "));

        System.out.println(FactorialMethods.calculateFactorial(5));
        System.out.println(FactorialMethods.calculateFactorial2(6));


    }
}