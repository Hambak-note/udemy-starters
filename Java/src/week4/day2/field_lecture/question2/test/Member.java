package week4.day2.field_lecture.question2.test;

public class Member extends Information{

    private String email;
    private String phone;

    public Member(String id, String name, String email, String phone) {
        super(id, name);
        this.email = email;
        this.phone = phone;
    }

    @Override
    String print() {
        return super.print()+":"+this.email+":"+this.phone;
    }
}
