package week3.day5.online_lecture.javatips;

import javax.xml.validation.Validator;

public enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);

    private int value;

    private Season(int value) {
        this.value = value;
    }


    public static boolean is(Validator validator) {
        return validator.equals(values());
    }
    public int getValue() {
        return value;
    }
}