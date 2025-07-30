package taskTwo;

import java.util.function.Function;

public class FunctionImpl {

    public static void main(String[] args) {

        Function<String, Integer> getLength = (text)-> text.length();
        System.out.println(getLength.apply("Hello"));

        Function<String, Boolean> booleanFunction = (text)->
                text.matches("[0-9]+");

        boolean result = booleanFunction.apply("Hello");
        System.out.println(result);
        boolean result2 = booleanFunction.apply("123");
        System.out.println(result2);
    }
}