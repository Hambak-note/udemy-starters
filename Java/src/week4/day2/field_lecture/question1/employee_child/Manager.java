package week4.day2.field_lecture.question1.employee_child;

import week4.day2.field_lecture.question1.employee.Employee;

public class Manager extends Employee {

    private int managerBonus;


    public Manager(int id, String name, int salary, int bonus, int managerBonus) {
        super(id, name, salary, bonus);
        this.managerBonus = managerBonus;
    }

    @Override
    public int calculateTotalSalary() {
        this.totalSalary = super.calculateTotalSalary() + managerBonus;
        return this.totalSalary;
    }
}
