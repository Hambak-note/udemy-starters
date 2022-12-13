package week4.day2.field_lecture.question2.test;

public class Information {

    private String id;
    private String name;

    public Information(String id, String name) {
        this.id = id;
        this.name = name;
    }

    String print(){
        return id + ":"+name;
    }
}
