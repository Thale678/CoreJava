package corejava.multithreading;


class add{
    private StringBuilder a = new StringBuilder();
    private StringBuilder b = new StringBuilder();

    public synchronized void setA() {
      a.append("a");
        
    }

    public String getA() {
        return a.toString();
    }

    public synchronized void setB() {
        b.append("b");
          
      }
  
      public String getB() {
          return b.toString();
      }
}

class thread extends Thread{

    public void run() {
        add ad = new add();
        for (int i = 0; i < 200000; i++) {
            ad.setB();
    }


}
}
public class ThreadIntExample {
    public static void main(String[] args) throws InterruptedException {
        add ad = new add();
       
         
        Thread t1 = new Thread(() -> {
          
             for (int i = 0; i < 1000000; i++) {
            ad.setA();
            //System.out.println("adding A");
        }
        });

        Thread t2 = new Thread(() -> {
           
             for (int i = 0; i < 1000000; i++) {
             ad.setA();
           // System.out.println("adding A");
        }
        });


        t1.start();
        
       t2.start();

       t1.join();
       t2.join();
      // Thread.sleep(1000);
       
        System.out.println("Values of a : " + ad.getA().length());

        thread t3 = new thread();
        thread t4 = new thread();
        t3.start();
        t4.start(); 
        t3.join();
        t4.join();
        System.out.println("Values of b : " + ad.getB().length());
    
}
}
