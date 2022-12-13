package week4.day2.online_lecture.collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');


        //unique - Set
        //Tree
        //Hash
        //LinkedHash

        //정렬 출력
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println(treeSet);

        //삽입 순서대로 출력
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println(linkedHashSet);

        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
        System.out.println("numbers = " + numbers);
        System.out.println(numbers.floor(40));
        System.out.println(numbers.lower(34));
        System.out.println(numbers.ceiling(36));
        System.out.println(numbers.higher(34));

        //하위 제한만 포함
        System.out.println(numbers.subSet(34, 65));
        //상위와 하위 제한을 다 포함해 출력 - 34, 54, 65출력
        System.out.println(numbers.subSet(34,true, 65,true));
    }
}
