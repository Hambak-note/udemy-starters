package week3.day1;

public class Test2 {

    public static void main(String[] args) {

        int time = 10000;

        //10000 초는 xx 시간 xx 분 xx 초입니다.
        //

        int hour = time / 3600;
        int remain = time % 3600;
        int minute = remain / 60;
        int second = remain % 60;

        System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다."   );

    }
}
