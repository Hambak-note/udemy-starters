package week3.day5.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BigCounterWithLock {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public void incrementI(){
        lockForI.lock();//Get Lock For I
        i++;
        lockForI.unlock();//Release Lock For I
    }
    public void incrementJ(){
        lockForJ.lock();//Get Lock For J
        j++;
        lockForJ.unlock();//Release Lock For J
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
