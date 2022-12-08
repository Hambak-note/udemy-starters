package week3.day4.online_lecture.optionals;

import java.util.List;
import java.util.Optional;

public class test {

    public static void main(String[] args) {

        /**
         * 짝수가 존재하지 않는리스트에서 짝수중 최대 값을 찾고 있다.
         * 출력결과: Optional.empty
         * isPresent 결과 : false
         */
        Optional<Integer> max1 = List.of(23, 45, 67).stream()
                .filter(n -> n % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2));

        /**
         * 반환 값이 존재하지 않으면 기본 값 (여기서는 '0') 출력
         */
        Integer integer = List.of(23, 45, 67).stream()
                .filter(n -> n % 2 == 0)
                .max((n1, n2) -> Integer.compare(n1, n2))
                .orElse(0);
        
        System.out.println(max1);

        System.out.println(max1.isPresent());


    }
}
