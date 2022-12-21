package week5.day3.question2;

import java.io.*;
import java.util.List;

public class InOut {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int printStartMenu() throws IOException {
        System.out.println();
        System.out.println("학생 성적 계산 프로그램");
        System.out.println("1. 학생 정보 입력");
        System.out.println("2. 학생 정보 출력");
        System.out.println("3. 종료");

        System.out.print("메뉴 입력 => ");
        int choiceNumber = Integer.parseInt(br.readLine());

        return choiceNumber;
    }

    public static Student studentInfoInputAndReturnStudent() throws IOException {
        String name;
        int korean;
        int math;
        int english;


        System.out.println();

        System.out.print("이름 : ");
        name = br.readLine();
        System.out.print("국어 : ");
        korean = Integer.parseInt(br.readLine());
        System.out.print("수학 : ");
        math = Integer.parseInt(br.readLine());
        System.out.print("영어 : ");
        english = Integer.parseInt(br.readLine());
        System.out.println("입력이 완료되었습니다.");

        Student student =  new Student(name, korean, math, english);

        return student;
    }

    public static void writeStudentInfo(List<Student> students) throws IOException {
        System.out.println();

        File file = new File("C:\\Study\\udemy_starters\\udemy-starters\\Java\\src\\week5\\day3\\question2\\scores.txt");

        if(!file.exists()){
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);

        for(int i = 1; i <= students.size(); i++){
            String writeString = i + " " + students.get(i-1).toString();
            writer.write(writeString);
        }
        System.out.println("파일 출력이 완료 되었습니다.");

        writer.close();
    }


}
