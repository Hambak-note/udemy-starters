package week4.day2.field_lecture.question1.employee_child;

import week4.day2.field_lecture.question1.employee.Employee;

public class Secretary extends Employee {
    private int secretaryBonus;

    public Secretary(int id, String name, int salary, int bonus, int secretaryBonus) {
        super(id, name, salary, bonus);
        this.secretaryBonus = secretaryBonus;
    }

    @Override
    public int calculateTotalSalary() {
        this.totalSalary = super.calculateTotalSalary() + secretaryBonus;
        return this.totalSalary;
    }
}
