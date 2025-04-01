package corejava.multithreading;

public class Counter {
    private long count = 0;
    
    public  void increment() {
        // TODO Auto-generated method stub

        //this method will be called by multiple threads
        //at one time only one thread should be able to execute this method
        //to achieve this, we can use synchronized keyword
        synchronized(this) {
            count++;
        }
       

       // throw new UnsupportedOperationException("Unimplemented method 'increment'");
    }

    public long getCount() {
        return count;
    }

}
