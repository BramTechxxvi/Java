package taskThree;

import java.util.Random;
import java.util.stream.Stream;

public class StreamLimiter {

    public static void main(String[] args) {
        Stream.generate(()->new Random().nextInt(10))
                .limit(10)
                .forEach(System.out::println);
    }
}