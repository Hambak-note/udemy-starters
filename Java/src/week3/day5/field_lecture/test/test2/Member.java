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

    public void login(String id, int pw){
        if(this.id.equals(id)  && this.pw == pw){
            printLoginOk();
            return;
        }
        printLoginFail();
    }

    private void printInsertInformation(){
        System.out.println("아이디 : " + id + "\n" +
                "이름 : " + name + "\n" +
                "나이 : " + age + "\n" +
                "가입이 완료 되었습니다.");
    }

    private void printLoginOk(){
        System.out.println("------------------");
        System.out.println("로그인 되었습니다.");
        System.out.println("------------------");
    }

    private void printLoginFail(){
        System.out.println("------------------");
        System.out.println("로그인 정보를 확인하세요.");
        System.out.println("------------------");
    }

}
