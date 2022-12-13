package week4.day1.online_lecture.collections;

public class Student implements Comparable<Student>{

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Student that) {
        //오름 차순
        return Integer.compare(this.id, that.id);
        //내림 차순
        //return Integer.compare(that.id, this.id);
    }
}
