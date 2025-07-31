package taskThree;

import java.util.Arrays;
import java.util.List;

public class MapStreamer {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter((num) -> num % 2 == 0).map((num) -> num * num)
                .forEach(System.out::println);
    }
}