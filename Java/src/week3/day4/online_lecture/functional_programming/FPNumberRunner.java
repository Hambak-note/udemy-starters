package week3.day4.online_lecture.functional_programming;

import java.util.List;

public class FPNumberRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 3, 15);
        /*numbers.stream()
                .forEach(element-> System.out.println(element)); */

        /**
         * 첫번째 매개변수는 0, 두번째매개변수는 함수정의
         */
        int sum = fpSum(numbers);
        fpSort(numbers);
        fpSortDistinct(numbers);

        //int sum = normalSum(numbers);
        System.out.println(sum);
    }

    private static void fpDistinctMap(List<Integer> numbers) {
        numbers.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));
    }

    private static void fpSort(List<Integer> numbers){
        numbers.stream().sorted().forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    private static void fpSortDistinct(List<Integer> numbers){
        numbers.stream()
                .sorted()
                .distinct()
                .forEach(element -> System.out.print(element + " "));
        System.out.println();
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
    private static Integer fpSum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (number1, number2) -> number1 + number2);
    }

    private static Integer fpOddSum(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 1)
                .reduce(0, (number1, number2) -> number1 + number2);
    }


}


