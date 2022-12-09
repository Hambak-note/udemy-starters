package week3.day5.field_lecture.test.test2;

public class Member {

    private String id;
    private int pw;
    private String name;
    private int age;

    public Member(){
        this.id = null;
        this.pw = -1;
        this.name= null;
        this.age = -1;
    }

    public void insert(String id, int pw, String name, int age){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
    }


}
