package corejava.basic;

class mobile {
	public String name;
	public int price;
	static String brand; // static varibale

	// static block to initilize static variables.I will called only once
	static {
		brand = "OPPO";
	}

	public mobile() {

		name = "F6";
		price = 17000;
		// brand = "Nokia";
	}

	public void show() {
		System.out.println(name + "\n" + price + "\n" + brand);
	}

	// In static method we can iuse static varibales directly,but use public
	// variables we have to use object.
	public static void show(mobile obj) {
		System.out.println(obj.name + "\n" + obj.price + "\n" + brand);
	}

}

public class StaticInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mobile m1 = new mobile();
		m1.show();
		m1.name = "V100";
		m1.price = 60000;
		// mobile.brand = "Vivo"; // static variable can accesssed directly with class
		// name,whithout creating instance
		// it will refelcts in all object of class
		mobile m2 = new mobile();
		m2.name = "13";
		m2.price = 55000;
		// mobile.brand = "Oneplus";

		m1.show();
		m2.show();
		// static methods can accesssed directly with class name,whithout creating
		// instance
		mobile.show(m2);
	}

}
