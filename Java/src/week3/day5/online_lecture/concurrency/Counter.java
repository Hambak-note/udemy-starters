package week3.day5.online_lecture.concurrency;

public class Counter {

    private int i = 0;

    synchronized public void incrementI(){
        i++;
    }

    public int getI() {
        return i;
    }
}
