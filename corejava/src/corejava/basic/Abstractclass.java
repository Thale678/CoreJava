package corejava.basic;
//Abstract class can have abstract as well as non abstract methods.But we can define abstract methods 

//inside abstract    class only.Any class extending abstract class that calss have to provde

//implementation of all abstract methods

abstract class Car {

	public abstract void drive();

	public void playmusic() {
		System.out.println("Playing Music....");
	}
}

class honda extends Car {

	@Override
	public void drive() {
		System.out.println("Driving Car....");
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
