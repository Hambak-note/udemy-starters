package week4.day3.question1;

public class Radio implements Volume{

    private int volLevel;

    public Radio() {
        this.volLevel = 0;
    }

    @Override
    public void volumeUp(int level) {
        volLevel += level;
        System.out.println("Radio Level 이 " + level +"만큼 증가하여 " + volLevel +"입니다.");
    }

    @Override
    public void volumeDown(int level) {
        volLevel -= level;
        System.out.println("Radio Level 이 " + level +"만큼 감소하여 " + volLevel +"입니다.");
    }
}
