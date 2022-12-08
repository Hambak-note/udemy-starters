package week3.day4.online_lecture.exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPQuestion {

    public static void main(String[] args) {
        //짝수를 뽑아서 리스트 형식으로 저장
        List<Integer> collect = List.of(12, 11, 10, 23, 33, 44).stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect.toString());

        //10개의 정수를 제곱한 값을 원소로 갖는 리스트 저장
        //map으로 나온 결과물을 스트림으로 변경해야 한다.
        List<Integer> collect1 = IntStream.range(1, 11)
                .map(p -> p * p)
                .boxed()
                .collect(Collectors.toList());


    }
}
