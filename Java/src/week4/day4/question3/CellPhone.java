package week4.day4.question3;

import java.util.Objects;

public class CellPhone {

    private String model;
    private double battery;

    public CellPhone(String model) {
        this.model = model;
    }

    public void call(int time) throws IllegalArgumentException{
        if(time < 0){
            throw new IllegalArgumentException("통화시간입력오류");
        }
        System.out.println("통화 시간 : " + time + "분");
        battery -= time * 0.5;
        if(battery< 0) battery = 0;
    }

    public void charge(int time) throws IllegalArgumentException{
        if(time < 0){
            throw new IllegalArgumentException("충전시간입력오류");
        }
        System.out.println("충전 시간 : " + time + "분");
        battery += time*3;
        if(battery > 100) battery = 100;
    }

    public void printBattery(){
        System.out.println("남은 배터리 양 : " + battery);
    }

    public boolean isSame(CellPhone other){
        return this.equals(other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellPhone cellPhone = (CellPhone) o;
        return model.equalsIgnoreCase(cellPhone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}
