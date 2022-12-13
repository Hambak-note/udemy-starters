package week4.day2.online_lecture.collections;

import java.util.*;

public class QueueRunner {

    //문자열 길이에 따른 정렬을 하기 위한 Comparator
    static class StringLengthComparator implements Comparator<String>{

        @Override
        public int compare(String value1, String value2) {
            return Integer.compare(value1.length(), value2.length());
        }
    }

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

        queue.addAll(List.of("Zebra", "Monkey", "Cat")); //true
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
