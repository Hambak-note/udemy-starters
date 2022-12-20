package week5.day2.question1;

public class BoardClient extends Thread{

    @Override
    public void run() {
        try{
            for(int i = 1; i <= 5; i++){
                Thread.sleep(500L);
                System.out.println("게시물 " + i + " 번 작성합니다.");
            }
            System.out.println("게시물 5개 작성 종료합니다.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
