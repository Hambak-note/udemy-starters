package week3.day5.concurrency;

public class Counter {

    private int i = 0;

    synchronized public void incrementI(){
        i++;
    }

    public int getI() {
        return i;
    }
}
