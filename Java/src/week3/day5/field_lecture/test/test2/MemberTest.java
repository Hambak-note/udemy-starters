package week3.day5.field_lecture.test.test2;

public class MemberTest {

    public static void main(String[] args) {
        Member mem = new Member();
        mem.insert("test", 1234, "이자바", 25);
        mem.login("test", 4321);
        mem.login("test", 1234);
        mem.setPassword(1111);
        mem.getMyInfo();
        String id  = mem.logout();
        if(id == null){
            System.out.println("다시 로그인하셔야 합니다.");
    }

}
