package week3.day5.online_lecture.javatips;

import java.util.Arrays;

public class EnumRunner {



    public static void main(String[] args) {
//        String season = "Garbage";
        Season season = Season.WINTER;

        Season season1 = Season.valueOf("FALL");
        System.out.println(season1);
        System.out.println(season1.name());
        System.out.println(season1.ordinal());
        System.out.println(season1.getValue());
        System.out.println(Arrays.toString(Season.values()));

    }


}
