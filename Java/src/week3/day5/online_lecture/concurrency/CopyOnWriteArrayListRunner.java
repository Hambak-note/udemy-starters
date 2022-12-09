package week3.day5.online_lecture.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();

        //Threads - 3
        list.add("Ant");
        list.add("Bat");
        list.add("Cat");

        //Threads - 10000
        for(String element:list){
            System.out.println(element);
        }
    }
}
