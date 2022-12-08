package week3.day4.online_lecture.functional_programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner2 {

    public static void main(String[] args) {

        IntStream.range(1, 11)
                .map(p -> p*p)
                .forEach(p -> System.out.println(p));

        List.of("Apple", "ANt", "Bat").stream()
                .map(s->s.toLowerCase())
                .forEach(p -> System.out.println(p));

        List.of("Apple", "ANt", "Bat").stream()
                .map(s->s.length())
                .forEach(p -> System.out.println(p));

        IntStream.range(1, 11)
                .reduce(0, (n1, n2) -> n1 + n2);

        Integer max = List.of(23, 12, 34, 53).stream()
                .max((n1, n2) -> Integer.compare(n1, n2))
                .get();

        Integer min = List.of(23, 12, 34, 53).stream()
                .min((n1, n2) -> Integer.compare(n1, n2))
                .get();

        List<Integer> collect = List.of(23, 12, 34, 53).stream()
                .filter(p -> p % 2 == 1)
                .collect(Collectors.toList());
    }
}
