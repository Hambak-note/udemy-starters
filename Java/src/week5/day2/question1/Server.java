package week5.day2.question1;

import java.util.Date;

public class Server {

    public static void main(String[] args) {
        LoginClient c1 = new LoginClient("java", "java");
        LoginClient c2 = new LoginClient("java", "1234");
        RegisterClient c3 = new RegisterClient(new Date());
        BoardClient c4 = new BoardClient();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}
