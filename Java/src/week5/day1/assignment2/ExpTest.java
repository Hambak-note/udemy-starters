package week5.day1.assignment2;

import java.util.Stack;

public class ExpTest {

    private static final char LEFT_PARENTHESIS = '(';
    private static final char RIGHT_PARENTHESIS = ')';


    public static void main(String[] args) {
        String expressions [] = {"(5-(2+3)*2)/4", "(2+3)*1)+3", "((2+3)*1)+3", "(5-(2+3)*2)/4)"};

        for(String expression : expressions){
            if(checkParenthesesInFormulasMatch(expression)){
                System.out.println(expression + "은(는) 괄호가 일치합니다.");
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
}
