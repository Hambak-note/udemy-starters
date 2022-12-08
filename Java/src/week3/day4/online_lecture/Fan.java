package week3.day4.online_lecture;

public class Fan {

    //state
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed; //0 to 5

    //creation
    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn(){
        this.isOn = true;
        //스위치를 켰을 때 디폴트 값
        setSpeed((byte) 5);
    }

    public void switchOff(){
        this.isOn = false;
        //꺼지면 속도는 0이다.
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    //print to state
    public String toString(){
        return String.format("make - %s,  radius - %f, color - %s, isOn - %b, spe ed - %d",
                make, radius, color, isOn, speed);
    }

}
