package week5.day3.question1;

import java.io.BufferedReader;

public class PrintMenu {

    public static void startMenu(){
        System.out.println("계산기를 시작합니다.");
        System.out.println("종료하려면 q를 입력하세요");
        System.out.println("메뉴");
        System.out.println("1. 덧셈");
        System.out.println("2. 뺄셈");
        System.out.println("3. 곱셈");
        System.out.println("4. 나눗셈");
        System.out.println("5. 프로그램 종료");
    }

    public static void inputMessage(){
        System.out.println();
        System.out.print("선택 번호 입력: ");
    }

    public static void exitMessage(){
        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }

    public static void inputDataOneMessage(String operator){
        if(operator.equals("+")){
            System.out.print("덧셈할 데이터1 입력 : ");
            return;
        }
        if(operator.equals("-")){
            System.out.print("뺄셈할 데이터1 입력 : ");
            return;
        }
        if(operator.equals("*")){
            System.out.print("곱셈할 데이터1 입력 : ");
            return;
        }
        System.out.print("나눗셈할 데이터1 입력 : ");
    }

    public static void inputDataTwoMessage(String operator){
        if(operator.equals("+")){
            System.out.print("덧셈할 데이터2 입력 : ");
            return;
        }
        if(operator.equals("-")){
            System.out.print("뺄셈할 데이터2 입력 : ");
            return;
        }
        if(operator.equals("*")){
            System.out.print("곱셈할 데이터2 입력 : ");
            return;
        }
        System.out.print("나눗셈할 데이터2 입력 : ");
    }

    public static void calculateResult(int data1, int data2, String operator, int result){
        System.out.println("결과 : " + data1 + " " + operator + " " + data2+ " = "+result);
    }


}
