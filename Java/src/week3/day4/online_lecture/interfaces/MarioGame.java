package week3.day4.online_lecture.interfaces;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into a hole");
    }

    @Override
    public void left() {
        System.out.println("go back");
    }

    @Override
    public void right() {
        System.out.println("go forward");
    }
}
