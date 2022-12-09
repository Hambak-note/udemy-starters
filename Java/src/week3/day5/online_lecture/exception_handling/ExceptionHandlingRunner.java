package week3.day5.online_lecture.exception_handling;

public class ExceptionHandlingRunner {

    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");

    }

    private static void method1() {
        method2();
        System.out.println("method1 Ended");
    }

    private static void method2() {
        String str = null;
        str.length();
        System.out.println("method2 Ended");
    }
}
