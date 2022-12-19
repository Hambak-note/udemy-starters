package week4.day5.question2;

import java.util.Arrays;

public class UrlSeparationRunner {

    public static void main(String[] args) {
        String url = "http://www.kitri.re.kr:8080/java/test";
        String replaceHttpUrl = url.replace("http", "");
        String[] splitedURL = replaceHttpUrl.split("[.:/]");

        for(String s : splitedURL){
            if(s.isEmpty()){
                continue;
            }
            System.out.println(s);
        }

    }
}
