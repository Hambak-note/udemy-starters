package week3.day5.online_lecture.multithreading;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello" + name;
    }
}


public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> welcomeFuture =
                executorService.submit(new CallableTask("in28Minutes"));
        System.out.print("\n new CallableTask(\"in28Minutes\")executed");

        String welcomeMessage = welcomeFuture.get();

        System.out.println(welcomeMessage);

        System.out.print("\n Main completed");

    }
}
