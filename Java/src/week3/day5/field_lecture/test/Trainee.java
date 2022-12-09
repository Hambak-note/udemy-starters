package week3.day5.field_lecture.test;

public class Trainee {

    private String name;
    private String courseName;
    private int educationalFee;
    private static EducationalInstitution educationalInstitution = new EducationalInstitution("새싹");
    private final int surCharge = 5000;

    private int refundFee;

    public Trainee(String name, String courseName, int educationalFee) {
        this.name = name;
        this.courseName = courseName;
        this.educationalFee = educationalFee;
    }

    public void calc(){
        if(courseName.equals("Java")){
            refundFee = (int) ((educationalFee * 0.2) + surCharge);
            return;
        }
        if(courseName.equals("JSP")){
            refundFee = (int) ((educationalFee * 0.15) + surCharge*2);
            return;
        }
        if(courseName.equals("spring")){
            refundFee = (int) ((educationalFee * 0.1) + surCharge);
            return;
        }
        refundFee = 0;
    }

    @Override
    public String toString() {
        return  "이름 : " + name + '\n' +
                "과정명 : " + courseName + '\n' +
                "교육비 : " + educationalFee + '\n' +
                "교육기관 : " + educationalInstitution.getName() + '\n' +
                "부가금 :  " + surCharge + '\n' +
                "환급금 : " + refundFee ;
    }
}
