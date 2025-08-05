package taskTwo;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class BiFunctionImpl {

    public static void main(String[] args) {

        BiFunction<String, Integer, Boolean> isCorrect = (text, num)-> text.length() == num;
        System.out.println(isCorrect.apply("Adedeji", 9));
//
//        BiFunction<Integer, Integer, String> print = (numTol, number)->{
//            IntStream.rangeClosed(1,numTol).filter(num -> %2 == 0)
//
//                    .forEach();
//        };

    }
}