package week5.day3.question2;

public class Student {

    private String name;
    private int korean;
    private int math;
    private int english;
    private int total;
    private double avg;

    public Student(String name, int korean, int math, int english) {
        this.name = name;
        this.korean = korean;
        this.math = math;
        this.english = english;
        calculateTotal();
        calculateAvg();
    }

    private void calculateTotal(){
        this.total = korean + math + english;
    }

    public void calculateAvg(){
        this.avg = total / 3;
    }

    @Override
    public String toString() {
        return name + " " + korean + " " + math + " " + english + " " + total + " " + avg + "\n";
    }
}
