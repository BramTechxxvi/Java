package taskThree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlatStreamer {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        words.add("We");
        words.add("Are");
        words.add("African")
        words.add("Strong");
        words.add("Black");
        words.stream().flatMap((String word)-> word.chars().boxed())
                .forEach(System.out::println);
        System.out.println("\n\n");

        List<String> wordings = Arrays.asList("We", "Are", "Strong", "Black", "Africans");
        wordings.stream().flatMap((String word)-> word.chars().boxed())
                .forEach(System.out::println);
    }
}