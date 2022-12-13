package week4.day1.online_lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStaticCollection {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(123, 12, 3, 45);
        System.out.println(numbers);

        List<Integer> numbersArrayList = new ArrayList<>(numbers);

        //정적 메소드
        Collections.sort(numbersArrayList);
        System.out.println(numbersArrayList);
    }
}
