package week3.day4.online_lecture.multithreading;

class Task1 extends Thread{
    public void run(){
        System.out.print("\n Task1 Started");

        for(int i=101; i <= 199; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n Task1 Done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.print("\n Task2 Started");
        for(int i=201; i <= 299; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n Task2 Done");
    }
}


public class ThreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {
        //Task1
        System.out.print("\n Task1 Kicked Off");
        Task1 task1 = new Task1();
        //task1.run()이라고 작성하면 그냥 보통의 메소드처럼 실행이 된다.
        task1.setPriority(1);
        task1.start();

        System.out.print("\n Task2 Kicked Off");
        //Task2
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();
        task2Thread.setPriority(10);

        //wait for task1 to complete
        task1.join();
        task2Thread.join();

        System.out.print("\n Task3 Kicked Off");
        //Task3
        for(int i=301; i <= 399; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n Task3 Done");
        System.out.print("\n Main Done");
    }
}
