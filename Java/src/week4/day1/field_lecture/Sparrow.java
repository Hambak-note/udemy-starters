package week4.day1.field_lecture;

public class Sparrow extends Bird{

    String friend;

    public Sparrow(){
        this.name = "짹짹";
    }

    public void makeFriend(){
        this.friend = "허수아비";
        System.out.println("참새의 친구는 " + friend + "입니다.");
    }

    @Override
    public void fly() {
        System.out.println("참새(" +this.name +")가 날아다닙니다.");
    }
    @Override
    public void sing() {
        System.out.println("참새("+this.name+")가 소리내어 웁니다..");
    }

    @Override
    public void print() {
        System.out.println("참새의 이름은 " + this.name + "입니다.");
    }
}
