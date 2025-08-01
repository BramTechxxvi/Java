import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise16 {

    public static void main(String[] args) {
        List<Integer> randomNumbers = IntStream.rangeClosed(1, 50)
                .map(num -> new SecureRandom().nextInt(1000))
                .filter(num -> num % 2 != 0)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Odd numbers: " + randomNumbers);
    }
}