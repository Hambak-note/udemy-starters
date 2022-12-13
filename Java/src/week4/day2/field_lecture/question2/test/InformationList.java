package week4.day2.field_lecture.question2.test;

public class InformationList {

    private Information[] informationArr;
    private int currentIdx;

    public InformationList(String arrLength) {
        informationArr = new Information[Integer.parseInt(arrLength)];
        currentIdx = 0;
    }

    public void add(Information informationElement){
        if(currentIdx >= informationArr.length){
            throw new IllegalStateException("저장 공간이 가득  찼습니다.");
        }
        informationArr[currentIdx] = informationElement;
        currentIdx++;
    }

    public void read(){
        System.out.println("=====================================");
        for(Information info : informationArr){
            System.out.println(info.print());
        }
        System.out.println("=====================================");
    }



}
