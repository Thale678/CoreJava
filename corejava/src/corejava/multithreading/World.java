package corejava.multithreading;

public class World extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
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
