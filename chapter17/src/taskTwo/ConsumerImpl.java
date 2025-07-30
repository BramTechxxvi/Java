package taskTwo;

import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerImpl {

    public static void main(String[] args) {
        Stream.generate(()-> new Random().nextInt(100))
                .limit(10);


        Consumer<Integer> consumer = (x)-> System.out.println(x);
        consumer.accept(10);
    }

}
