package week4.day2.field_lecture.question1.employee;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private int bonus;
    protected int totalSalary;

    public Employee(int id, String name, int salary, int bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int calculateTotalSalary(){
        this.totalSalary = salary+bonus;
        return totalSalary;
    }

    @Override
    public String toString() {
        return id + ":" + name + ":" +salary + ":" + totalSalary;
    }
}
