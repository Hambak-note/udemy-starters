package week3.day4.online_lecture;

public class FanRunner {

    public static void main(String[] args) {

        Fan fan = new Fan("Manufacturer 1", 0.34567, "GREEN");
        fan.switchOn();
        fan.setSpeed((byte)5);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }

}
