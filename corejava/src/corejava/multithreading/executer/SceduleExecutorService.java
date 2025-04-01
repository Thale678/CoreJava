package corejava.multithreading.executer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SceduleExecutorService {
   
    
public static void main(String[] args) throws InterruptedException { 
ScheduledExecutorService executor = Executors.newScheduledThreadPool(4);

executor.schedule(() -> {
    System.out.println("Task 1");},5,TimeUnit.SECONDS

);

executor.scheduleAtFixedRate(() -> {
    System.out.println("Task 2");
    System.out.println("Task started at: " + System.currentTimeMillis());
try {
    Thread.sleep(2000);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
System.out.println("Task 2.1");},02,2,TimeUnit.SECONDS

);


executor.schedule(() -> {
    System.out.println("Shutting down");
executor.shutdown();},10,TimeUnit.SECONDS

);

}
}
