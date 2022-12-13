package week4.day1.online_lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");
        List<String> wordsArrayList = new ArrayList<>(words);

        for(String word : words){
            if(word.endsWith("at")){
                System.out.println(word);
            }
        }

        Iterator<String> iterator = wordsArrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("at")) {
                iterator.remove();
            }
        }

        System.out.println(wordsArrayList);


        //리스트 생성됨
        List value = List.of("A", 'A', 1, 1.0);
        System.out.println(value);

        System.out.println(value.get(2) instanceof Integer);
        System.out.println(value.get(1) instanceof Character);

        /*

        //"at"을 포함한 요소를 지우려고 함
        //출력결과 "Cat" 포함
        for(String word:wordsArrayList){
            if(word.endsWith("at")){
                wordsArrayList.remove(word);
            }
        }

*/



        /*

        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }

        for (String word : words) {
            System.out.println(word);
        }

        //반복자
        Iterator wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }

*/

    }

}
