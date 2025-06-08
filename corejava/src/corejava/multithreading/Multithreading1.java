package corejava.multithreading;

public class Multithreading1 {

    public static void main(String[] args) throws InterruptedException {

World w = new World();
w.start();
w.join(); // Wait for the thread to finish before continuing

        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
