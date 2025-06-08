package corejava.basic;
//Interface is used for abstraction and multiple inheritence

//Interface having abstract methods and static constants
//every abstract method is by default public abstract
//every varibale declared is by default public static final
//Interface can have default and static method also
interface Computer {
	public abstract void code();

	int IP = 123;// every varibale declared is by default public static final
	// You can access it like Computer.IP , no class object is required

	static void run() { // You can access it like Computer.run , no class object is required
		System.out.println("static method");

	}

	default void stop() { // You have to access it using implemented class objects
		this.code();// code method will becalled depending on objects class
		System.out.println("default method method");

	}
}

class laptop implements Computer {

	@Override
	public void code() {
		System.out.println("Starting developer Laptop");

	}

}

class desktop implements Computer {

	@Override
	public void code() {
		System.out.println("Starting developer Desktop");

	}

}

class JK extends Developer {

}

class Developer {
	public void dev(Computer comp) {
		comp.code();

	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer lap = new laptop();
		Computer desk = new desktop();
		Developer dev = new Developer();
		dev.dev(lap);
		dev.dev(desk);
		Computer.run();
		System.out.println(Computer.IP);

		laptop lap1 = new laptop();
		int x = Computer.IP;
		lap1.stop(); // to call defalult mehtod

	}

}
