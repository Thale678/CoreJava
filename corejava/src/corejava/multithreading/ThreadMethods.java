package corejava.multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println("Hello2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        MyThread2 t2 = new MyThread2();
        t.start();
       //t.interrupt();
        t.join();
        t2.start();
        t2.join();
        Thread.sleep(2000);
        //t.join(); //wait for t to terminate
       
        System.out.println("Main Hello");
        
    }
    
}
