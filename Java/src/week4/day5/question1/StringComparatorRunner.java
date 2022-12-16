package week4.day5.question1;


import java.util.Comparator;

class StringComparator{

    public int compare(String str1, String str2, boolean isLength) {

        if(isLength){
            return compareLongStringLength(str1, str2);
        }


        return compareWhoHasMoreLettersA(str1, str2);
    }

    //문자열 길이를 비교해서 문자열의 길이가 긴 문자열의 문자 개수를 리턴
    private int compareLongStringLength(String str1, String str2){
        return Math.max(str1.length(), str2.length());
    }

    //문자 a의 개수가 많은 문자열의 문자 개수를 리턴
    private int compareWhoHasMoreLettersA(String str1, String str2){
        int str1HasLetterA = (int) str1.chars()
                .filter(c -> c == 'a')
                .count();

        int str2HasLetterA = (int)str2.chars()
                .filter(c -> c == 'a')
                .count();

        if(str1HasLetterA > str2HasLetterA)
            return str1.length();

        return str2.length();
    }

}


public class StringComparatorRunner {


    public static void main(String[] args) {

        StringComparator stringComparator = new StringComparator();
        System.out.println(stringComparator.compare("javaprogram", "oracle", true));
        System.out.println(stringComparator.compare("javaprogram", "oracledatabase", false));
    }
}
