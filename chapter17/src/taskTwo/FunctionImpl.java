package taskTwo;

import java.util.function.Function;

public class FunctionImpl {

    public static void main(String[] args) {

        Function<String, Integer> getLength = (text)-> text.length();
        System.out.println(getLength.apply("Hello"));
    }
}
