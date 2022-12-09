package week3.day5.field_lecture.test;




public class Test1 {

    public static void main(String[] args) {

        String traineeName = args[0];
        String courseName = args[1];
        int educationalFee = Integer.parseInt(args[2]);

        Trainee trainee = new Trainee(traineeName, courseName, educationalFee);
        trainee.calc();
        System.out.println(trainee);


    }
}
