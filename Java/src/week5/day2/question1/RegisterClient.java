package week5.day2.question1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterClient extends Thread {

    private Date date;

    public RegisterClient(Date date){
        this.date = date;
    }

    @Override
    public void run() {

        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
            String strNowDate = simpleDateFormat.format(date);
            System.out.println(strNowDate + "회원 가입 요청합니다.");
            System.out.println("회원 가입 요청 처리 중입니다.");
            Thread.sleep(3000L);
            System.out.println("회원가입 요청 처리 완료입니다.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
