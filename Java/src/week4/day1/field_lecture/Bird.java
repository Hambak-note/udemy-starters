package week4.day1.field_lecture;

public class Bird {
    protected String name;
    protected int legs;
    protected int length;

    public void fly(){
        System.out.println("날아 다닙니다.");
    }

    public void sing(){
        System.out.println("소리내어 웁니다.");
    }

    public void setName(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
    }

}
