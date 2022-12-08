package week3.day4.online_lecture.inheritance;

public class Student extends Person{
    private String collegeName;
    private int year;

    public Student(String name){
        super(name);
        System.out.println("Student constructor");
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
