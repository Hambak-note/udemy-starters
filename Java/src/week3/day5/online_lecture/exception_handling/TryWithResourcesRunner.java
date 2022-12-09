package week3.day5.online_lecture.exception_handling;

import java.util.Scanner;

public class TryWithResourcesRunner {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){


            int[] numbers = {12, 3, 4, 5};

            int number = numbers[5];
        } catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Just before closing out main");
    }
}
