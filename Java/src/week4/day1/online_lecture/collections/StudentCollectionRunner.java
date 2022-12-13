package week4.day1.online_lecture.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class DescendingStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentCollectionRunner {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ranga"),
                new Student(100, "Adam"),
                new Student(2, "Eve"));

        List<Student> studentsArrayList = new ArrayList<>(students);

        //System.out.println(students);

        //비교 가능한 인터페이스 구현만 통과될 수 있다는 오류
        //Comparable 인터페이스
        Collections.sort(studentsArrayList);
        System.out.println(studentsArrayList);

        //상황에 따라 다르게 구현해야 한다면
        //Student 클래스에 직접 구현해야 함
        Collections.sort(studentsArrayList);
        System.out.println("Asc " + studentsArrayList);
        Collections.sort(studentsArrayList, new DescendingStudentComparator());
        System.out.println("DescendingStudentComparator " + studentsArrayList);

        studentsArrayList.sort(new DescendingStudentComparator());
        System.out.println("DescendingStudentComparator " + studentsArrayList);
    }
}
