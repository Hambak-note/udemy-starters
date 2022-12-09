package week3.day5.concurrency;

public class ConcurrencyRunner {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incrementI();
        counter.incrementI();
        counter.incrementI();
        counter.incrementI();
        System.out.println(counter.getI());
    }
}
