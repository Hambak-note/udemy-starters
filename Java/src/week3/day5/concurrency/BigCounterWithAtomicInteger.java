package week3.day5.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BigCounterWithAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    public void incrementI(){
        i.incrementAndGet();
    }
    public void incrementJ() {
        j.incrementAndGet();
    }
    public int getI() {
        return i.get();
    }

    public int getJ() {
        return j.get();
    }
}
