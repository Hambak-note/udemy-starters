package week3.day4.online_lecture.inheritance;

public class StudentRunner {

    public static void main(String[] args) {
        /*
        Student student = new Student();
        student.setName("Flower");
        student.setEmail("dudghks5722@gmail.com");

        Person person = new Person();
        person.setName("Ranga");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);
        */

        Employee employee = new Employee("Ranga", "Programmer Analyst");
        employee.setEmail("ranga@gmail.com");
        employee.setPhoneNumber("123-456-7890");
        employee.setEmployeeGrade('A');

        System.out.println(employee);
    }
}
