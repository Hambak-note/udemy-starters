package week5.day3.question2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static week5.day3.question2.InOut.*;

public class App {

    public static void main(String[] args) throws IOException {

        int choiceNumber = 0;
        List<Student> students = new ArrayList<>();

        while(true){
            choiceNumber = printStartMenu();

            if(choiceNumber == 1){
                students.add(studentInfoInputAndReturnStudent());
                continue;
            }

            if(choiceNumber == 2){
                writeStudentInfo(students);
            }
            if(choiceNumber == 3){
                break;
            }

        }



    }
}
