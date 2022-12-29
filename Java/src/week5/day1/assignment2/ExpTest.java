package week5.day1.assignment2;

import java.util.Stack;

public class ExpTest {

    private static final char LEFT_PARENTHESIS = '(';
    private static final char RIGHT_PARENTHESIS = ')';
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTI = '*';
    private static final char DIVIDE = '/';


    public static void main(String[] args) {
        String expressions [] = {"(5-(2+3)*2)/4", "(2+3)*1)+3", "((2+3)*1)+3", "(5-(2+3)*2)/4)"};

        for(String expression : expressions){
            if(checkParenthesesInFormulasMatch(expression)){
                System.out.println(expression + "은(는) 괄호가 일치합니다.");
                System.out.println(covertToPostfixNotation(expression));
                continue;
            }
            System.out.println(expression + "은(는) 괄호가 일치하지 않습니다.");
        }

    }

    private static boolean checkParenthesesInFormulasMatch(String expression){
        Stack<Character> leftParenthesisStack = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char currentElement = expression.charAt(i);
            if(currentElement == LEFT_PARENTHESIS){
                leftParenthesisStack.push(currentElement);
                continue;
            }
            if(currentElement == RIGHT_PARENTHESIS){
                if(leftParenthesisStack.isEmpty()){
                    return false;
                }
                leftParenthesisStack.pop();
            }
        }

        if(leftParenthesisStack.isEmpty()){
            return true;
        }

        return false;
    }

    //수식 후위 표기식으로 변환
    private static String covertToPostfixNotation(String expression){

        StringBuilder convertedExpression = new StringBuilder();
        Stack<Character> convertedStack = new Stack<>();

        boolean isLeft = false;

        for (int i = 0; i < expression.length(); i++) {
            char currentElement = expression.charAt(i);

            if(currentElement == RIGHT_PARENTHESIS){
//                while(convertedStack.peek() != )
            }


            if (currentElement == LEFT_PARENTHESIS) {
                convertedStack.push(currentElement);
                continue;
            }

            if(isOperator(currentElement)){
                convertedStack.push(currentElement);
                continue;
            }



            if(isLeft){
               if(isOperator(currentElement)){
                   convertedStack.push(currentElement);
                   continue;
               }
               convertedExpression.append(currentElement);
            }
        }

        while(!convertedStack.isEmpty()){
            convertedExpression.append(convertedStack.pop());
        }

        System.out.println("test : " + convertedStack);
        return convertedStack.toString();
    }

    private static int calculateFormula(String expression){
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char currentElement = expression.charAt(i);
            if(currentElement == LEFT_PARENTHESIS){
                continue;
            }
            if(currentElement == RIGHT_PARENTHESIS){
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                char operator = operatorStack.pop();
                int result = calculateTwoOperandByOperator(operand1, operand2, operator);
                operandStack.push(result);
                System.out.println("result = " + result);
                continue;
            }

            if(isOperator(currentElement)){
                operatorStack.push(currentElement);
                continue;
            }

            operandStack.push(currentElement-'0');
        }

        if(operatorStack.isEmpty())
            return operandStack.pop();

        System.out.println("마지막 연산자 : " + operatorStack.peek());

        int operand2 = operandStack.pop();
        int operand1 = operandStack.pop();
        char operator = operatorStack.pop();
        int result = calculateTwoOperandByOperator(operand1, operand2, operator);

        return result;
    }

    private static boolean isOperator(char input){
        if(input == PLUS || input == MINUS || input == DIVIDE || input == MULTI)
            return true;
        return false;
    }

    private static int calculateTwoOperandByOperator(int operand1, int operand2, char operator){

        if(operator == PLUS){
            return operand1 + operand2;
        }
        if(operator == MINUS){
            return operand1 - operand2;
        }
        if(operator == MULTI){
            return operand1 * operand2;
        }
        return operand1 / operand2;
    }

}
