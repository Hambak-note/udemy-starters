package week3.day4.online_lecture.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericRunner {

    static <X> X doubleValue(X value){
        return value;
    }

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers){
        double sum = 0.0;
        for(Number number:numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {
        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println(emptyList);

        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.3,3.2,4.1,5.1)));

        String str = doubleValue(new String());
        Integer number = doubleValue(Integer.valueOf(5));
        ArrayList list1 = doubleValue(new ArrayList<>());

        LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3));
        duplicate(numbers);
        System.out.println(numbers);


        MyCustomList<Long> list = new MyCustomList();
        list.addElement(71L);
        list.addElement(25L);
        Long value = list.get(0);
        System.out.println(value);
        System.out.println(list.toString());

        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));

        Integer number2 = list2.get(0);
        System.out.println(number2);
        System.out.println(list2.toString());


    }
}
