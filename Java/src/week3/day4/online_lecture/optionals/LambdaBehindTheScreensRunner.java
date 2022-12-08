package week3.day4.online_lecture.optionals;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number%2 == 0;
    }
}

class SystemOutConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer, Integer>{

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}


public class LambdaBehindTheScreensRunner {

    public static void main(String[] args) {

        Predicate<Integer> evenPredicate = createEvenPredicate();
        Predicate<Integer> oddPredicate = n -> n % 2 == 1;
        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(evenPredicate)
                .forEach(e -> System.out.println(e));
        /**
         * filter -> predicate -> @Functional Interface
         * predicate가 인터페이스 존재하고 이것이 test(T t)라는 메소드를 가지고 있다.
         *
         */

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(e -> System.out.println(e));

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(new SystemOutConsumer());

        List.of(23, 43, 34, 45, 36, 48).stream()
                .filter(n -> n%2 == 0)
                .map((n -> n*n))
                .forEach(e -> System.out.println(e));
    }

    private static Predicate<Integer> createEvenPredicate() {
        return n -> n % 2 == 0;
    }
}
