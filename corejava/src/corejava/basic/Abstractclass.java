package corejava.basic;
//Abstract class can have abstract as well as non abstract methods.But we can define abstract methods 

//inside abstract    class only.Any class extending abstract class that calss have to provde

//implementation of all abstract methods

abstract class Car {
	static{
		System.out.println("Static Block");
	}
	

	public abstract void drive();

	public abstract void repair();

	public void playmusic() {
		System.out.println("Playing Music....");
	}
}

class honda extends Car {

	@Override
	public void drive() {
		System.out.println("Driving Car....");
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'repair'");
	}

}

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new honda();
		// we cannot crate object of abstract class,to access methods of abstract class
		// we have use child class
		obj.playmusic();
		obj.drive();
	}

}
