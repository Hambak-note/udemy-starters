package week5.day1.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SameSentence {

    String[] compare(List<String> list1, List<String> list2){

        int listLength;

        //list1과 list2 저장 데이터 갯수 비교한다.
        if(compareNumberOfDateStorage(list1, list2)){
            listLength = list1.size();
            return compareAllDataByIndexAndReturnSameData(list1, list2, listLength);
        }

        listLength = Math.min(list1.size(), list2.size());
        return compareAllDataByIndexAndReturnSameData(list1, list2, listLength);
    }

    private boolean compareNumberOfDateStorage(List<String> list1, List<String> list2){
        return list1.size() == list2.size();
    }

    private String[] compareAllDataByIndexAndReturnSameData(List<String> list1, List<String> list2, int listLength){

        ArrayList<String> sameStringArray = new ArrayList<>();


        for(int i = 0; i < listLength; i++){
            String list1Str = list1.get(i);
            String list2Str = list2.get(i);

            if(list1Str.equals(list2Str)){
                sameStringArray.add(list1Str);
            }
        }

        int arrListSize = sameStringArray.size();
        String[] returnStringArr = sameStringArray.toArray(new String[arrListSize]);

        return returnStringArr;
    }

}
