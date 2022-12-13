package week4.day1.online_lecture.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> set = Set.of("Apple", "Banana", "Cat");
        System.out.println(set);

        Set<String> hashset = new HashSet<>(set);
        //false 반환
        System.out.println(hashset.add("Apple"));
        //출력 할 때 입력한 결과랑다르게 출력된다.
        //이때문에 index 에 의한 접근 불가
        System.out.println(hashset);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(12345);
        numbers.add(123245);
        numbers.add(112345);
        numbers.add(124345);
        //순서 신경 안씀
        System.out.println(numbers);

        //순서대로 보관함
        Set<Integer> numbers2 = new LinkedHashSet<>();
        numbers2.add(18518);
        numbers2.add(185181);
        numbers2.add(185183);
        numbers2.add(185185);
        System.out.println(numbers2);

        //정렬된 순서대로 보관함
        Set<Integer> numbers3 = new TreeSet<>();
        numbers3.add(18518);
        numbers3.add(185183);
        numbers3.add(185181);
        numbers3.add(185185);
        System.out.println(numbers3);
    }
}
