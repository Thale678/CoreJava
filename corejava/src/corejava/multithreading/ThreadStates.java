package corejava.multithreading;

public class ThreadStates {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
               System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
       Thread.sleep(1000);
        System.out.println(t.getState());
        Thread.sleep(10000);
        t.join();
        System.out.println(t.getState());
    }
}
