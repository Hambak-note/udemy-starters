package week4.day1.field_lecture.question2;

public class Duck extends Bird{

    private int web;

    public Duck(){
        this.name = "꽥꽥이";
        this.web = 2;
    }

    public void swim(){
        System.out.println("오리("+this.name+")가 "+ web+"개의 물갈퀴로 수영합니다.");
    }

    @Override
    public void fly() {
        System.out.println("오리("+this.name+")는 날지 않습니다.");
    }

    @Override
    public void sing() {
        System.out.println("오리("+this.name+")가 소리내어 웁니다." );
    }

    @Override
    public void print() {
        System.out.println("오리의 이름은 " + this.name + "입니다.");
    }
}
