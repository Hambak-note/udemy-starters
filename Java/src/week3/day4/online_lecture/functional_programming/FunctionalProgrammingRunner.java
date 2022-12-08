package week3.day4.online_lecture.functional_programming;

import java.util.List;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {

        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6);

        //for문
        for (String string : list) {
          //  System.out.println(string);
        }

        //메소드화
        //printWithFP(list);
        printWithFPWithFiltering(list);
        printWithFPWithFilteringOdd(list2);

    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        /*
        list.stream()
        => 리스트 안의 요소들을 갖고 값의 흐름으로 변환시키는 것
        루프를 돌리면서 매 문자열을 가지고 무엇을 할지 말하는 대신에
        이것을 흐름으로 변환하고 forEach를 이 안에 호출한 다음
        각 요소들을가지고 무엇을 할지 통과시켜주는것

         */
        list.stream().forEach(
                element -> System.out.println("element -" + element)
        );
    }

    private static void printBasicWithFiltering(List<String> list){
        for(String string:list){
            if(string.endsWith("at")){
                System.out.println(string);
            }
        }
    }

    //"at"으로 끝나는 문자열만 필터링
    private static void printWithFPWithFiltering(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println("element - " + element));
    }

    //홀수만 필터링
    private static void printWithFPWithFilteringOdd(List<Integer> list){
        list.stream()
                .filter(element -> element % 2 != 0)
                .forEach(element -> System.out.println("element - " + element));
    }
}
