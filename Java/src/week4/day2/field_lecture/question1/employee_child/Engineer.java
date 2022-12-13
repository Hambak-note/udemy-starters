package week4.day2.field_lecture.question1.employee_child;

import week4.day2.field_lecture.question1.employee.Employee;

public class Engineer extends Employee {

    private int qualificationBonus; //자격수당
    private int technicalBonus; //기술수당

    public Engineer(int id, String name, int salary, int bonus, int qualificationBonus, int technicalBonus) {
        super(id, name, salary, bonus);
        this.qualificationBonus = qualificationBonus;
        this.technicalBonus = technicalBonus;
    }

    @Override
    public int calculateTotalSalary() {
        this.totalSalary = super.calculateTotalSalary() + qualificationBonus + technicalBonus;
        return this.totalSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ":" +qualificationBonus + ":" +technicalBonus;
    }
}
