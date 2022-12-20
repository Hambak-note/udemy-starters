package week5.day2.question1;

import java.util.Objects;

public class LoginClient extends Thread{

    private String id;
    private String pw;

    public LoginClient(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    @Override
    public void run() {
        System.out.println("로그인 아이디 " + id +"를 입력받습니다.");
        System.out.println("로그인 암호를 확인합니다.");
        if(id.equals(pw)){
            System.out.println("로그인 암호 맞습니다.");
            return;
        }
        System.out.println("로그인암호 올바르지 않습니다.");
    }

}
