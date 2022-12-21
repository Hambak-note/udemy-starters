package week5.day3.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static week5.day3.question1.PrintMenu.*;

public class CalculatorRunner {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator;
        int choiceNumber = 0;
        String operator = "";
        int data1 = 0;
        int data2 = 0;


        startMenu();
        while(true){
            inputMessage();
            choiceNumber = Integer.parseInt(br.readLine());
            operator = convertChoiceNumberToOperator(choiceNumber);

            if(operator.equals("end")) break;
            inputDataOneMessage(operator);
            data1 = Integer.parseInt(br.readLine());
            inputDataTwoMessage(operator);
            data2 = Integer.parseInt(br.readLine());

            calculator = new Calculator(data1, data2, operator);
            int result = calculator.calculate();
            calculateResult(data1, data2, operator, result);
        }

        exitMessage();
    }

    private static String convertChoiceNumberToOperator(int choiceNumber){
        if(choiceNumber == 1){
            return "+";
        }
        if(choiceNumber == 2){
            return "-";
        }
        if(choiceNumber == 3){
            return "*";
        }
        if(choiceNumber == 4){
            return "/";
        }
        return "end";
    }
}
