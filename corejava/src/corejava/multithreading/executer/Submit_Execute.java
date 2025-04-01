package corejava.multithreading.executer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import corejava.multithreading.Counter;

class thread extends Thread{

    Counter c;
    public thread(Counter c){
        this.c = c;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            c.increment();
            System.out.println("Count : "+ c.getCount()+" Thread name "+Thread.currentThread().getName());

        }
     
    }
}

public class Submit_Execute {

    private static long timeMillis;

    public static void main(String[] args) throws InterruptedException {
        
//Runnabe is not reurning anything
timeMillis = System.currentTimeMillis();
Runnable r = () -> {
    System.out.println("Thread name Runnable: "+Thread.currentThread().getName());

    };

  r.run();
//Callable is returning something
    Callable<Integer> c = () -> {
        System.out.println("Thread name Callable: "+Thread.currentThread().getName());
        return 10;
    };

   try {
   int i =  c.call();
   System.out.println(i);
} catch (Exception e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
ExecutorService executor = Executors.newFixedThreadPool(1);
executor.execute(r); // It will support only runnable,which is not returning anything
Future<Integer> submit = executor.submit(c); // It will support both runnable/callble,which will return simething.
executor.execute(() -> {System.out.println("Hi Runnable");}); // It will support only runnable,which is not returning anything
executor.submit(() -> {System.out.println("Hi Callable"); return 1;}); // It will support only runnable,which will return simething.
executor.shutdown();


System.out.println("***********************************");
Counter cc = new Counter();
Thread t1 = new thread(cc);

ExecutorService executor1 = Executors.newFixedThreadPool(10);
//executor1.execute(t1);


   // System.out.println("Thread name: "+Thread.currentThread().getName());
    for (int i = 0; i < 10; i++) {
       executor1.submit(t1);
/* 
       executor1.submit(() -> {
           cc.increment();
           System.out.println("Thread name: "+Thread.currentThread().getName());
       });*/
    }



Future<Integer> submit2 = executor1.submit(() ->{ return 1+4;});
try {
    System.out.println("Result : "+submit2.get());
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} catch (ExecutionException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
executor1.shutdown();
executor1.awaitTermination(20, TimeUnit.SECONDS);
System.out.println(cc.getCount());

System.err.println("Time taken: "+(System.currentTimeMillis()-timeMillis));


}
}
