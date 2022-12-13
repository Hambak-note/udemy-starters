package week4.day2.online_lecture.collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        System.out.println(queue); // []
        System.out.println(queue.poll()); // null
        System.out.println(queue.offer("Apple")); // true
        queue.addAll(List.of("Zebra", "Monkey", "Cat")); //true
        System.out.println(queue); //[Apple, Cat, Monkey, Zebra]
        queue.poll(); //"Apple"
        System.out.println(queue);// [Cat, Zebra, Monkey]
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue); //[]

    }
}
