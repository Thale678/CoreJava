package corejava.multithreading;

public class Multithreading_Runnable {

    public static void main(String[] args) {

World1 w = new World1();
Thread t = new Thread(w);
t.start();

        for(int i=0;i<1000;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
