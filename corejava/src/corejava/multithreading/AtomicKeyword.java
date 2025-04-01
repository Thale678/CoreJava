package corejava.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Count {

    //to make variable thread safe
    private  AtomicInteger count = new AtomicInteger(0);
    public  void  increment() {
       count.incrementAndGet();
    }
    public  int getCount() {

        //System.out.println("Count : "+count);   
        return count.get();
    }
}




public class AtomicKeyword {

    public static void main(String[] args) throws InterruptedException {
        Count Counter = new Count();
        Thread t1 = new Thread( () -> {
            for (int i = 0; i < 10000; i++) {
Counter.increment();
            }
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i < 10000; i++) {
Counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(Counter.getCount());
    }
    
}
