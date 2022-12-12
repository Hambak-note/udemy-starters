package week4.day1.field_lecture.question2;

public class PlayBird {

    public static void main(String[] args) {
        Duck duck = new Duck();
        Sparrow sparrow = new Sparrow();

        duck.fly();
        duck.sing();
        duck.swim();
        duck.print();

        sparrow.fly();
        sparrow.sing();
        sparrow.makeFriend();
        sparrow.print();
    }
}
