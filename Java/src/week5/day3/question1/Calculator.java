package week5.day3.question1;

public class Calculator {
    private int data1;
    private int data2;
    private String operator;

    public Calculator(int data1, int data2, String operator) {
        this.data1 = data1;
        this.data2 = data2;
        this.operator = operator;
    }

    public int calculate(){
        if(this.operator.equals("+")){
            return data1 + data2;
        }
        if(this.operator.equals("-")){
            return data1 - data2;
        }
        if(this.operator.equals("*")){
            return data1 * data2;
        }
            return data1 / data2;
    }

    public String getOperator() {
        return operator;
    }
}
