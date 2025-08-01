import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise13 {

    public static void main(String[] args) {
        List<Integer> randomNumbers = IntStream.rangeClosed(1, 10)
                .map(num -> new Random().nextInt(1000+1))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(randomNumbers);

        long evenCount = randomNumbers.stream().filter(num-> num % 2 ==0).count();
        System.out.println("Total count of even nums: "+evenCount);

        long oddCount = randomNumbers.stream().filter(num -> num % 2 != 0).count();
        System.out.println("Yotal count of odd nums: " +oddCount);

        double averageOfAllNums = randomNumbers.stream()
                .mapToInt(num-> num)
                .average().orElse(0);
        System.out.println("Average of all numbers: "+averageOfAllNums);

        double averageOfOddNums = randomNumbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(num -> num)
                .average().orElse(0);

        System.out.println("Average of odd numbers: "+averageOfOddNums);

        double averageOfEven = randomNumbers.stream()
                .filter(num-> num % 2 == 0)
                .mapToInt(num -> num)
                .average().orElse(0);

        System.out.println("Average of even numbers: "+averageOfEven);
    }
}