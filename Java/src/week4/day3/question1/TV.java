package week4.day3.question1;

public class TV implements Volume{

    private int volLevel;

    public TV() {
        this.volLevel = 0;
    }

    @Override
    public void volumeUp(int level) {
        volLevel += level;
        if(volLevel > 100){
            volLevel = 100;
        }
        System.out.println("TV Level 이 " + level +"만큼 증가하여 " + volLevel +"입니다.");
    }

    @Override
    public void volumeDown(int level) {
        volLevel -= level;
        if(volLevel < 0){
            volLevel = 0;
        }
        System.out.println("TV Level 이 " + level +"만큼 감소하여 " + volLevel +"입니다.");
    }
}
