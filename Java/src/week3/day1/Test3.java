package week3.day1;

public class Test3 {

    public static void main(String[] args) {
        int books = 100; //도서의 수
        int cntOfStu = 12; //학생의 수

        int handedOutBook = books / cntOfStu;
        int remainOfBooks = books % cntOfStu;


        if (remainOfBooks != 0) {
            System.out.println(cntOfStu + "명의 학생에게 " + handedOutBook + "권을 나누어 주고" +
                    "남은책은 " + remainOfBooks + "권 입니다.");
        } else {
            System.out.println(cntOfStu + "명의 학생에게 " + handedOutBook + "권을 나누어 주고" +
                    "남은책은 " + "없습니다.");
        }

    }
}
