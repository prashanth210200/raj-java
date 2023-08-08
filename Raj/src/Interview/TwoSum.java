package Interview;

import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 4, 5, 3);
        int sum = 8;

        numbers.stream()
               .flatMap(i -> numbers.stream()
                                    .filter(j -> i + j == sum)
                                    .map(j -> "(" + i + ", " + j + ")"))
               .distinct()
               .forEach(System.out::println);
    }
}
