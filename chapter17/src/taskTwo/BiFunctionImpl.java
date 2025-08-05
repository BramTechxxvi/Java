package taskTwo;

import java.util.function.BiFunction;

public class BiFunctionImpl {

    public static void main(String[] args) {

        BiFunction<String, Integer, Boolean> isCorrect = (text, num)->{
            return text.length() == num;
        };

        System.out.println(isCorrect.apply("Adedeji", 9));

    }
}
