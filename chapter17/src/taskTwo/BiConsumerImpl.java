package taskTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a,b)-> System.out.println(a * b);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,5);
        map.put(2,3);
        map.put(30,4);
        map.put(40,5);
        map.put(50,6);

        map.forEach(biConsumer);
    }
}
