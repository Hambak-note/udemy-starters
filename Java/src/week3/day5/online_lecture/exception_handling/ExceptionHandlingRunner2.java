package week3.day5.online_lecture.exception_handling;

public class ExceptionHandlingRunner2 {

    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");

    }

    private static void method1() {
        method2();
        System.out.println("method1 Ended");
    }

    private static void method2() {

        try{
            int[] i = {1, 2};
            int number = i[3];
            String str = null;
            str.length();
            System.out.println("method2 Ended");
        }catch (NullPointerException ex){
            System.out.println("Matched NullPointerException");
            ex.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Matched ArrayIndexOutOfBoundsException");
            ex.printStackTrace();
        }
        catch(Exception ex){
            System.out.println("Matched Exception");
            ex.printStackTrace();
        }

    }
}
