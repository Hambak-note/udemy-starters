package week3.day4.field_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStar {

    public static void main(String[] args) throws IOException {

        int inputLine = Integer.parseInt(args[0]);

        for(int i = 1; i <= inputLine; i ++){
            for(int j = 0; j < inputLine-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
