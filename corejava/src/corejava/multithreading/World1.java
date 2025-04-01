package corejava.multithreading;

public class World1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
          
        }
    }
/* 
    public static void main(String args[]) {
        World w = new World();
        w.start();
    }
        */
    
}
