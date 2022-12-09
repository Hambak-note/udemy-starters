package week3.day5.online_lecture.exception_handling;

public class CheckedExceptionRunner {

    public static void main(String[] args) {
       /* try{
            someOtherMethod();
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    */
        //someOtherMethod();

    }

    private static void someOtherMethod2() throws RuntimeException{

    }

    private static void someOtherMethod() throws InterruptedException{
        Thread.sleep(2000);
    }
}
