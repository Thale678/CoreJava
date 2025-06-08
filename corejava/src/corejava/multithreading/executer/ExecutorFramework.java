package corejava.multithreading.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class counter{
    private int n = 0;
    public  int factorial(int n){
 int f =1;
       System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;


        
    }

    public int getN() {
        return n;
    }

}
public class ExecutorFramework {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int n = 10;
        counter c = new counter();
       ExecutorService executor = Executors.newFixedThreadPool(4);
    //ExecutorService executor = Executors.newCachedThreadPool();
       
            for (int i = 1; i <= 12; i++) {
                int finali = i;
              executor.submit(() ->{
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Factorial of "+finali+" "+c.factorial(finali));
            });                
                
                  
                
                    }

                    executor.shutdown();
                    executor.awaitTermination(25, TimeUnit.SECONDS);

                    System.out.println("Time taken: "+(System.currentTimeMillis()-startTime));
                    
}
}
