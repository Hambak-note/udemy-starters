package week4.day5;

import java.util.regex.Pattern;

public class StringTest {

    public static void main(String[] args) {
        String test = "... 테스트 스트링";

        String[] split = test.split("\\.");

        String stt = "";
        if(stt.isEmpty())
            System.out.println("stt = " + stt);


        for (String s : split) {
            System.out.println(s.isEmpty());
            System.out.println("s = " + s);
        }
    }
}
