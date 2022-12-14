package week4.day3.question1;

public class Speaker implements Volume{

    private int volLevel;

    public Speaker(){
        this.volLevel = 0;
    }


    @Override
    public void volumeUp(int level) {
        volLevel += level;
        if(volLevel > 100){
            volLevel = 100;
        }
        System.out.println("speaker Level 이 " + level +"만큼 증가하여 " + volLevel +"입니다.");
    }

    @Override
    public void volumeDown(int level) {
        volLevel -= level;
        if(volLevel < -100){
            volLevel = -100;
        }
        System.out.println("speaker Level 이 " + level +"만큼 감소하여 " + volLevel +"입니다.");
    }
}
