package corejava.multithreading;


class mythread extends Thread {



    private Counter c;
        public mythread(Counter c) {
            this.c = c;       
    }
            @Override
            public void run( ) {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }

}

public class ThreadSync {
    
    public static void main(String[] args) {
        Counter c = new Counter();
        mythread t1 = new mythread(c);
        mythread t2 = new mythread(c);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.getCount());
    }
    
}
