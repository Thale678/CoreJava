package corejava.basic;

class AS extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Obj1");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			;
		}
	}

}

class BX extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Hello Obj2");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS obj1 = new AS();
		BX obj2 = new BX();
		obj2.setPriority(Thread.MAX_PRIORITY);
		// it will call run method inside class
		obj1.start();
		obj2.start();
	}

}
