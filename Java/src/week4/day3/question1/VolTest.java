package week4.day3.question1;

public class VolTest {


    public static void main(String[] args) {

        Volume v[] = new Volume[3];
        v[0] = new Speaker();
        v[1] = new TV();
        v[2] = new Radio();
        for (int i = 0; i < v.length; i++) {
            v[i].volumeUp(200);
            v[i].volumeDown(300);
        }
    }
}
