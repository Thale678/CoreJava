package corejava.multithreading.executer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> c1 = () -> {
           Thread.sleep(500);
           System.out.println("Task 1 Executed");
            return "Task 1";
        };

        Callable<String> c2 = () -> {
            Thread.sleep(500);
            System.out.println("Task 2 Executed");
            return "Task 2";
        };

        Callable<String> c3 = () -> {
            Thread.sleep(500);
            System.out.println("Task 3 Executed");
            return "Task 3";
        };

        List<Future<String>> invokeAll = executor.invokeAll(Arrays.asList(c1, c2, c3),2, TimeUnit.SECONDS);
    //invokeAll.stream()

    
invokeAll.forEach(f -> {
    try {
        System.out.println(f.get());
    } catch (InterruptedException | ExecutionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
});

String invokeAny = executor.invokeAny(Arrays.asList(c1, c2, c3),2, TimeUnit.SECONDS);
  System.out.println("Invoke Any "+invokeAny);
    executor.shutdown();
}
}
