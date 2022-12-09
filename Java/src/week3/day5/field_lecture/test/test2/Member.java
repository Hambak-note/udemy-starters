package week3.day5.field_lecture.test.test2;

public class Member {

    private String id;
    private int pw;
    private String name;
    private int age;

    public Member(){
        this.id = null;
        this.pw = -1;
        this.name= null;
        this.age = -1;
    }

    public void insert(String id, int pw, String name, int age){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        printInsertInformation();
    }

    private void printInsertInformation(){
        System.out.println("아이디 : " + id + "\n" +
                "이름 : " + name + "\n" +
                "나이 : " + age + "\n" +
                "가입이 완료 되었습니다.");
    }

}
